package abstractFactory;

public class IndiaCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Creta();
    }

    @Override
    public CarSpecification createCarspecification() {
        return new IndiaCarSpecification();
    }
}
