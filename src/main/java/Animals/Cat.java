package Animals;

public class Cat extends Animal{

    Cat(String name, int speedRun, int speedSwim, int endurance){
        super(name,speedRun,speedSwim,endurance);
    }

    @Override
    public int swim(int distance) {
        System.out.println("Кошка " + name + " не умеет плавать." );
        return -1;
    }
}