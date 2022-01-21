package blog.softwaretester.couplers.middleman;

public record Customer(String name, Address address) {
    public String getCity() {
        return address.city();
    }

    public String getStreet() {
        return address.street();
    }

    record Address(String street, String city) {
    }
}
