package lab1.hometask.car;

import java.util.ArrayList;

public interface IPublisherObserver {

    ArrayList<ActionEventObserver> getListeners();

    void addListener(ActionEventObserver listener);

    public void removeListener(ActionEventObserver listener);

    public void removeAllListeners();

    public void notifySubscribers(String message);


}
