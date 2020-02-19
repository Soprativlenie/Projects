package org.wikipedia.search.console.app;/* Created by user on 14.02.20 */

import java.util.HashMap;
import java.util.Map;

public class ApplicationConfig {
    private static Map<String, String> URL_SUPPLIER = new HashMap<>();
    {
        URL_SUPPLIER.put("search", "https://ru.wikipedia.org/w/api.php?" +
                "action=query&list=search&utf8=&format=json&srsearch=");
    }

    public static Map<String, String> getUrlSupplier() {
        return URL_SUPPLIER;
    }
}
