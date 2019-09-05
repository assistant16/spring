package lab1.hometask.car;

import lab1.hometask.state.state.CarNotReadyState;
import lab1.hometask.state.state.CarState;


public class Car{
    private CarState carState;
    private int wheels;
    private String color;
    private int doors;
    private int id;

    public Car(){
        this.carState = new CarNotReadyState(this);
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public CarState getCarState() {
        return carState;
    }

    public void setCarState(CarState carState) {
        this.carState = carState;
    }

    public double getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
