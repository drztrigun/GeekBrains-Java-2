package homework_lesson1;

public class Robot implements Actions {

    private String name;
    private int runDistance;
    private double jumpHeight;

    public Robot(String name, int distance, double jumpHeight){
        this.name = name;
        this.runDistance = distance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void jump() {
        System.out.println(this.name + " Прыгнул");
    }

    @Override
    public void run() {
        System.out.println(this.name + " Побежал");
    }

    @Override
    public int getDistance(){
        return this.runDistance;
    }

    @Override
    public double getHieghtJump(){
        return this.jumpHeight;
    }
}