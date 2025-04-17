package lesson_11;

public interface Shape {
    double getArea();

    String getFillColor();

    String getBorderColor();

    default double getPerimeter() {
        return 0;
    }

    default void printInfo() {
        System.out.println("Площадь: " + getArea());
        System.out.println("Периметр: " + getPerimeter());
        System.out.println("Цвет фона: " + getFillColor());
        System.out.println("Цвет границ: " + getBorderColor());

    }

}
