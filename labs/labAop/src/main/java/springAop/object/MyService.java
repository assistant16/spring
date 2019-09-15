package springAop.object;

import org.springframework.stereotype.Component;

@Component
public class MyService {

    public int getIntValue(){
        return 4;
    }

    public double getDouble(){
        return 4.5;
    }
}
