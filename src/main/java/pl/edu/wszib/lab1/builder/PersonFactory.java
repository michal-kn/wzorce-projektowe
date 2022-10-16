package pl.edu.wszib.lab1.builder;

public class PersonFactory {

    public static Person createPerson(
            final String gender,
            final String name,
            final String lastName,
            final int age,
            final Address address) {

        if (gender.equalsIgnoreCase("male")) {
            return new Person.Builder()
                    .setGender("male")
                    .setFirstName(name)
                    .setLastName(lastName)
                    .setAge(age)
                    .setAddress(address)
                    .build();
        }

        if (gender.equalsIgnoreCase("female")) {
            return new Person.Builder()
                    .setGender("female")
                    .setFirstName(name)
                    .setLastName(lastName)
                    .setAge(age)
                    .setAddress(address)
                    .build();
        }

        throw new IllegalStateException("Please specify correct gender");
    }

    public static Person female(
            final String name,
            final String lastName,
            final int age,
            final Address address) {

        return new Person.Builder()
                .setGender("female")
                .setFirstName(name)
                .setLastName(lastName)
                .setAge(age)
                .setAddress(address)
                .build();
    }

    public static Person male(
            final String name,
            final String lastName,
            final int age,
            final Address address) {

        return new Person.Builder()
                .setGender("male")
                .setFirstName(name)
                .setLastName(lastName)
                .setAge(age)
                .setAddress(address)
                .build();
    }
}
