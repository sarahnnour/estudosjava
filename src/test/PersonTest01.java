package test;

import dominio.Person;

public class PersonTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Sarah");
        person.setAge(17);

        System.out.println(person.getName());
    }
}
