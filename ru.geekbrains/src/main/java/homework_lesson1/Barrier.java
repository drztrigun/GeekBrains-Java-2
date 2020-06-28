package homework_lesson1;

// создаем абстрактный класс для препятствий
public abstract class Barrier {

    private String name;

    public Barrier(String name) {
        this.name = name;
    }

    //создаем методы для наших атлетов
    public abstract boolean move(Actions someone);

    protected String getName(){   //передаем имя
        return name;
    }

}