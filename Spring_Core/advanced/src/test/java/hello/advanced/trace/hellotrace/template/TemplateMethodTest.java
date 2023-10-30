package hello.advanced.trace.hellotrace.template;

import hello.advanced.trace.hellotrace.template.code.AbstractTemplate;
import hello.advanced.trace.hellotrace.template.code.SubClassLogin1;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class TemplateMethodTest {

    @Test
    void templateMethodV0() {
         logic1();
    }

    private void logic1() {
        long startTime = System.currentTimeMillis();

        log.info("비즈니스 로직1 수행");

        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;
        log.info("result time = {}", resultTime);
    }

    @Test
    void templateMethodV1() {
        AbstractTemplate abstractTemplate = new SubClassLogin1();
        abstractTemplate.excute();
    }
}
