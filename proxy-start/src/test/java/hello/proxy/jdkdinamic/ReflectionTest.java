package hello.proxy.jdkdinamic;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

@Slf4j
public class ReflectionTest {

    @Test
    void reflection() {
        Hello target = new Hello();

        //공통로직 1 시작
        log.info("start");
        String result1 = target.callA();
        log.info("result={}", result1);

        //공통로직 2시작
        log.info("start");
        String result2 = target.callB();
        log.info("result={}", result2);
    }

    @Test
    void reflection1() throws Exception {
//        Class classHello = Class.forName("hello.proxy.jdkdinamic.ReflectionTest$Hello");
//
//        Hello target = new Hello();
//
//        Method methodCallA = classHello.getMethod("callA");
//
//        Object reulst1 = methodCallA.invoke(target);

        dynamicCall("callA", new Hello());
        dynamicCall("callB", new Hello());
    }

    private void dynamicCall(String methodName, Object target) throws Exception {
        log.info("start");

        Method method = target.getClass().getMethod(methodName);

        Object result = method.invoke(target);
    }
    @Slf4j
    static class Hello{
        public String callA(){
            log.info("call A");
            return "A";
        }

        public String callB(){
            log.info("call B");
            return "B";
        }
    }
}
