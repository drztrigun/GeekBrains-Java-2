package homework_lesson1;

public class Cat implements Actions {

    private String name;
    private int runDistance;
    private double hieghtJump;

    public Cat(String name, int distance, double hieghtJump){
        this.name = name;
        this.runDistance = distance;
        this.hieghtJump = hieghtJump;
    }

    @Override    //переписываем метод из интерфейса
    public void jump() {
        System.out.println("Кот " +  name + " Прыгнул");
    }

    @Override   //переписываем метод из интерфейса
    public void run() {
        System.out.println("Кот " +  name + " Побежал");
    }

    @Override
    public int getDistance(){        // передаем дистанцию атлета
        return this.runDistance;
    }

    @Override
    public double getHieghtJump(){   // передаем высоту прыжка атлета
        return this.hieghtJump;
    }
}