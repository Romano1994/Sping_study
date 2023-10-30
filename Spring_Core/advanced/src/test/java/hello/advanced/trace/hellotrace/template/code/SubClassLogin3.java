package hello.advanced.trace.hellotrace.template.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SubClassLogin3 extends AbstractTemplate {
    @Override
    protected void call(){
        log.info("비즈니스 로직3 실행");
    }
}
