package Practices;


public class P1_withBoys {

    public static void main(String[] args) {
//(String) Reverse
//Write a return method that can reverse  String
//Ex: Reverse("ABCD"); ==> DCBA

  reverse("ABCD");

    }

    public static void reverse(String sentence){

        for (int i=sentence.length()-1; i>=0; i--){
            System.out.print(sentence.charAt(i));
        }
    }

}
