package oopHW1;

public class Box {
    private int length;
    private int width;
    private int height;
    private String color;
    private String item;

    private boolean isOpen;

    public int getLength(){

        return length;
    }

    public int getWidth(){

        return width;
    }

    public int getHeight(){

        return height;
    }

    public String getColor(){

        return color;
    }

    public void setColor(){
        this.color = color;
        System.out.println("Цвет коробки изменен");
    }

    Box(int length, int width, int height, String color){
        this.length = length;
        this.width = width;
        this.height = height;
        this.color = color;
        this.isOpen = true;
    }

    public void aboutBox(){
        System.out.println("Размеры коробки: " + length + "*" + width + "*" + height + "\n"
                + "Цвет коробки:" + color);
    }

    public void openBox(){
        if(isOpen){
            System.out.println("Коробка итак открыта");
        }else {
            System.out.println("Коробка открыта");
            this.isOpen = true;
        }
    }

    public void closeBox(){
        if (isOpen){
            System.out.println("Коробка закрыта");
            this.isOpen = false;
        } else{
            System.out.println("Коробка итак закрыта");
        }
    }

    public void put(String item){
        if(!isOpen){
            System.out.println("Коробка закрыта");
            return;
        }
        if (this.item != null){
            System.out.println("Коробка не пуста");
            return;
        }
        this.item = item;
        System.out.println("Предмет в коробке!");
    }

    public void takeOut(String item) {
        if(!isOpen){
            System.out.println("Коробка закрыта");
            return;
        }
        if(this.item == null){
            System.out.println("Коробка пуста");
            return;
        }
        if(this.item != null){
            System.out.println("Достаем предмет из коробки");
        }
    }
}