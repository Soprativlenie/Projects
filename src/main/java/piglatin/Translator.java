package piglatin;

public class Translator {

    private Vowels vowels = new Vowels();
    private Modifier modifier = new Modifier();

    public StringBuilder translate(String[] words) {
        StringBuilder translation = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (vowels.startsWithVowel(words[i])) {
                translation.append(modifier.modifyLineStartsWithVowel(words[i])).append(" ");
            } else {
                translation.append(modifier.modifyLineStartsWithConsonant(words[i])).append(" ");
            }
        }
        return translation;
    }
}



