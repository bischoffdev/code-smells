package blog.softwaretester.changepreventers.parallelinheritancehierarchies;

public class Birds {
    private static class Bird {
    }

    private static class Egg {
    }

    private static class Sparrow extends Bird {
        private SparrowEgg layEgg() {
            return new SparrowEgg();
        }
    }

    private static class SparrowEgg extends Egg {
    }
}
