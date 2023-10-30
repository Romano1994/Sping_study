package hello.advanced.trace.hellotrace.template.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class AbstractTemplate {

    public void excute() {

        long startTime = System.currentTimeMillis();

        //log.info("비즈니스 로직1 수행");
        call();

        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;
        log.info("result time = {}", resultTime);

    }

    protected abstract void call();
}
