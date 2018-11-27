package serialization;

import java.io.Serializable;

public class Person implements Serializable {

    String firstName;
    transient String lastName;
    static String city;
    static final String country="1";
    transient static String phone;
    final String car;
    final transient int salary=1;
//    String company;

    public Person(String firstName, String lastName, String phone, String city,String car ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.car = car;
        this.city = city;
       // this.salary = salary;


    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", transient lastName='" + lastName + '\'' +
                ",  transient static phone='" + phone + '\'' +
                ", static city='" + city + '\'' +
                ", final car='" + car + '\'' +
                ", static final country='" + country + '\'' +
                ",  final transient salary='" + salary + '\'' +
                '}';
    }
}
