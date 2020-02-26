package piglatin;

public class Vowels {
    private final static String[] VOWELS = {"a", "e", "i", "o", "u", "y", "A", "E", "I", "O", "U", "Y"};

    public boolean contains(String letter) {
        for (String vowel : VOWELS) {
            if (letter.equals(vowel)) {
                return true;
            }
        }
        return false;
    }

    public boolean startsWithVowel(String word) {
        return contains(word.substring(0, 1));
    }

}
