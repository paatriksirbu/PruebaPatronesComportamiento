package CodeAnalyzer.Analyzer.Analyzers;

import CodeAnalyzer.Handler.HandlerClass;

public class CommentHandler extends HandlerClass {
    @Override
    public String handleRequest(String request) {
        // Verificar si hay comentarios de bloque o de línea en el código
        String blockCommentPattern = "/\\*.*?\\*/";
        String lineCommentPattern = "//.*?$";

        if (request.matches(".*" + blockCommentPattern + ".*") || request.matches(".*" + lineCommentPattern + ".*")) {
            return "Comments found in code." + super.handleRequest(request);
        }
        throw new RuntimeException("Missing comments in code.");
    }
}
