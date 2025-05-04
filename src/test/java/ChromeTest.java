
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChromeTest {

    WebDriver driver;
    WebDriverWait webDriverWait;

    @BeforeAll
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setupTest() {
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://www.mts.by/");
        if (driver.findElement(By.id("cookie-agree")).isDisplayed()) {
            driver.findElement(By.id("cookie-agree")).click();
        }
    }

    @AfterEach
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void shouldHaveCorrectPaymentBlockTitle() {

        driver.get("https://www.mts.by");

        String onlinePaymentTitle = driver.findElement(By.xpath("//h2[contains(.,'Онлайн пополнение')]"))
                .getText().replaceAll("\n", " ");
        assertEquals("Онлайн пополнение без комиссии", onlinePaymentTitle, "не правильное название элемента");

    }

    @Test
    public void checkingLogos() {
        driver.get("https://www.mts.by");
        List<WebElement> elementList = driver.findElements(By.xpath("//img[contains(@src, '/pay')]"));
        for (WebElement img :
                elementList) {
            assertTrue(img.isDisplayed(), "Логотипы отсутствуют");
        }
    }

    @Test
    public void CheckMoreAboutServices() {
        String expectedURL = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
        driver.findElement(By.xpath("//a[contains(.,'Подробнее о сервисе')]")).click();
        assertEquals(expectedURL, driver.getCurrentUrl());
    }

    @Test
    public void CheckingContinueButton() {
        driver.findElement(By.id("connection-phone")).sendKeys("297777777");
        driver.findElement(By.id("connection-sum")).sendKeys("2");
        driver.findElement(By.xpath("//button[contains(.,'Продолжить')][1]")).click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@class='bepaid-app']")));
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='bepaid-iframe']")));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@class='app-wrapper__content']")));
    }
}