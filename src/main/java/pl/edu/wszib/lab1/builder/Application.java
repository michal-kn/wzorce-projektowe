package pl.edu.wszib.lab1.builder;

public class Application {

    public static void main(String[] args) {

        Address address =  new Address.Builder()
                .setCity("Krakow")
                .setStreet("abcde")
                .setHouseNumber("22")
                .setPostCode("00-200")
                .build();

        Person person = new Person.Builder()
                .setFirstName("Michal")
                .setLastName("Knapczyk")
                .setAge(22)
                .setGender("male")
                .setAddress(address)
                .build();

        Person personTwo = PersonFactory.createPerson(
                "male",
                "Piotr",
                "Kowalski",
                30,
                address);

        Person personThree = PersonFactory.createPerson(
                "female",
                "Anna",
                "Maria",
                45,
                address);

        Person personReady = PersonFactory.male(
                "Grzegorz",
                "Abcde",
                99,
                address);

        System.out.println(person);
        System.out.println();
        System.out.println(personTwo);
        System.out.println();
        System.out.println(personThree);
        System.out.println();
        System.out.println(personReady);
    }
}
