package CodeAnalyzer.Analyzer.Analyzers;

import CodeAnalyzer.Handler.HandlerClass;

/**
 * La clase SyntaxHandler se encarga de manejar la sintaxis en el código.
 * Extiende de la clase HandlerClass para formar parte de la cadena de responsabilidad
 * en el análisis de código.
 * @author Patrik Paul Sirbu
 */

public class SyntaxHandler extends HandlerClass {

    /**
     * Maneja la solicitud de análisis de código.
     * Verifica si la sintaxis del código es correcta.
     *
     * @param request el código a analizar.
     * @return el resultado del análisis de código.
     * @throws RuntimeException si hay un error de sintaxis en el código.
     */

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
