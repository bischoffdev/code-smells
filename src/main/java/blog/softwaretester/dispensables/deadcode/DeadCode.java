package blog.softwaretester.dispensables.deadcode;

public class DeadCode {

    public static void main(String[] args) {
        System.out.println("Pi = " + Math.PI);
    }

    private double getPi() {
        return 3.141592;
        // System.out.println("Returning PI");
    }
}
