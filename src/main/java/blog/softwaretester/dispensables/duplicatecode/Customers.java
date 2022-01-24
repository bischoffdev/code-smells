package blog.softwaretester.dispensables.duplicatecode;

import java.util.List;

public class Customers {
    private List<Customer> customers;

    public void addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("New customer list:");
        customers.forEach(System.out::println);
    }

    public void removeCustomer(Customer customer) {
        customers.remove(customer);
        System.out.println("New customer list:");
        customers.forEach(System.out::println);
    }

    record Customer(String name, float revenue) {
    }
}
