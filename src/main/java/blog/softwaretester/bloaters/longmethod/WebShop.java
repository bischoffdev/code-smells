package blog.softwaretester.bloaters.longmethod;

import java.util.ArrayList;
import java.util.List;

class WebShop {
    private final List<Customer> customers = new ArrayList<>();

    public String saveCustomer(final Customer customer) {
        customers.add(customer);
        return String.format("""
                <table>
                    <tr>Name</tr>
                    <td>%s</td>
                </table>
                """, customer.name());
    }
}

record Customer(String name) {
}

