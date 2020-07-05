package homework3;
  /*   1. Создать массив с набором слов (20-30 слов, должны встречаться повторяющиеся):
            Найти список слов, из которых состоит текст (дубликаты не считать);
            Посчитать сколько раз встречается каждое слово (использовать HashMap);
         2. Написать простой класс PhoneBook(внутри использовать HashMap):
            В качестве ключа использовать фамилию
            В каждой записи всего два поля: phone, e-mail
            Отдельный метод для поиска номера телефона по фамилии (ввели фамилию, получили ArrayList телефонов),
            и отдельный метод для поиска e-mail по фамилии.
            Следует учесть, что под одной фамилией может быть несколько записей.
            Итого должно получиться 3 класса Main, PhoneBook, Person.
     */

import java.util.*;

public class MainClass {

    public static void main (String[] args){
        // создаем строку
        String[] name = {"Igor", "Sasha", "Artem", "Denis", "Natasha", "Artem", "Andrei", "Sasha", "Alex", "Vlad",
                "Vika", "Valay", "Lesha", "Nikita", "Artem", "Vika", "Dasha", "Fedor", "Alex", "Artem"};
        str(name);


        add("Petrov", "8-495-785-85-21", "8521@mail.ru");
        add("Sidorov", "8-495-785-85-22", "8522@mail.ru");
        add("Rebrov", "8-495-785-85-23", "8523@mail.ru");
        add("Petrov", "8-495-785-85-24", "8524@mail.ru");
        add("Ivanov", "8-495-785-85-25", "8525@mail.ru");
        add("Jukov", "8-495-785-85-26", "8526@mail.ru");
        add("Strelcov", "8-495-785-85-27", "8527@mail.ru");
        add("Ivanov", "8-495-785-85-28", "8528@mail.ru");
        add("Petrov", "8-495-785-85-29", "8529@mail.ru");
        add("Losckov", "8-495-785-85-30", "8530@mail.ru");


    }

    public static void add(String surname, String phone, String email){
        Phonebook.add();
    }

    public static void str(String[] name) {
        // создаем Set и добавляем все элементы строки в Set
        HashSet<String> setName = new HashSet<>();
        setName.addAll(Arrays.asList(name));
        // печатаем все уникальные значеничя, исключяя повторения
        System.out.println(setName);
        // создаем Hashmap для подсчета сколько раз встречаются слова в строке
        HashMap<String, Integer> mapName = new HashMap<>();
        // идем по циклу и делаем подсчет количества повтояремых слов
        for (String key : name) {
            mapName.put(key,mapName.getOrDefault(key, 0) + 1);
            // использыем метод getOrDefault для возвращения значения о нахождении повторяющихся слов
        }
        // вывод
        System.out.println(mapName);
    }
}
