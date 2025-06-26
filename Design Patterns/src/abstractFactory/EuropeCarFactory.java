package abstractFactory;

public class EuropeCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Sedan();
    }

    @Override
    public CarSpecification createCarspecification() {
        return new EuropeCarSpecification();
    }
}
