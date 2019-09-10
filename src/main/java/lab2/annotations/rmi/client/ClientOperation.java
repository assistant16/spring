package lab2.annotations.rmi.client;

import lab2.annotations.rmi.server.RmiInterface;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.*;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ClientOperation {

    public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException, NamingException {

        //fist method
        Context context = new InitialContext();
        RmiInterface rmiInterface1 = (RmiInterface) context.lookup("//localhost/MeServer");
        System.out.println(rmiInterface1.sum(2,3));

        //second method
        RmiInterface rmiInterface2 = (RmiInterface) Naming.lookup("//localhost/MyServer");
        String txt = JOptionPane.showInputDialog("What is your name?");

        String response = rmiInterface2.helloTo(txt);
        JOptionPane.showMessageDialog(null,response);
    }


}
