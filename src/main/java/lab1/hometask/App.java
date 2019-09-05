package lab1.hometask;

import lab1.hometask.abstractFaсtory.Impl.BelazCarFactoryImpl;
import lab1.hometask.car.BelazCarBuilder;
import lab1.hometask.car.Car;
import lab1.hometask.dealer.Dealer;
import lab1.hometask.human.Human;
import lab1.hometask.testCar.facade.TestingCarFacade;

public class App {
    public static void main(String args[]) {

        //add observer pattern
        BelazCarBuilder carBuilder = new BelazCarBuilder();
        Human human = new Human();
        Dealer dealer = new Dealer();
        BelazCarFactoryImpl belazCarFactory = new BelazCarFactoryImpl(carBuilder);
        carBuilder.addListener(belazCarFactory);
        carBuilder.addListener(dealer);
        carBuilder.addListener(human);

        //build car (builder pattern) and control state (state pattern) and factory
        belazCarFactory.createCar();
        Car car = belazCarFactory.getCar();
        car.getCarState().checkReady();
        belazCarFactory.buildCar();
        carBuilder.notifySubscribers("car done");  //notify subscribers
        car.getCarState().checkReady();

        //testing car (facade)
        TestingCarFacade testingCarFacade = new TestingCarFacade();
        testingCarFacade.generalTesting();

    }
}
