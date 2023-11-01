package hello.proxy.pureproxy.decorator.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MessageDecorator implements Component{

    private Component component;

    public MessageDecorator(Component component) {
        this.component = component;
    }

    @Override
    public String operation() {
        log.info("message Decorator 실행");

        String operation = component.operation();
        String decoratedSt = "**********" + operation + "**********";

        log.info("Massage Decorated 적용전={}, 적용후={}", operation, decoratedSt);
        return decoratedSt;
    }
}
