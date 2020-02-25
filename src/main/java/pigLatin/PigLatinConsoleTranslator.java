package pigLatin;/* Created by user on 25.02.20 */


import java.util.Scanner;

public class PigLatinConsoleTranslator {
    private Scanner scanner = new Scanner(System.in);
    private Introduction introduction = new Introduction();
    private TextСonverter textСonverter = new TextСonverter();
    private Translator translator = new Translator();

    public void setup() {
        introduction.intro();
        System.out.println(translator.translate(textСonverter.convertSourceText(scanner.nextLine())));
    }
}
