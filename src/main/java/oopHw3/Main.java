package oopHw3;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(1000);
        Cat[] cats = {
                new Cat("Басик", 100),
                new Cat("Буся", 100),
                new Cat("Мурка", 100)
        };
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            cats[i].info();
        }
    }
}