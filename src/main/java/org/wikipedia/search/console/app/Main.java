package org.wikipedia.search.console.app;/* Created by user on 11.02.20 */

import org.json.simple.parser.ParseException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
            new Service().searchOnWiki();
    }
}
