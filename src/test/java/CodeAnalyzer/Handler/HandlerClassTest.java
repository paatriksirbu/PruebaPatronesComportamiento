package CodeAnalyzer.Handler;

import static org.junit.jupiter.api.Assertions.*;

class HandlerClassTest {

    @org.junit.jupiter.api.Test
    void setNext() {
        HandlerClass handler = new HandlerClass();
        HandlerClass nextHandler = new HandlerClass();
        handler.setNext(nextHandler);
        assertEquals(nextHandler, handler.nextHandler);

    }

    @org.junit.jupiter.api.Test
    void handleRequest() {
        HandlerClass handler = new HandlerClass();
        HandlerClass nextHandler = new HandlerClass();
        handler.setNext(nextHandler);
        assertEquals("Code without any issues detected.", handler.handleRequest("Code"));
    }

}