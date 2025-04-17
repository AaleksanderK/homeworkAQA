package lesson_11;

public class Bowl {
    private int foodAmount;

    public Bowl(int foodAmount) {
        this.foodAmount = Math.max(foodAmount, 0);
    }

    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
            System.out.println("Добавлено еды " + amount + ", еды всего" + foodAmount);
        } else System.out.println("Нельзя добавить отрицательное количество еды");
    }

    public boolean decreaseFood(int amount) {
        if (foodAmount >= amount && amount > 0) {
            foodAmount -= amount;
            System.out.println("Из миски съели " + amount + " еды. Осталось: " + foodAmount);
            return true;
        } else {
            System.out.println("В миске недостаточно еды! (" + foodAmount + " < " + amount + ")");
            return false;
        }
    }

    public int getFoodAmount() {
        return foodAmount;
    }
}
