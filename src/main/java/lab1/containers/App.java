package lab1.containers;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.picocontainer.DefaultPicoContainer;
import org.picocontainer.MutablePicoContainer;



public class App {
    public static void main(String[] args){

        //example with Weld
        WeldContainer weldContainer = new Weld().initialize();
        weldContainer.select(Logger.class).get().printWeld();
        weldContainer.shutdown();

        //example with Google Guice
        Injector injector = Guice.createInjector();   //also parameter can be default module
        Logger logger = injector.getInstance(Logger.class);
        logger.printGuice();

        //example with PicoContainer
        MutablePicoContainer  picoContainer = new DefaultPicoContainer();
        picoContainer.addComponent(DateSource.class);
        picoContainer.addComponent(Logger.class);
        picoContainer.getComponent(Logger.class).printPicoContainer();  //don't work Inject

    }
}
