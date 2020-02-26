package piglatin;

public class TextСonverter {

    public String[] convertSourceText(String consoleText) {
        String[] convertedText;
        if (consoleText.isEmpty()) {
            return convertedText = new String[]{"You should enter the text"};
        }
        return convertedText = consoleText.split(" ");
    }
}
