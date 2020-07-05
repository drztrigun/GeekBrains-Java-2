package homework3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook{

    private Map<String, Person> book = new HashMap<>();

    public void add(Person p) {
        book.put(p.getSurname(), p);
    }

    List<String> findBySurnameForPhone (String surname){
        return phone;
    }

    List<Person> findBySurnameForEmail (String surname){
        return emails;
    }

}