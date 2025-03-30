package Lesson_6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product productOne = new Product("Iphone X", 2020, "Apple", "USA", 1000, true);
        productOne.getInfo();

        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Iphone 16", 2025, "Apple", "USA", 1000, true);
        productsArray[1] = new Product("Iphone 15", 2024, "Apple", "USA", 1000, true);
        productsArray[2] = new Product("Iphone 14", 2023, "Apple", "USA", 1000, true);
        productsArray[3] = new Product("Iphone 13", 2022, "Apple", "USA", 1000, true);
        productsArray[4] = new Product("Iphone 12", 2021, "Apple", "USA", 1000, true);


        Park disney = new Park("Disney");
        disney.addAttraction("Space Mountain", "10:00 - 20:00", 10);
        disney.addAttraction("Pirates of the Caribbean", "09:00 - 19:30", 100);
        disney.addAttraction("Haunted Mansion", "10:30 - 18:45", 10);
        disney.displayAttractions();


    }

}
