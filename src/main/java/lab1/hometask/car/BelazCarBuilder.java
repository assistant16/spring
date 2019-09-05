package lab1.hometask.car;


import lab1.hometask.abstractFaсtory.UninonBelarussionCarFactory;
import lab1.hometask.state.state.CarReadyState;

import java.util.ArrayList;

public class BelazCarBuilder extends CarBuilder implements IPublisherObserver {

    static int RANDOM_EDGE = 123412;

    private ArrayList<ActionEventObserver> listeners = new ArrayList<ActionEventObserver>();

    public void buildWheels() {
        car.setWheels(4);
    }

    public void buildDoors() {
        car.setDoors(2);
    }

    public void buildCar() {
        System.out.println("build belaz at builder");
        car.setWheels(2);
        System.out.println("set 2 wheels");
        car.setDoors(4);
        System.out.println("set 4 doors");
        car.setId((int) (Math.random() * RANDOM_EDGE));
        car.setCarState(new CarReadyState(car));
    }

    public ArrayList<ActionEventObserver> getListeners() {
        return listeners;
    }

    public void addListener(ActionEventObserver listener) {
        listeners.add(listener);
    }

    public void removeListener(ActionEventObserver listener) {
        listeners.remove(listener);
    }

    public void removeAllListeners() {
        listeners.clear();
    }

    public void notifySubscribers(String message) {
        for (ActionEventObserver actionListener : listeners) {
            actionListener.doAction(message);
        }
    }

    public void createNewMessage(String message){
        System.out.println("Publisher printed message "+message);
        notifySubscribers(message);
    }
}
