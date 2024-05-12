package CodeAnalyzer.Analyzer.Analyzers;

import CodeAnalyzer.Handler.HandlerClass;

public class StringHandler extends HandlerClass {

    @Override
    public String handleRequest(String request) {
        // Verificar si hay cadenas literales en el código
        String stringPattern = "\"(.*?)\"";

        if (request.matches(".*" + stringPattern + ".*")) {
            return "String literal found in code." + super.handleRequest(request);
        }
        throw new RuntimeException("Missing string literals in code.");
    }
}
