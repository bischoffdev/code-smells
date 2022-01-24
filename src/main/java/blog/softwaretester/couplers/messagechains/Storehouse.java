package blog.softwaretester.couplers.messagechains;

import java.util.List;

public class Storehouse {

    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("Cheese", "Tasty cheese"));
        List<Shelf> shelves = List.of(new Shelf(products));
        String description =
                shelves.get(0).products().get(0).description();
    }

    record Shelf(List<Product> products) {
    }

    record Product(String name, String description) {
    }
}


