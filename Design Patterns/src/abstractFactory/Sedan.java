package abstractFactory;

public class Sedan implements Car {

    @Override
    public void assemble() {
        System.out.println("Assemble Sedan Car");
    }
}
