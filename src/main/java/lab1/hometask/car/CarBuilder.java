package lab1.hometask.car;

abstract class CarBuilder {

    protected Car car;

    public Car getCar(){return car;}
    public void createNewCar(){car = new Car();}

    public abstract void buildWheels();
    public abstract void buildDoors();
    public abstract void buildColor();
}
