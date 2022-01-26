package blog.softwaretester.codesmells.dispensables.lazyclass;

public class WebShopCheckOut {
    public static void checkOut(final ShoppingCart cart) {
        // Some implementation
    }
}

record ShoppingCart(Product... products) {
}

record Product(String id) {
}
