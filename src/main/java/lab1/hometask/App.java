package lab1.hometask;

import lab1.hometask.abstractFaсtory.Impl.BelazCarFactoryImpl;
import lab1.hometask.car.BelazCarBuilder;
import lab1.hometask.car.Car;
import lab1.hometask.dealer.Dealer;
import lab1.hometask.human.Human;
import lab1.hometask.iterator.IIterator;
import lab1.hometask.iterator.Impl.CarContainerImpl;
import lab1.hometask.testCar.facade.TestingCarFacade;

import java.util.Iterator;

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


        //iterator puttern
        CarContainerImpl carContainer = new CarContainerImpl();
        carContainer.cars.add(car);
        belazCarFactory.createCar();
        belazCarFactory.buildCar();
        carContainer.cars.add(belazCarFactory.getCar());
        for(IIterator iter = carContainer.getIterator(); iter.hasNext();){
            car = (Car)iter.next();
            System.out.println(car.getId());
        }

        //testing car (facade)
        TestingCarFacade testingCarFacade = new TestingCarFacade();
        testingCarFacade.generalTesting();

    }
}
