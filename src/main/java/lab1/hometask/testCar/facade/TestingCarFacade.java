package lab1.hometask.testCar.facade;

import lab1.hometask.testCar.parts.Doors;
import lab1.hometask.testCar.parts.Motor;
import lab1.hometask.testCar.parts.Wheels;

public class TestingCarFacade {
    private Doors doors = new Doors();
    private Wheels wheels = new Wheels();
    private Motor motor = new Motor();

    public void generalTesting(){
        System.out.println("start general testing");
        doors.testDoors();
        wheels.testWheels();
        motor.testMotor();
        System.out.println("finish general testing");
    }
}
