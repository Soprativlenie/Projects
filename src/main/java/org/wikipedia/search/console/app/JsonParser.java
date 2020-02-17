package org.wikipedia.search.console.app;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JsonParser {
    public List<String> A(String response) throws ParseException {
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(response);
        JSONObject query = (JSONObject) jsonObject.get("query");

        JSONArray array = (JSONArray) query.get("search");
        Iterator iterator = array.iterator();
        List<String> titles = new ArrayList<>();
        while (iterator.hasNext()) {
            JSONObject next = (JSONObject) iterator.next();
            String title = (String) next.get("title");
            titles.add(title);
        }
        return titles;
    }
}
