package springAop.object;

import org.springframework.stereotype.Component;
import springAop.annotations.ShowResult;
import springAop.annotations.ShowTime;

@Component
public class MyService {

    @ShowTime
//    @ShowResult
    public int getIntValue(){
        return 4;
    }

    public double getDouble(){
        return 4.5;
    }
}
