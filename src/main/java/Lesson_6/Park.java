package Lesson_6;

import java.util.ArrayList;
import java.util.List;

public class Park {
    private String parkName;
    private List<Attraction> attractions;

    public Park(String parkName) {
        this.parkName = parkName;
        this.attractions = new ArrayList<>();
    }

    public class Attraction {
        private String name;
        private String working;
        private int price;

        public Attraction(String name, String working, int price) {
            this.name = name;
            this.working = working;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Attraction: " + name +
                    ", Working Hours: " + working +
                    ", Price: " + price;
        }
    }

    public void addAttraction(String name, String hours, int price) {
        Attraction newAttraction = new Attraction(name, hours, price);
        attractions.add(newAttraction);
    }

    public void displayAttractions() {
        System.out.println("Park: " + parkName);
        for (Attraction attraction : attractions) {
            System.out.println(attraction);
        }
    }

}
