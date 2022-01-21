package blog.softwaretester.ooabusers.alternativeclassesdifferentinterfaces;

public class AlternativeClassesDifferentInterfaces {

    public static void main(String[] args) {
        System.out.println(new Circle(5).getAreaSize());
        System.out.println(new Rectangle(3, 5).getSurfaceSize());
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