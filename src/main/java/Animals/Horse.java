package Animals;

public class Horse extends Animal{
    Horse(String name, int speedRun, int speedSwim, int endurance){
        super(name,speedRun,speedSwim,endurance);
    }

    @Override
    public int swim(int distance) {
        int sufficientEndurance = distance * 4;

        if(endurance < sufficientEndurance){
            System.out.println("Собака " + name + " устала и не может больше плыть");
            return -1;
        }

        if(speedSwim > 0){
            int time = distance / speedSwim;
            System.out.println("Собака " + name + " проплывает " + distance + "м, за "
                    + time + " сек");
            return time;
        }

        System.out.println("Скорость не может быть мменьше нуля");
        return -1;
    }
}