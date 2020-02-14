package org.wikipedia.search.console.app;/* Created by user on 13.02.20 */

public class RequestGenerator {
    private static String request;

    public static String getRequest() {
        return request;
    }

    public static void setRequest(String request) {
        RequestGenerator.request = new ApplicationConfig().urls.get("search") + request;
    }

}
