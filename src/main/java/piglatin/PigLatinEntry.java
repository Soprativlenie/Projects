package piglatin;


import java.util.Scanner;

public class PigLatinEntry {
    private Scanner scanner = new Scanner(System.in);
    private Introduction introduction = new Introduction();
    private TextСonverter textСonverter = new TextСonverter();
    private Translator translator = new Translator();

    public PigLatinEntry setup() {
        introduction.intro();
        return this;
    }

    public PigLatinEntry launch() {
        System.out.println(translator.translate(textСonverter.convertSourceText(scanner.nextLine())));
        return this;
    }

}
