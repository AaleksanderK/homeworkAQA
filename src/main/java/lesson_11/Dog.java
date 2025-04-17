package lesson_11;

public class Dog extends Animal {
    private static final int MAX_RUN_DISTANCE = 500;
    private static final int MAX_SWIM_DISTANCE = 10;
    private static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println(name + " пробежала " + distance + " м");
        } else {
            System.out.println(name + " не может пробежать больше " + MAX_RUN_DISTANCE + " м");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= MAX_SWIM_DISTANCE) {
            System.out.println(name + " проплыла " + distance + " м");
        } else {
            System.out.println(name + " не может проплыть больше " + MAX_SWIM_DISTANCE + " м");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}
