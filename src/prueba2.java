import java.util.Arrays;
import java.util.Objects;

public class prueba2 {
    /*Return the number (count) of vowels in the given string.
    We will consider a, e, i, o, u as vowels for this Kata (but not y).
    The input string will only consist of lower case letters and/or spaces.*/
    public static int getCount(String str) {
        int vowelsCount = 0;
        String [] word = str.split("");
        for (String w : word){
            if (w.equals("a") || w.equals("e") ||w.equals("i") ||w.equals("o") ||w.equals("u")){
                vowelsCount++;
            }
        }

        return vowelsCount;
    }
    public static int getCounts(String str) {
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }


    public static void main(String[] args) {

    }
}
