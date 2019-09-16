package springAop.main;

import springAop.object.FileManager;
import springAop.object.FileManager2;
import springAop.object.Manager;
import springAop.object.MyService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
        MyService service = (MyService)applicationContext.getBean("myService");


        FileManager fileManager = (FileManager) applicationContext.getBean("fileManager");
        FileManager2 fileManager2 = (FileManager2) applicationContext.getBean("fileManager2");
        fileManager.getExtensionCount("c:\\Windows\\");
        fileManager2.getExtensionCount("c:\\Windows");
        int value = service.getIntValue();
    }
}
