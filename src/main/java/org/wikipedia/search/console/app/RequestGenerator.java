package org.wikipedia.search.console.app;/* Created by user on 13.02.20 */

public class RequestGenerator {
    private String generatedRequest;

    public String getGeneratedRequest() {
        return generatedRequest;
    }

    public void setGeneratedRequest(String request) {
        this.generatedRequest = ApplicationConfig.getUrlSupplier().get("search") + request;
    }

}
