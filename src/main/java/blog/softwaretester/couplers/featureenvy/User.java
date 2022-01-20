package blog.softwaretester.couplers.featureenvy;

public class User {

    private final Address address;

    public String getAddress() {
        return address.getStreet() + ", " + address.getCity();
    }

    private User(Address address) {
        this.address = address;
    }
}

class Address {
    private final String street;
    private final String city;

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }
}
