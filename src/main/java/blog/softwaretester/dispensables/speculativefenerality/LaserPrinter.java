package blog.softwaretester.dispensables.speculativefenerality;

public class LaserPrinter implements Printer {
    @Override
    public void print(final String textToPrint) {
        // Implementation
    }

    @Override
    public void turnOnOrOff() {
        // Implementation
    }
}

interface Printer {
    void print(String textToPrint);

    void turnOnOrOff();
}
