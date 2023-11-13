package Animals;

public class Main {
    public static void main(String[] args) {
        Cat c = new Cat("Буся", 60, 0, 1000);
        Dog d = new Dog("Шарик", 60, 45, 1000);
        Horse h = new Horse("Буран", 80, 45, 1000);
        c.info();
        d.info();
        h.info();
        c.run(700);
        d.run(700);
        h.run(700);
        c.swim(800);
        d.swim(800);
        h.swim(800);
        c.info();
        d.info();
        h.info();
    }
}