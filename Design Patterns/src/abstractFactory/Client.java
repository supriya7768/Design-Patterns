package abstractFactory;

public class Client {

    public static void main(String[] args) {

        CarFactory indiaFactory = new IndiaCarFactory();
        Car indiaCar = indiaFactory.createCar();
        CarSpecification indiaCarSpecification = indiaFactory.createCarspecification();
        indiaCar.assemble();
        indiaCarSpecification.display();

        CarFactory europeFactory = new EuropeCarFactory();
        Car europeCar = europeFactory.createCar();
        CarSpecification europeCarSpecification = europeFactory.createCarspecification();
        europeCar.assemble();
        europeCarSpecification.display();
    }
}
