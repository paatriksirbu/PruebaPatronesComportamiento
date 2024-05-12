package CodeAnalyzer.Analyzer;

import CodeAnalyzer.Handler.HandlerClass;

public class Analyzer {

    private HandlerClass chain;


    private void buildChain() {

    }

    public String analyzeCode(String request) {
        return chain.handleRequest(request);
    }

}
