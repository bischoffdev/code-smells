package blog.softwaretester.codesmells.ooabusers.temporaryfield;

public class Rectangle {

    private float sideA;
    private float sideB;

    public void setSideA(float sideA) {
        this.sideA = sideA;
    }

    public void setSideB(float sideB) {
        this.sideB = sideB;
    }

    public double getAreaSize() {
        return sideA * sideB;
    }
}
