package blog.softwaretester.codesmells.changepreventers.divergentchange;

public class AnimalInformation {

    public static String getLatinName(final String animalName) {
        if (animalName.equalsIgnoreCase("horse"))
            return "Equus caballus";
        if (animalName.equalsIgnoreCase("fly"))
            return "Musca domestica";
        return "";
    }

    public static int getNumberOfLegs(final String animalName) {
        if (animalName.equalsIgnoreCase("horse")) return 4;
        if (animalName.equalsIgnoreCase("fly")) return 6;
        return -1;
    }
}
