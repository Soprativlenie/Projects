package piglatin;/* Created by user on 25.02.20 */

public class Consonant {
    Vowels vowels = new Vowels();


    public StringBuilder modifyLineStartsWithConsonant(String word) {

        StringBuilder part1 = new StringBuilder();
        StringBuilder part2 = new StringBuilder();
        String[] letters = word.split("");
        int iterator = 0;
        int count = 0;
        while (!vowels.isVowel(letters[iterator])) {
            part2.append(letters[iterator]);
            iterator++;
            count++;
        }
//        for (int i = 0; i < letters.length ; i++) {
//            if(!vowels.isVowel(letters[i])){
//                part2.append(letters[i]);
//                count++;
//            }
//            else {break;}
//        }
        String ruleOfConsonantEndings = "ay";
        return part1.append(word.substring(count)).append(part2).append(ruleOfConsonantEndings);
    }
}
