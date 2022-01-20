package blog.softwaretester.bloaters.longmethod;

import java.util.ArrayList;
import java.util.List;

public class WebShop {
    private List<Customer> customers = new ArrayList<>();

    public String saveCustomer(final Customer customer) {
        customers.add(customer);
        return String.format("""
                <table>
                    <tr>Name</tr>
                    <td>%s</td>
                </table>
                """, customer.name);
    }

    private static class Customer {
        private String name;
    }
}
