package java1.ru.javabegin.training.spring.impl.robot;

import java1.ru.javabegin.training.spring.interfaces.Hand;
import java1.ru.javabegin.training.spring.interfaces.Head;
import java1.ru.javabegin.training.spring.interfaces.Leg;
import java1.ru.javabegin.training.spring.interfaces.Robot;

public class ModelT1000 implements Robot {

    private Hand hand;
    private Leg leg;
    private Head head;

    public ModelT1000() {
    }

    public ModelT1000(Hand hand, Leg leg, Head head) {
        super();
        this.hand = hand;
        this.leg = leg;
        this.head = head;
    }


    public void action() {
        head.calc();
        hand.catchSomething();
        leg.go();
    }


    public void dance() {
        System.out.println("T1000 is dancing!");
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }
}
