package lab1.hometask.car;

import lab1.hometask.state.state.CarState;

abstract class CarBuilder {

    protected Car car;
    public CarState carState;

    public Car getCar(){return car;}
    public void createNewCar(){car = new Car();}

    public abstract void buildWheels();
    public abstract void buildDoors();
    public abstract void buildCar();


}
