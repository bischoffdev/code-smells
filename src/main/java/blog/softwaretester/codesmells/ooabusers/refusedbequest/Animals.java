package blog.softwaretester.codesmells.ooabusers.refusedbequest;

public class Animals {

    interface Animal {
        void speak();
    }

    static class Dog implements Animal {
        @Override
        public void speak() {
            System.out.println("Woof");
        }
    }

    static class Fish implements Animal {
        @Override
        public void speak() {
        }
    }
}

