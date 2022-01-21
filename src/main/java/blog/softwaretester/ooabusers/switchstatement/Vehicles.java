package blog.softwaretester.ooabusers.switchstatement;

class Vehicles {
    public int numberOfWheels(String vehicle, int numberOfVehicles) throws Exception {

        return switch (vehicle) {
            case "car" -> 4 * numberOfVehicles;
            case "boat" -> 0;
            case "bike" -> 2 * numberOfVehicles;
            case "bicycle" -> 2 * numberOfVehicles;
            default -> throw new Exception("Vehicle unknown: " + vehicle);
        };
    }
}
