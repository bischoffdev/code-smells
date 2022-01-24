package blog.softwaretester.ooabusers.alternativeclassesdifferentinterfaces;

public class Shapes {

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