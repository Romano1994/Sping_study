package hello.advanced.trace.LogTrace;

import hello.advanced.trace.TraceId;
import hello.advanced.trace.TraceStatus;
import hello.advanced.trace.logtrace.FieldLogTrace;
import hello.advanced.trace.logtrace.ThreadLocalLogTrace;
import org.junit.jupiter.api.Test;

public class ThreadLocalLogTraceTest {

    ThreadLocalLogTrace threadLocalLogTrace = new ThreadLocalLogTrace();

    @Test
    void begin_end_level2() {
        TraceStatus status = threadLocalLogTrace.begin("hello1");
        TraceStatus status2 = threadLocalLogTrace.begin("hello2");
        threadLocalLogTrace.end(status2);
        threadLocalLogTrace.end(status);
    }
}
