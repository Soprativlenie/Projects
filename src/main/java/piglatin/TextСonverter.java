package piglatin;/* Created by user on 25.02.20 */

public class TextСonverter {

    private String[] words;

    public String[] convertSourceText(String consoleText) {
        words = consoleText.split(" ");
        return words;
    }

    public String[] getWords() {
        return words;
    }
}
