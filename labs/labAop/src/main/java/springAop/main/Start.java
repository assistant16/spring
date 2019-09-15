package springAop.main;

import springAop.object.FileManager;
import springAop.object.MyService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
        MyService service = (MyService)applicationContext.getBean("myService");
        int value = service.getIntValue();

        FileManager fileUtil = (FileManager) applicationContext.getBean("fileManager");
        fileUtil.getExtensionCount("c:\\Windows\\");

    }
}
