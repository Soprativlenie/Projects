package org.wikipedia.search.console.app;/* Created by user on 13.02.20 */

public class RequestGenerator {

    private String generatedRequest;

    public String getRequest() {
        return generatedRequest;
    }

    public void setRequest(String request) {
        this.generatedRequest = new ApplicationConfig().urlSupplier.get("search") + request;
    }

}
