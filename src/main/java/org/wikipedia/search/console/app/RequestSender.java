package org.wikipedia.search.console.app;/* Created by user on 15.02.20 */

import org.apache.http.HttpEntity;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class RequestSender {

    public String sendRequest(Generator request) throws IOException {

        String result = "";

        try (CloseableHttpClient httpclient = HttpClients.custom().setDefaultRequestConfig(RequestConfig.custom()
                .setCookieSpec(CookieSpecs.STANDARD).build()).build()) {

            HttpGet wikiRequest = new HttpGet(request.getGeneratedRequest());

            try (CloseableHttpResponse response = httpclient.execute(wikiRequest)) {

                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    result = EntityUtils.toString(entity);
                } else {
                    result = response.getStatusLine().getStatusCode() + " " + response.getStatusLine().getReasonPhrase();
                }
            }
        }
        return result;
    }
}

