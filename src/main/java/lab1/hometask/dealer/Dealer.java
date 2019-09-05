package lab1.hometask.dealer;

import lab1.hometask.car.ActionEventObserver;

public class Dealer implements ActionEventObserver {

    public void doAction(String message) {
        System.out.println("dealer got information about build: " + message);
    }
}
