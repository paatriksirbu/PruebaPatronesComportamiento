package CodeAnalyzer.Analyzer;

import CodeAnalyzer.Handler.HandlerClass;
import CodeAnalyzer.Analyzer.Analyzers.*;

public class Analyzer {

    private HandlerClass chain;

    public Analyzer() {
        buildChain();
    }

    private void buildChain() {
        chain = new ReservedWordHandler();
        HandlerClass syntaxHandler = new SyntaxHandler();
        HandlerClass parenthesis = new ParenthesisHandler();
        HandlerClass comment = new CommentHandler();
        HandlerClass string = new StringHandler();

        chain.setNext(syntaxHandler);
        syntaxHandler.setNext(parenthesis);
        parenthesis.setNext(comment);
        comment.setNext(string);

    }

    public String analyzeCode(String request) {
        return chain.handleRequest(request);
    }

}
