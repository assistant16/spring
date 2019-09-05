package lab1.hometask.state.state;

import lab1.hometask.car.Car;

public class CarNotReadyState extends CarState {

    public CarNotReadyState(Car car) {
        super(car);
    }

    @Override
    public void checkReady() {
        System.out.println("car don't created");
    }
}
