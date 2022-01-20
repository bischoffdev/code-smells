package blog.softwaretester.ooabusers.refusedbequest;

abstract class Animal {
    public abstract void speak();

    public abstract void run();
}

class Dog extends Animal {

    @Override
    public void speak() {
        System.out.println("Woof");
    }

    @Override
    public void run() {
        System.out.println("Running");
    }
}

class Fish extends Animal {

    @Override
    public void speak() {
    }

    @Override
    public void run() {
    }
}
