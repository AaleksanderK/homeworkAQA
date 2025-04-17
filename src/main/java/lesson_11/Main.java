package lesson_11;

public class Main {
    public static void main(String[] args) {
        Cat catOne = new Cat("Кот");
        Dog dogOne = new Dog("Собака");

        catOne.run(150);
        catOne.run(250);
        catOne.swim(5);

        dogOne.run(400);
        dogOne.run(666);
        dogOne.swim(5);
        dogOne.swim(15);


        Bowl bowl = new Bowl(30);
        Cat[] cats = {
                new Cat("кот1"),
                new Cat("кот2"),
                new Cat("кот3"),
                new Cat("кот4")
        };
        for (Cat cat : cats) {
            cat.eat(bowl, 10);
        }
        System.out.println("Состояние котов:");
        for (Cat cat : cats) {
            System.out.println(cat.name + ": " + (cat.isFull() ? "сыт" : "голоден"));
        }
        bowl.addFood(20);

        System.out.println("кормим голодных котов снова:");
        for (Cat cat : cats) {
            if (!cat.isFull()) {
                cat.eat(bowl, 10);
            }
        }
        System.out.println("Остаток еды в миске: " + bowl.getFoodAmount());

        System.out.println("Всего животных " + Animal.getAnimalCount());
        System.out.println("Всего котов " + Cat.getCatCount());
        System.out.println("Всего собак " + Dog.getDogCount());


        Shape circle = new Circle(5, "Красный", "Чёрный");
        Shape rectangle = new Rectangle(4, 6, "Синий", "Белый");
        Shape triangle = new Triangle(3, 4, 5, "Зелёный", "Жёлтый");

        System.out.println("Круг");
        circle.printInfo();

        System.out.println("Прямоугольник");
        rectangle.printInfo();

        System.out.println("Треугольник");
        triangle.printInfo();
    }
}
