package ro.fasttrackit.curs2;

public class Dog extends Pet {
    private int tailLength;

    public Dog(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "woof";
    }

    @Override
    Dog friend() {
        return null;
    }

    public int getTailLength() {
        return tailLength;
    }
}
