package homework3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Phonebook {
    private Map<String, HashSet<Person>> phonebook = new HashMap<>();

    public void add(Person... personArr){
        for (Person p : personArr){
            add(p);
//            String surname = p.getSurname().toLowerCase().trim();
//
//            HashSet<Person> persons = phonebook.get(surname);
//            if (persons == null) {
//                persons = new HashSet<>();
//                phonebook.put(surname, persons);
//            }
//            persons.add(p);
        }
    }

    public void add(Person p) {
        //приводим к нижнему регистру фамилию и убираем пробелы
        String surname = p.getSurname().toLowerCase().trim();

        HashSet<Person> persons = phonebook.get(surname);
        if (persons == null) {
            persons = new HashSet<>();
            phonebook.put(surname, persons);
        }
        persons.add(p);
    }

    public ArrayList<String> findBySurnameForPhone(String surname) {
        String surnameToSearch = surname.toLowerCase().trim();
        HashSet<Person> people = phonebook.get(surnameToSearch);
        ArrayList<String> phones = new ArrayList<>();
        for (Person p : people) {
            phones.addAll(p.getPhone());
        }
        return phones;
    }

    public ArrayList<String> findBySurnameForEmail(String surname) {
        String surnameToSearch = surname.toLowerCase().trim();
        HashSet<Person> people = phonebook.get(surnameToSearch);
        ArrayList<String> emails = new ArrayList<>();
        for (Person p : people) {
            emails.addAll(p.getEmail());
        }
        return emails;
    }
}