package homework_lesson1;

// создаем абстрактный класс для
public abstract class Barrier {

    private String name;

    public Barrier(String name) {
        this.name = name;
    }

    //создаем методы для наших атлетов
    public abstract boolean move(Human human);

    public abstract boolean move(Cat cat);

    public abstract boolean move(Robot robot);

    protected String getName(){   //передаем имя
        return name;
    }

}