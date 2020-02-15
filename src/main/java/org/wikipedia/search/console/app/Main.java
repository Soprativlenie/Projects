package org.wikipedia.search.console.app;/* Created by user on 11.02.20 */

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //TODO: Read console -- Done
        //TODO: Generate request -- Done
        //TODO: Send request to server
        //TODO: Parse response
        //TODO: Show response in console
        Scanner s = new Scanner(System.in);
        RequestGenerator requestGenerator = new RequestGenerator();
        RequestSender requestSender = new RequestSender();

        requestGenerator.setRequest(s.nextLine());
        System.out.println(requestSender.sendRequest(requestGenerator));
    }
}
