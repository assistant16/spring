package lab1.containers;

import java.util.Date;

public class DateSource {

    public DateSource() {
        System.out.println("create data");
    }

    String getDate() {
        return new Date().toString();
    }
}
