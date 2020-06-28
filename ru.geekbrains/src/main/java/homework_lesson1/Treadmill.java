package homework_lesson1;

       //класс беговая дорожка
public class Treadmill extends Barrier {

    private double length;

    public Treadmill(String name, double length) {
        super(name);
        this.length = length;
    }

    public double getLength() {
            return length;
        }

    @Override   //переписываем метод для человека из абстрактного класса
    public boolean move(Human human) {
        System.out.println(super.getName() + " Длина дорожки: " + length);
        human.run();
        if (getLength() <= human.getDistance()){
            System.out.println("Пробежал");
            return true;
        }
        System.out.println("Не пробежал");
        return false;
    }

    @Override  //переписываем метод для кота из абстрактного класса
    public boolean move(Cat cat) {
        System.out.println(super.getName() + " Длина дорожки: " + length);
        cat.run();
        if (getLength() <= cat.getDistance()){
            System.out.println("Пробежал");
            return true;
        }
        System.out.println("Не пробежал");
        return false;
    }

    @Override  //переписываем метод для робота из абстрактного класса
    public boolean move(Robot robot) {
        System.out.println(super.getName() + " Длина дорожки: " + length);
        robot.run();
        if (getLength() <= robot.getDistance()){
            System.out.println("Пробежал");
            return true;
        }
        System.out.println("Не пробежал");
        return false;
    }
}