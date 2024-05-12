package CodeAnalyzer.Analyzer.Analyzers;

import CodeAnalyzer.Handler.HandlerClass;

public class ReservedWordHandler extends HandlerClass {

        @Override
        public String handleRequest(String request) {
            if (request.contains("while") || request.contains("for") || request.contains("if") || request.contains("else")){
                return "Reserved word found in code." + super.handleRequest(request);
            }
            throw new RuntimeException("Missing reserved word in code: while, for, if, else.");
        }
}
