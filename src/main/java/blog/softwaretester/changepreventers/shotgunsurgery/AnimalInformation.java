package blog.softwaretester.changepreventers.shotgunsurgery;

class Classification {
    public static String getLatinName(final String animalName) {
        if (animalName.equalsIgnoreCase("horse")) return "Equus caballus";
        return "";
    }
}

class BodyParts {
    public static int getNumberOfLegs(final String animalName) {
        if (animalName.equalsIgnoreCase("horse")) return 4;
        return -1;
    }
}