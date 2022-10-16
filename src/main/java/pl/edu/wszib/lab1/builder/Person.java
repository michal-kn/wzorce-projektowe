package pl.edu.wszib.lab1.builder;

import java.sql.SQLOutput;

public class Person {
    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private Address address;

    private Person(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.gender = builder.gender;
        this.age = builder.age;
        this.address = builder.address;
    }

    @Override
    public String toString() {
        return "Name: " + this.firstName
                + "\nLast Name: " + this.lastName
                + "\nGender: " + this.gender
                + "\nAge : " + this.age
                + "\n" + this.address.toString();
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private String gender;
        private int age;
        private Address address;

        public Person build() {
            return new Person(this);
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setAddress(Address address) {
            this.address = address;
            return this;
        }
    }
}
