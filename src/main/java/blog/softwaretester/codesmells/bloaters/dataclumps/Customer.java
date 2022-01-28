package blog.softwaretester.codesmells.bloaters.dataclumps;

record Customer(
        String lastName,
        String firstName,
        String middleName,
        String salutation,
        String streetAddress,
        String city,
        String state,
        boolean isEmployed,
        boolean isHomeOwner
) {
}