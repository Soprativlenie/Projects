package org.wikipedia.search.console.app;/* Created by user on 14.02.20 */

import java.util.HashMap;
import java.util.Map;

public class ApplicationConfig {
    Map<String, String> urls = new HashMap<String, String>(){{
        put("search", "https://ru.wikipedia.org/w/api.php?action=query&list=search&utf8=&format=json&srsearch=");
    }};

}
