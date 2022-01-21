package blog.softwaretester.dispensables.lazyclass;

public class WebshopCheckOut {
    public static void checkOut(final ShoppingCart cart) {
        // Some implementation
    }
}

record ShoppingCart(Product... products) {
}

record Product(String id) {
}
