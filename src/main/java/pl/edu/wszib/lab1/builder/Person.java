package pl.edu.wszib.lab1.builder;

public class Person {
    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private Address address;

    private Person() {

    }

    public static class Builder {
        public Person build() {
            return new Person();
        }

    }
}
