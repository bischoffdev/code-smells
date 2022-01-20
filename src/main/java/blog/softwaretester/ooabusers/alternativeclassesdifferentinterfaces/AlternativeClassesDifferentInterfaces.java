package blog.softwaretester.ooabusers.alternativeclassesdifferentinterfaces;

public class AlternativeClassesDifferentInterfaces {

    public static void main(String[] args) {
        double circleArea = new Circle(5).getAreaSize();
        double rectangleArea = new Rectangle(3, 5).getSurfaceSize();
        System.out.println(circleArea + " " + rectangleArea);
    }

    private static class Circle {
        private final float radius;

        public double getAreaSize() {
            return radius * radius * Math.PI;
        }

        public Circle(final float radius) {
            this.radius = radius;
        }
    }

    private static class Rectangle {
        private final float a;
        private final float b;

        public double getSurfaceSize() {
            return a * b;
        }

        public Rectangle(final float a, final float b) {
            this.a = a;
            this.b = b;
        }
    }
}
