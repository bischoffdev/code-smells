package blog.softwaretester.ooabusers.refusedbequest;

public class RefusedBequest {

    private abstract static class Animal {
        public abstract void speak();

        public abstract void run();
    }

    private static class Dog extends Animal {

        @Override
        public void speak() {
            System.out.println("Woof");
        }

        @Override
        public void run() {
            System.out.println("Running");
        }
    }

    private static class Fish extends Animal {

        @Override
        public void speak() {
        }

        @Override
        public void run() {
        }
    }
}
