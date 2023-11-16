package oopHw3;

public class Cat {
    private String name;
    private int appetite;
    private boolean isHungry;

    Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        this.isHungry = true;
    }

    public void info(){
        System.out.println(name + ", сытость: " + isHungry +".");
    }

    public boolean eat(Plate plate){
        if(isHungry && plate.decreaseFood(appetite)){
            isHungry = false;
            return true;
        }
        return false;
    }
}


