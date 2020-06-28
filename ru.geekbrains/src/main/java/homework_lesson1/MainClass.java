package homework_lesson1;

     /* 1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
           Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
        2. Создайте два класса: беговая дорожка и стена, при прохождении через которые,
           участники должны выполнять соответствующие действия(бежать или прыгать),
           результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
        3. Создайте два массива: с участниками и препятствиями,
           и заставьте всех участников пройти этот набор препятствий.
        4. *У препятствий есть длина (для дорожки) или высота (для стены),
           а участников ограничения на бег и прыжки. Если участник не смог пройти одно из препятствий,
           то дальше по списку он препятствий не идет.
      */

import java.util.Random;

public class MainClass {

    public static void main(String[] args) {

        // создаем рандом для заполнения дистанции и высоты прыжка для атлетов
        Random random = new Random();
        // создаем массив из участников
        Actions[] athletes = new Actions[6];

        int distance = random.nextInt(1000);
        double hieghtJump = random.nextDouble() * 3;
        athletes[0] = new Human("Алексей", distance, hieghtJump);

        distance = random.nextInt(1000);
        hieghtJump = random.nextDouble() * 3;
        athletes[1] = new Human("Михаил", distance, hieghtJump);

        distance = random.nextInt(500);
        hieghtJump = random.nextDouble() * 8;
        athletes[2] = new Cat("Барсик", distance, hieghtJump);

        distance = random.nextInt(500);
        hieghtJump = random.nextDouble() * 8;
        athletes[3] = new Cat("Лев", distance, hieghtJump);

        distance = random.nextInt(1500);
        hieghtJump = random.nextDouble() * 10;
        athletes[4] = new Robot("Радион", distance, hieghtJump);

        distance = random.nextInt(1500);
        hieghtJump = random.nextDouble() * 10;
        athletes[5] = new Robot("Joe", distance, hieghtJump);

        //создаем массив препятствий
        Barrier[] barriers = new Barrier[4];
        for (int i = 0; i < barriers.length; i++) {
            if (i % 2 == 0) {
                double length = 400;        // задаем величину круга, по идее можно вынести в отделбный метод
                if (i == 2){
                    length = length * 1.5;  // увеличваем дистанцию для второго круга
                }
                barriers[i] = new Treadmill("Препядствие №" + (i + 1), length); //передаем значение длины круга
            } else {
                double length = 1.5;        // задаем высоту барьера, по идее можно вынести в отделбный метод
                if (i == 3){
                    length = length + 0.5;  // увеличваем высоту для второго барьера
                }
                barriers[i] = new Wall("Препядствие №" + (i + 1), length);     //передаем значение высоты
            }
        }

        for (int i = 0; i < athletes.length; i++) {
            boolean result = true;   // задаем переменную result для прохождения препядствий
            for (int j = 0; j < barriers.length; j++) {
                if (athletes[i] instanceof Human) {
                    result = barriers[j].move(athletes[i]);
                }
                if (athletes[i] instanceof Cat) {
                    result = barriers[j].move(athletes[i]);
                }
                if (athletes[i] instanceof Robot) {
                    result = barriers[j].move(athletes[i]);
                }
                if (!result) {      //условие если не пройдено хоть одно препядствие, то выход из цикла
                    break;
                }
            }
        }
    }
}