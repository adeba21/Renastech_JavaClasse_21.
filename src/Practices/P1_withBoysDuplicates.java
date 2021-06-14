package Practices;

public class P1_withBoysDuplicates {
    public static void main(String[] args) {

//Write a return method that can remove the duplicated values from String
//Ex:  removeDup("AAABBBCCC")  ==> ABC

        removeDuplicates("AAABBBCCC");

}

public static void removeDuplicates(String str){

        char [] arr=str.toCharArray();

        String result="";

        for (char size:arr){
            if (result.indexOf(size)==-1){
                result+=size;
                System.out.println(result);
            }
        }
    System.out.println("When duplicated are removed, the result is : " + result);
}

}

