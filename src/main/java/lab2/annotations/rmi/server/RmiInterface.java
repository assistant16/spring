package lab2.annotations.rmi.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RmiInterface extends Remote {

    public String helloTo(String name) throws RemoteException;

    int sum (int a, int b);
}
