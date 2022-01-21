package blog.softwaretester.dispensables.dataclass;

public class DataClass {
    record Rectangle(int sideA, int sideB) {
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 20);
        int rectangleArea = rectangle.sideA * rectangle.sideB;
    }
}
