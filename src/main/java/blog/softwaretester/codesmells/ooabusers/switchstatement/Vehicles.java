package blog.softwaretester.codesmells.ooabusers.switchstatement;

public class Vehicles {

    public int numberOfWheels(final String vehicle, final int number)
            throws Exception {

        return switch (vehicle) {
            case "car" -> 4 * number;
            case "boat" -> 0;
            case "bike" -> 2 * number;
            case "bicycle" -> 2 * number;
            default -> throw new Exception("Unknown: " + vehicle);
        };
    }
}
