package homework_lesson1;

     //класс стена
public class Wall extends Barrier {

    private double length;

    public Wall(String name, double length) {
        super(name);
        this.length = length;
    }

    protected double getLength() {
        return this.length;
    }

    @Override  //переписываем метод для человека из абстрактного класса
    public boolean move(Human human) {
        System.out.println(super.getName() + " Высота барьера: " + length);
        human.jump();
        if (getLength() <= human.getHieghtJump()){
            System.out.println("Перепрыгнул");
            return true;
        }
        System.out.println("Не перепрыгнул");
        return false;
    }

    @Override   //переписываем метод для кота из абстрактного класса
    public boolean move(Cat cat) {
        System.out.println(super.getName() + " Высота барьера: " + length);
        cat.jump();
        if (getLength() <= cat.getHieghtJump()){
            System.out.println("Перепрыгнул");
            return true;
        }
        System.out.println("Не перепрыгнул");
        return false;
    }

    @Override  //переписываем метод для робота из абстрактного класса
    public boolean move(Robot robot) {
        System.out.println(super.getName() + " Высота барьера: " + length);
        robot.jump();
        if (getLength() <= robot.getHieghtJump()){
            System.out.println("Перепрыгнул");
            return true;
        }
        System.out.println("Не перепрыгнул");
        return false;
    }
}