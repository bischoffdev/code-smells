package blog.softwaretester.ooabusers.alternativeclassesdifferentinterfaces;

public class AlternativeClassesDifferentInterfaces {

    public static void main(String[] args) {
        double circleArea = new Circle(5).getAreaSize();
        double rectangleArea = new Rectangle(3, 5).getSurfaceSize();
    }

    record Circle(float radius) {
        public double getAreaSize() {
            return radius * radius * Math.PI;
        }
    }

    record Rectangle(float a, float b) {
        public double getSurfaceSize() {
            return a * b;
        }
    }
}