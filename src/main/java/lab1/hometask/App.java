package lab1.hometask;

import lab1.hometask.human.Human;
import lab1.hometask.testCar.facade.TestingCarFacade;

public class App {
    public static void main(String args[]) {


        //testing car
        TestingCarFacade testingCarFacade = new TestingCarFacade();
        testingCarFacade.generalTesting();

    }
}
