package CodeAnalyzer.Analyzer.Analyzers;

import CodeAnalyzer.Handler.HandlerClass;

public class SyntaxHandler extends HandlerClass {

        @Override
        public String handleRequest(String request) {

            String whilePattern = "while\\s*\\(([^)]+)\\)\\s*\\{[^}]*\\}";
            String forPattern = "for\\s*\\(\\s*([^;]+\\s*;\\s*[^;]+\\s*;\\s*[^)]+)\\)\\s*\\{[^}]*\\}";

            if (request.matches(whilePattern) || request.matches(forPattern)) {
                return super.handleRequest(request);
            }

            return "Syntax error in code.";
        }
}
