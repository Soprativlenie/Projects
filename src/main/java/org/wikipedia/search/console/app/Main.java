package org.wikipedia.search.console.app;/* Created by user on 11.02.20 */

import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        RequestGenerator requestGenerator = new RequestGenerator();
        RequestSender requestSender = new RequestSender();
        JsonParser jsonParser = new JsonParser();
        Scanner s = new Scanner(System.in);
        requestGenerator.setRequest(s.nextLine());
        String response = requestSender.sendRequest(requestGenerator);
        List<String> titles = jsonParser.A(response);
        for (String title : titles) {
            System.out.println(title);
        }
    }
}
