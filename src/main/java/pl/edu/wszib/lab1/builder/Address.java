package pl.edu.wszib.lab1.builder;

public class Address {
    private String city;
    private String street;
    private String houseNumber;
    private String postCode;

    private Address(Builder builder) {
        this.city = builder.city;
        this.street = builder.street;
        this.houseNumber = builder.houseNumber;
        this.postCode = builder.postCode;
    }

    public static class Builder {
        private String city;
        private String street;
        private String houseNumber;
        private String postCode;

        public Address build() {
            return new Address(this);
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setStreet(String street) {
            this.street = street;
            return this;
        }

        public Builder setHouseNumber(String houseNumber) {
            this.houseNumber = houseNumber;
            return this;
        }

        public Builder setPostCode(String postCode) {
            this.postCode = postCode;
            return this;
        }

    }

}
