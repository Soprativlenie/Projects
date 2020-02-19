package org.wikipedia.search.console.app;/* Created by user on 14.02.20 */

import java.util.HashMap;
import java.util.Map;

public class ApplicationConfig {
    private Map<String, String> urlSupplier = new HashMap<>();

    {
        urlSupplier.put("search", "https://ru.wikipedia.org/w/api.php?" +
                "action=query&list=search&utf8=&format=json&srsearch=");
    }

    public Map<String, String> getUrlSupplier() {
        return urlSupplier;
    }
}
