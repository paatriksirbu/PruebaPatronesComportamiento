package CodeAnalyzer.Analyzer.Analyzers;

import static org.junit.jupiter.api.Assertions.*;

class CommentHandlerTest {

    @org.junit.jupiter.api.Test
    void setNext() {
        CommentHandler handler = new CommentHandler();
        CommentHandler nextHandler = new CommentHandler();
        handler.setNext(nextHandler);
        assertEquals(nextHandler, handler.nextHandler);
    }
}