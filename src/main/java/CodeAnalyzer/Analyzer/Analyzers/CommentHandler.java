package CodeAnalyzer.Analyzer.Analyzers;

import CodeAnalyzer.Handler.HandlerClass;

/**
 * La clase CommentHandler se encarga de manejar los comentarios en el código.
 * Extiende de la clase HandlerClass para formar parte de la cadena de responsabilidad
 * en el análisis de código.
 * @author Patrik Paul Sirbu
 */

public class CommentHandler extends HandlerClass {

    /**
     * Maneja la solicitud de análisis de código.
     * Verifica si hay comentarios de bloque o de línea en el código.
     *
     * @param request el código a analizar.
     * @return el resultado del análisis de código.
     * @throws RuntimeException si no se encuentran comentarios en el código.
     */

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
