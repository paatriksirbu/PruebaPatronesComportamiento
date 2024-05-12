package CodeAnalyzer.Analyzer;

import CodeAnalyzer.Handler.HandlerClass;
import CodeAnalyzer.Analyzer.Analyzers.*;


/**
 * La clase Analyzer se encarga de construir la cadena de responsabilidad
 * para el análisis de código y de iniciar el análisis.
 * @author Patrik Paul Sirbu
 */

public class Analyzer {

    private HandlerClass chain;


    /**
     * Constructor de la clase Analyzer.
     * Inicializa la cadena de responsabilidad para el análisis de código.
     */

    public Analyzer() {
        buildChain();
    }


    /**
     * Construye la cadena de responsabilidad para el análisis de código.
     */

    private void buildChain() {
        chain = new ReservedWordHandler();
        HandlerClass syntaxHandler = new SyntaxHandler();
        HandlerClass parenthesis = new ParenthesisHandler();
        HandlerClass comment = new CommentHandler();
        HandlerClass string = new StringHandler();

        chain.setNext(syntaxHandler);
        syntaxHandler.setNext(parenthesis);
        parenthesis.setNext(comment);
        comment.setNext(string);

    }

    /**
     * Inicia el análisis de código.
     *
     * @param request el código a analizar.
     * @return el resultado del análisis de código.
     */

    public String analyzeCode(String request) {
        return chain.handleRequest(request);
    }

}
