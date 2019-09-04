package lab1.hometask.state.state;

import gherkin.lexer.Ca;
import lab1.hometask.car.Car;

public abstract class CarState {

    private Car car;
    public CarState(Car car){
        this.car = car;
    }

    public abstract void checkReady();

}
