package piglatin;

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
