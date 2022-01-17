package bloaters.longmethod;

import java.util.List;

public class WebShop {
    private List<Customer> customers;

    public void saveCustomer(final Customer customer) {
        customers.add(customer);
        String table = String.format("""
                <table>
                    <tr>Name</tr>
                    <td>%s</td>
                </table>
                """, customer.name);
        System.out.println(table);
    }

    private static class Customer {
        private String name;
    }
}
