package springAop.logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import springAop.annotations.ShowTime;

import java.util.Map;
import java.util.Set;

@Component
@Aspect
public class MyLogger {

//    @Pointcut("execution(* *(..)) && within(springAop.object.*))")
//    @Pointcut("execution(* springAop.object.*.* (..))")
    @Pointcut("execution(* *(..))")
    void allMethods(){}

    void printMessage(){
        System.out.println("message");
    }

//    @Around("allMethods() & @annotation(springAop.annotations.ShowTime)")
    @Around("allMethods() && @annotation(springAop.annotations.ShowTime)")
    public Object watchTime(ProceedingJoinPoint joinpoint) {
        long start = System.currentTimeMillis();
        System.out.println("method begin: " + joinpoint.getSignature().toShortString());
        Object output = null;

        for (Object object : joinpoint.getArgs()) {
            System.out.println("Param : " + object);
        }
        try {
            output = joinpoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }

        long time = System.currentTimeMillis() - start;
        System.out.println("method end: " + joinpoint.getSignature().toShortString() + ", time=" + time + " ms");

        return output;
    }

    @AfterReturning(pointcut = "allMethods() && @annotation(springAop.annotations.ShowResult)", returning = "obj")
    public void print(Object obj) {

        System.out.println("Print info begin >>");

        System.out.println("Print object");
        System.out.println();

        if (obj instanceof Set) {
            Set set = (Set) obj;
            for (Object object : set) {
                System.out.println(object);
            }

        } else if (obj instanceof Map) {
            Map map = (Map) obj;
//            for (Object object : map.keySet()) {
//                System.out.println("key=" + object + ", " + map.get(object));
//            }
        }

//        System.out.println("Print info end <<");
        System.out.println();

    }

}
