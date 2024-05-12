package CodeAnalyzer.Analyzer.Analyzers;

import CodeAnalyzer.Handler.HandlerClass;

/**
 * La clase StringHandler se encarga de manejar las cadenas literales en el código.
 * Extiende de la clase HandlerClass para formar parte de la cadena de responsabilidad
 * en el análisis de código.
 * @author Patrik Paul Sirbu
 */

public class StringHandler extends HandlerClass {

    /**
     * Maneja la solicitud de análisis de código.
     * Verifica si hay cadenas literales en el código.
     *
     * @param request el código a analizar.
     * @return el resultado del análisis de código.
     * @throws RuntimeException si no se encuentran cadenas literales en el código.
     */

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
