package blog.softwaretester.changepreventers.shotgunsurgery;

public class AnimalInformation {

    public static class Classification {
        public static String getLatinName(final String animalName) {
            if (animalName.equalsIgnoreCase("horse")) {
                return "Equus caballus";
            } else {
                return "";
            }
        }
    }

    public static class BodyParts {
        public static int getNumberOfLegs(final String animalName) {
            if (animalName.equalsIgnoreCase("horse")) {
                return 4;
            } else {
                return -1;
            }
        }
    }
}
