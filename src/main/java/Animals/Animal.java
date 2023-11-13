package Animals;

public abstract class Animal {
    String name;
    int speedRun;

    int speedSwim;
    int endurance;

    public Animal(String name, int speedRun, int speedSwim, int endurance) {
        this.name = name;
        this.speedRun = speedRun;
        this.speedSwim = speedSwim;
        this.endurance = endurance;
    }

    public String getName(){

        return name;
    }

    public int getSpeedRun(){

        return speedRun;
    }

    public int getSpeedSwim(){

        return speedSwim;
    }

    public int getEndurance(){

        return endurance;
    }

    public int run(int distance) {
        if(endurance < distance){
            System.out.println("Животное устало и не может больше бежать");
            return -1;
        }
        if(speedRun > 0){
            System.out.println("Животное пробегает " + distance + "м за "
                    + distance/speedRun + " секунд");
            endurance -= distance;
            return distance / speedRun;
        }

        System.out.println("Не может быть отрицательной скорости");
        return -1;
    }

    public abstract int swim(int distance);

    public void info(){
        System.out.println("Животное: " + name + ", выносливость: " + endurance );
    }
}
