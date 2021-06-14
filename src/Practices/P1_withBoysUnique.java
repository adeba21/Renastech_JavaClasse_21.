package Practices;

public class P1_withBoysUnique {
    //(String) Find the unique
//Write a return  method that can find the unique characters from the String
//Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
    public static void main(String[] args) {
        unique("AAABBBCCCDEF");
    }
    public static String unique (String word ) {
        for (int i = 0; i < word.length() - 1; i++) {
            boolean Unique = false;
            char[] word1 = word.toCharArray();
            for (int i1 = 0; i1 < i; i1++) {
                if (word1[i] == word1[i1]) {
                    Unique = true;
                    break;
                }
            }
            if (!Unique) {
                System.out.print(word1[i] + "");
            }
        }
        return word;
    }
}




