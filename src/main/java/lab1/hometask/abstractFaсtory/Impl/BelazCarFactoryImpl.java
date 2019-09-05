package lab1.hometask.abstractFaсtory.Impl;

import lab1.hometask.car.ActionEventObserver;
import lab1.hometask.car.BelazCarBuilder;
import lab1.hometask.abstractFaсtory.UninonBelarussionCarFactory;
import lab1.hometask.car.Car;

public class BelazCarFactoryImpl implements UninonBelarussionCarFactory, ActionEventObserver {

    BelazCarBuilder belazCarBuilder;

    public BelazCarFactoryImpl(BelazCarBuilder belazCarBuilder) {
        this.belazCarBuilder = belazCarBuilder;
    }

    public void createCar() {
        belazCarBuilder.createNewCar();
    }

    public Car getCar() {
        return belazCarBuilder.getCar();
    }

    public void buildCar() {
        belazCarBuilder.buildCar();
    }

    public void doAction(String message) {
        System.out.println("Belaz Car Factory got information about build: " + message);
    }
}
