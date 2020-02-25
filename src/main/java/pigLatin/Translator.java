package pigLatin;/* Created by user on 25.02.20 */

public class Translator {

    private Vowels vowels = new Vowels();
    private Consonant consonant = new Consonant();


    public StringBuilder translate(String[] words) {
        if (words == null) {
            System.out.println("You should enter the text");
        }
        StringBuilder translation = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (vowels.isFirstLetterVowel(words[i])) {
                translation.append(vowels.modifyLineStartsWithVowel(words[i])).append(" ");
            } else {
                translation.append(consonant.modifyLineStartsWithConsonant(words[i])).append(" ");
            }
        }
        return translation;
    }
}



