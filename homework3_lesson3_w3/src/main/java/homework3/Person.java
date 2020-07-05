package homework3;

public class Person {

    private String surname;
    private String phone;
    private String email;

    public Person(String surname, String phone, String email) {
        this.surname = surname;
        this.phone = phone;
        this.email = email;
    }
    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String toString(){
        return surname + phone + email;
    }
}

