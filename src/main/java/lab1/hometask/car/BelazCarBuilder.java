package lab1.hometask.car;


public class BelazCarBuilder extends CarBuilder {
    public void buildWheels() {
        car.setWheels(4);
    }

    public void buildDoors() {
        car.setDoors(2);
    }

    public void buildColor() {
        car.setColor("yellow");
    }
}
