package org.wikipedia.search.console.app;/* Created by user on 15.02.20 */

import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Service {
    private Generator generator = new Generator();
    private RequestSender requestSender = new RequestSender();
    private JsonParser jsonParser = new JsonParser();
    private Scanner scanner = new Scanner(System.in);


    public void searchOnWiki() throws IOException, ParseException {

        generator.generateRequest(scanner.nextLine());
        String response = requestSender.sendRequest(generator);
        List<String> titles = jsonParser.parse(response);
        for (String title : titles) {
            System.out.println(title);
        }
    }
}
