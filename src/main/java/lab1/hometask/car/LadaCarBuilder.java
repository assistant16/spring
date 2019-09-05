package lab1.hometask.car;

import lab1.hometask.state.state.CarReadyState;

public class LadaCarBuilder extends CarBuilder {
    public void buildWheels() {
        car.setWheels(4);
    }

    public void buildDoors() {
        car.setDoors(4);
    }

    public void buildCar() {
        System.out.println("build lada at builder");
        car.setWheels(4);
        System.out.println("set 4 wheels");
        car.setDoors(4);
        System.out.println("set 4 doors");
        car.setCarState(new CarReadyState(car));
    }


}
