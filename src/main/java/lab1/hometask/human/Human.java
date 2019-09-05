package lab1.hometask.human;

import lab1.hometask.car.ActionEventObserver;

public class Human implements ActionEventObserver {
    private String name;
    private String surname;

    public void doAction(String message) {
        System.out.println("human got information about build : " + message);
    }
}
