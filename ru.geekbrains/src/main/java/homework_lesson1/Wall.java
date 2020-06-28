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

    @Override  //переписываем метод для атлета из абстрактного класса
    public boolean move(Actions someone) {
        System.out.println(super.getName() + " Высота барьера: " + length);
        someone.jump();
        if (getLength() <= someone.getHieghtJump()){
            System.out.println("Перепрыгнул");
            return true;
        }
        System.out.println("Не перепрыгнул");
        return false;
    }
}