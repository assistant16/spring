package lab1.hometask.abstractFaсtory.Impl;

import lab1.hometask.car.Car;
import lab1.hometask.car.LadaCarBuilder;
import lab1.hometask.abstractFaсtory.UninonBelarussionCarFactory;

public class LadaCarFactoryIlmp implements UninonBelarussionCarFactory {

    LadaCarBuilder ladaCarBuilder;


    public void createCar() {
        ladaCarBuilder.createNewCar();
    }

    public Car getCar() {
        return ladaCarBuilder.getCar();
    }

    public void buildCar() {
        ladaCarBuilder.buildCar();
    }
}
