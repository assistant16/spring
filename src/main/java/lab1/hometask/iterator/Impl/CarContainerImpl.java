package lab1.hometask.iterator.Impl;

import lab1.hometask.car.Car;
import lab1.hometask.iterator.ICarContainer;
import lab1.hometask.iterator.IIterator;

import java.util.ArrayList;


public class CarContainerImpl implements ICarContainer {

    static int MAX_LENGTH = 5;

    public ArrayList<Car> cars = new ArrayList<Car>(MAX_LENGTH);

    public IIterator getIterator() {
        return new CarIteratorImpl();
    }

    private class CarIteratorImpl implements IIterator {

        int index;

        public boolean hasNext() {

            if(index < cars.size()){
                return true;
            }
            return false;
        }

        public Object next() {

            if(this.hasNext()){
                return cars.get(index++);
            }
            return null;
        }
    }
}
