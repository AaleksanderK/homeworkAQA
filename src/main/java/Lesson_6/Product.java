package Lesson_6;

public class Product {
    private String name;
    private int date;
    private String producer;
    private String country;
    private int price;
    private boolean booking;

    Product(String name, int date, String producer, String country, int price, boolean booking) {
        this.name = name;
        this.date = date;
        this.producer = producer;
        this.country = country;
        this.price = price;
        this.booking = booking;
    }


    public void getInfo() {
        System.out.println("name:" + name +
                "\ndate:" + date +
                "\nproducer:" + producer +
                "\ncountry:" + country +
                "\nprice:" + price +
                "\nbooking:" + booking);
    }
}
