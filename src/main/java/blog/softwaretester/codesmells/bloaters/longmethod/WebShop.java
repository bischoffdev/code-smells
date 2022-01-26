package blog.softwaretester.codesmells.bloaters.longmethod;

import java.util.ArrayList;
import java.util.List;

public class WebShop {
    private final List<Customer> customers = new ArrayList<>();

    public String saveCustomer(final Customer customer) {
        customers.add(customer);
        return String.format("""
                <table><tr><td>Name: %s</td></tr></table>
                """, customer.name());
    }

    record Customer(String name) {
    }
}