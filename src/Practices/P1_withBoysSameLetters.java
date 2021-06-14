package Practices;


public class P1_withBoysSameLetters {


        public static void main(String[] args) {
            remove();
            //(String) Remove Duplicates
            //Write a return method that can remove the duplicated values from String
            //Ex: removeDup("AAABBBCCC") ==> ABC
        }

        public static void remove(){
            String word = "AAABBBCCC" ;
            String result = "";
            for (int i=0; i<=word.length()-1; i++){
                String a = "" + word.charAt(i);
                if (!result.contains(a)){
                    result += a;
                    System.out.println(result);
                }
            }
            System.out.println(result);
        }
}
