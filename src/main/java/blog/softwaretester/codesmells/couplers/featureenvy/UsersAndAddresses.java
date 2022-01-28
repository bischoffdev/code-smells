package blog.softwaretester.codesmells.couplers.featureenvy;

public class UsersAndAddresses {

    record User(Address address) {
        public String getAddressString() {
            return address.street()
                    + ", " + address.city()
                    + ", " + address.country();
        }
    }

    record Address(String street, String city, String country) {
    }
}