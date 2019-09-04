package lab1.containers;

import javax.inject.Inject;

public class Logger {

    public Logger() {
        System.out.println("create obj");
    }

    @Inject
    private DateSource dateSource;

    void printWeld(){
        System.out.println(dateSource.getDate() + " hello Weld");
    }

    void printGuice(){
        System.out.println(dateSource.getDate() + " hello Guice");
    }

    void printPicoContainer(){
        System.out.println(dateSource.getDate() + " hello PicoContainer");
    }

}
