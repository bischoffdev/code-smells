package blog.softwaretester.changepreventers.shotgunsurgery;

public class AnimalInformation{
    static class Classification {
        public static String getLatinName(final String animalName) {
            if (animalName.equalsIgnoreCase("horse")) return "Equus caballus";
            return "";
        }
    }

    static class BodyParts {
        public static int getNumberOfLegs(final String animalName) {
            if (animalName.equalsIgnoreCase("horse")) return 4;
            return -1;
        }
    }
}

