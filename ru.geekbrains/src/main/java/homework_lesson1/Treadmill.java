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

    @Override   //переписываем метод для атлета из абстрактного класса
    public boolean move(Actions someone) {
        System.out.println(super.getName() + " Длина дорожки: " + length);
        someone.run();
        if (getLength() <= someone.getDistance()){
            System.out.println("Пробежал");
            return true;
        }
        System.out.println("Не пробежал");
        return false;
    }
}