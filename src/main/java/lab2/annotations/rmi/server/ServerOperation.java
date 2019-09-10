package lab2.annotations.rmi.server;

import javax.naming.Context;
import javax.naming.InitialContext;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class ServerOperation implements RmiInterface{

    private static final long serialVersionUID = 1L;

    private ServerOperation() throws RemoteException{
        super();
    }

    public static void main(String[] args) {
        try {

            //fist method
            Context context = new InitialContext();
            context.rebind("//localhost/MyServer",new ServerOperation());
            System.out.println("server 1 ready");

            //second method
            Naming.rebind("MyServer", new ServerOperation());
            System.err.println("server 2 ready");

        } catch (Exception e){
            System.err.println("server exception" + e);
        }
    }

    public String helloTo(String name) throws RemoteException {
        System.err.println(name + " is trying to contact!");
        return "Server says hello to " + name;
    }

    public int sum(int a, int b) {
        return a+b;
    }
}
