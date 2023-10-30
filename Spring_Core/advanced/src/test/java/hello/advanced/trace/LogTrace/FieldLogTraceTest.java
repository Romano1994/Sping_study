package hello.advanced.trace.LogTrace;

import hello.advanced.trace.TraceStatus;
import hello.advanced.trace.logtrace.FieldLogTrace;
import org.junit.jupiter.api.Test;

public class FieldLogTraceTest {

    FieldLogTrace fieldLogTrace = new FieldLogTrace();

    @Test
    void begin_end_level2() {
        TraceStatus status = fieldLogTrace.begin("hello1");
        TraceStatus status2 = fieldLogTrace.begin("hello2");
        fieldLogTrace.end(status2);
        fieldLogTrace.end(status);
    }
}
