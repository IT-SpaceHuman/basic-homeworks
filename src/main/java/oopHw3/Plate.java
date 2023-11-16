package oopHw3;

public class Plate {
    private int maxFood;
    private int currentFood;

    Plate(int maxFood) {
        this.maxFood = maxFood;
        this.currentFood = maxFood;
    }
    public void addFood(int food) {
        if (food > maxFood || food + currentFood > maxFood) {
            System.out.println("Вы положили слишком много еды");
            return;
        }
        currentFood += food;
        System.out.println("Вы добавили еду");
    }

    public boolean decreaseFood(int food) {
        if (currentFood > food && food > 0) {
            currentFood -= food;
            return true;
        }
        return false;
    }
}