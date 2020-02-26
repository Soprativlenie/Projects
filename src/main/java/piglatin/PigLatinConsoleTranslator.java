package piglatin;


import java.util.Scanner;

public class PigLatinConsoleTranslator {
    private Scanner scanner = new Scanner(System.in);
    private Introduction introduction = new Introduction();
    private TextСonverter textСonverter = new TextСonverter();
    private Translator translator = new Translator();

    public PigLatinConsoleTranslator setup() {
        System.out.println(translator.translate(textСonverter.convertSourceText(scanner.nextLine())));
        return this;
    }

    public PigLatinConsoleTranslator launch() {
        introduction.intro();
        return this;
    }

}
