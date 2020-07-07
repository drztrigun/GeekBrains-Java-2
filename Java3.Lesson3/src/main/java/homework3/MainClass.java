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


        Person person1 = new Person("Petrov", "8-495-785-85-21", "8521@mail.ru");
        Person person2 = new Person("Sidorov", "8-495-785-85-22", "8522@mail.ru");
        Person person3 = new Person("Rebrov", "8-495-785-85-23", "8523@mail.ru");
        Person person4 = new Person("Petrov", "8-495-785-85-24", "8524@mail.ru");
        Person person5 = new Person("Ivanov", "8-495-785-85-25", "8525@mail.ru");
        Person person6 = new Person("Jukov", "8-495-785-85-26", "8526@mail.ru");
        Person person7 = new Person("Strelcov", "8-495-785-85-27", "8527@mail.ru");
        Person person8 = new Person("Ivanov", "8-495-785-85-28", "8528@mail.ru");
        Person person9 = new Person("Petrov", "8-495-785-85-29", "8529@mail.ru");
        Person person10 = new Person("Losckov", "8-495-785-85-30", "8530@mail.ru");

        Phonebook phonebook = new Phonebook();
        phonebook.add(person1, person2, person3, person4, person5, person6, person7, person8, person9, person10);
        System.out.println(phonebook.findBySurnameForEmail("Petrov"));
        System.out.println(phonebook.findBySurnameForPhone("Petrov"));
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
