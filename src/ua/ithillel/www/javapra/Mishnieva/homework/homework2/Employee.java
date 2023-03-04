package ua.ithillel.www.javapra.Mishnieva.homework.homework2;

public class Employee {
    private String completeName;
    private String position;
    private String email;
    private String telephone;
    private int age;


    public Employee(String completeName, String position, String email, String telephone, int age) {
        this.completeName = completeName;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.age = age;
    }

    public String getCompleteName() {
        return completeName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public int getAge() {
        return age;
    }
}
