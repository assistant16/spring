package lab2.annotations.rmi.server;

import java.rmi.Naming;
import java.rmi.RemoteException;

public class ServerOperation implements RmiInterface{

    private static final long serialVersionUID = 1L;

    private ServerOperation() throws RemoteException{
        super();
    }

    public static void main(String[] args) {
        try {

            Naming.rebind("//localhost/MyServer", new ServerOperation());
            System.err.println("Server ready");

        } catch (Exception e){
            System.err.println("server exception" + e);
        }
    }

    public String helloTo(String name) throws RemoteException {
        System.err.println(name + " is trying to contact!");
        return "Server says hello to " + name;
    }
}
