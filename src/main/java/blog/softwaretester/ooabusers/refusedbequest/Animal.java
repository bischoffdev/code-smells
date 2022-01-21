package blog.softwaretester.ooabusers.refusedbequest;

interface Animal {
    void speak();
    void run();
}

class Dog implements Animal {
    @Override
    public void speak() {
        System.out.println("Woof");
    }

    @Override
    public void run() {
        System.out.println("Running");
    }
}

class Fish implements Animal {
    @Override
    public void speak() {
    }

    @Override
    public void run() {
    }
}
