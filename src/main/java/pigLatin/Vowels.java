package pigLatin;/* Created by user on 25.02.20 */

public class Vowels {
    private final static String[] VOWELS = {"a", "e", "i", "o", "u", "y", "A", "E", "I", "O", "U", "Y"};

    public boolean isVowel(String letter) {
        for (String vowel : VOWELS) {
            if (letter.equals(vowel)) {
                return true;
            }
        }
        return false;
    }

    public boolean isFirstLetterVowel(String word) {
        return isVowel(word.substring(0, 1));
    }

    public StringBuilder modifyLineStartsWithVowel(String word) {
        StringBuilder result = new StringBuilder();
        if (isFirstLetterVowel(word)) {
            String ruleOfVowelEndings = "way";
            result.append(word).append(ruleOfVowelEndings);
        }
        return result;
    }
}
