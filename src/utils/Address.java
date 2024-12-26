package utils;

import java.util.Optional;

public class Address {
    private String city;
    private String street;

    public Address(String city) {
        this.city = city;
    }


    public Address() {
    }

    public String getCity() {
        return city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Optional<String> getStreet() {
        return Optional.ofNullable(street);
    }
}
