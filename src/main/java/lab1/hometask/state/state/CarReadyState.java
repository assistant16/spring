package lab1.hometask.state.state;

import lab1.hometask.car.BelazCarBuilder;
import lab1.hometask.car.Car;

public class CarReadyState extends CarState{

     public  CarReadyState(Car car){
        super(car);
    }

    @Override
    public void checkReady() {
        System.out.println("ready state");
    }
}
