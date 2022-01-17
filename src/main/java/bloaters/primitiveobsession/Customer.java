package bloaters.primitiveobsession;

public class Customer {
    private String name;
    private String address;
    private String city;
    private String zipCode;
    private String country;

    public Customer(String name, String address, String city, String zipCode, String country) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.zipCode = zipCode;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCountry() {
        return country;
    }

}
