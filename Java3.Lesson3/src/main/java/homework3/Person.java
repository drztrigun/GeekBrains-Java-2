package homework3;


import java.util.ArrayList;
import java.util.HashSet;

public class Person extends HashSet<Person> {

    private String surname;
    private ArrayList<String> phone;
    private ArrayList<String> email;

    public Person(String surname, String phone, String email) {
        this.surname = surname;
        this.phone = new ArrayList<>();
        this.phone.add(phone);
        this.email = new ArrayList<>();
        this.email.add(email);

    }
    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public ArrayList<String> getPhone(){

        return phone;
    }

    public void setPhone(ArrayList<String> phone){
        this.phone = phone;
    }

    public ArrayList<String> getEmail(){

        return email;
    }
    public void setEmail(ArrayList<String> email){
        this.email = email;
    }

//    public String toString(){
//        return surname + phone + email;
//    }
}