package homework_lesson1;

public class Human implements Actions {

    private String name;
    private int runDistance;
    private double hieghtJump;

    public Human(String name, int distance, double hieghtJump){
        this.name = name;
        this.runDistance = distance;
        this.hieghtJump = hieghtJump;
    }

    @Override   //переписываем метод из интерфейса
    public void jump() {
        System.out.println("Человек " +  this.name + " Прыгнул");
    }

    @Override   //переписываем метод из интерфейса
    public void run() {
        System.out.println("Человек " +  this.name + " Побежал");
    }

    public int getDistance(){        // передаем дистанцию атлета
        return this.runDistance;
    }

    public double getHieghtJump(){   // передаем высоту прыжка атлета
        return this.hieghtJump;
    }
}