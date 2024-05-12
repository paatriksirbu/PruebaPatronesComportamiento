package CodeAnalyzer.Analyzer.Analyzers;

import CodeAnalyzer.Handler.HandlerClass;

/**
 * La clase ReservedWordHandler se encarga de manejar las palabras reservadas en el código.
 * Extiende de la clase HandlerClass para formar parte de la cadena de responsabilidad
 * en el análisis de código.
 * @author Patrik Paul Sirbu
 */

public class ReservedWordHandler extends HandlerClass {

    /**
     * Maneja la solicitud de análisis de código.
     * Verifica si hay palabras reservadas en el código.
     *
     * @param request el código a analizar.
     * @return el resultado del análisis de código.
     * @throws RuntimeException si no se encuentran palabras reservadas en el código.
     */

        @Override
        public String handleRequest(String request) {
            if (request.contains("while") || request.contains("for") || request.contains("if") || request.contains("else")){
                return "Reserved word found in code." + super.handleRequest(request);
            }
            throw new RuntimeException("Missing reserved word in code: while, for, if, else.");
        }
}
