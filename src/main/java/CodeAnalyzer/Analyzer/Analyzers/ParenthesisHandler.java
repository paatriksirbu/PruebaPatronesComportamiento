package CodeAnalyzer.Analyzer.Analyzers;

import CodeAnalyzer.Handler.HandlerClass;

public class ParenthesisHandler extends HandlerClass {

    @Override
    public String handleRequest(String request) {
        if (request.contains("(") || request.contains(")")){
            return "Parenthesis found in code." + super.handleRequest(request);
        }
        throw new RuntimeException("Missing parenthesis in code.");
    }
}
