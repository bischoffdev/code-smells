package bloaters.dataclumps;

public class Customer {
    private final String lastName;
    private final String firstName;
    private final String middleName;
    private final String salutation;
    private final String suffix;
    private final String streetAddress;
    private final String city;
    private final String state;
    private final boolean isEmployed;
    private final boolean isHomeOwner;

    public Customer(
            String lastName, String firstName, String middleName, String salutation,
            String suffix, String streetAddress, String city, String state,
            boolean isEmployed, boolean isHomeOwner) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.salutation = salutation;
        this.suffix = suffix;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.isEmployed = isEmployed;
        this.isHomeOwner = isHomeOwner;
    }
}
