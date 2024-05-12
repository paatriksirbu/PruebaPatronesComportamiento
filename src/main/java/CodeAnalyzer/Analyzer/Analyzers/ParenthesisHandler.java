package CodeAnalyzer.Analyzer.Analyzers;

import CodeAnalyzer.Handler.HandlerClass;

/**
 * La clase ParenthesisHandler se encarga de manejar los paréntesis en el código.
 * Extiende de la clase HandlerClass para formar parte de la cadena de responsabilidad
 * en el análisis de código.
 * @author Patrik Paul Sirbu
 */

public class ParenthesisHandler extends HandlerClass {

    /**
     * Maneja la solicitud de análisis de código.
     * Verifica si hay paréntesis en el código.
     *
     * @param request el código a analizar.
     * @return el resultado del análisis de código.
     * @throws RuntimeException si no se encuentran paréntesis en el código.
     */

    @Override
    public String handleRequest(String request) {
        if (request.contains("(") || request.contains(")")){
            return "Parenthesis found in code." + super.handleRequest(request);
        }
        throw new RuntimeException("Missing parenthesis in code.");
    }
}
