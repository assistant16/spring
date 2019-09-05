package lab1.hometask.state.state;

import lab1.hometask.car.Car;

public abstract class CarState {

    Car car;
    public CarState(Car car){
        this.car = car;
    }

    public abstract void checkReady();

}
