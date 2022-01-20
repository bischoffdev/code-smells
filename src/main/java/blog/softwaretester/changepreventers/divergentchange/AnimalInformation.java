package blog.softwaretester.changepreventers.divergentchange;

public class AnimalInformation {
    public static String getLatinName(final String animalName) {
        if (animalName.equalsIgnoreCase("horse")) {
            return "Equus caballus";
        } else if (animalName.equalsIgnoreCase("fly")) {
            return "Musca domestica";
        } else {
            return "";
        }
    }

    public static int getNumberOfLegs(final String animalName) {
        if (animalName.equalsIgnoreCase("horse")) {
            return 4;
        } else if (animalName.equalsIgnoreCase("fly")) {
            return 6;
        } else {
            return -1;
        }
    }
}
