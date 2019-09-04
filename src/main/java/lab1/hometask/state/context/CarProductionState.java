package lab1.hometask.state.context;

import lab1.hometask.car.Car;
import lab1.hometask.state.ColorCar;
import lab1.hometask.state.state.CarState;

public class CarProductionState implements CarState{

    private CarState state;

    public CarState getState() {
        return state;
    }

    public void setState(CarState state) {
        this.state = state;
    }

    public void checkReady(){
        this.state.checkReady();
    };
}
