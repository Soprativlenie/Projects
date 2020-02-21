package org.wikipedia.search.console.app;/* Created by user on 13.02.20 */

public class Generator {
    private String generatedRequest;

    public String getGeneratedRequest() {
        return generatedRequest;
    }

    public void generateRequest(String request) {
        this.generatedRequest = ApplicationConfig.getUrlSupplier().get("search") + request;
    }

}
