package Day20;

import java.util.Arrays;

public class C1_sumDigitsFromString {

    public static void main(String[] args) {

     /*
    write a program that can return the sum of all the digits from a string
            ex:
                input: "hello 5world a1b2c3"
                output: 11
                    (1+2+3 + 5=11)
            HINT: on ascii table, the characters between #48 ~ #57 are digits
     */

        String str="hello 5world a1b2c3";

        char [] arr=str.toCharArray();

        System.out.println(Arrays.toString(arr));

        int result=0;
        int result2=0;
        for (char each: arr){
            if (each>=48 && each<=57){ // First way
                result+=Integer.parseInt(""+each);
            }
            if (Character.isDigit(each)){// Second way
                result2=Integer.parseInt(""+each);
            }
        }
        System.out.println(result);
        System.out.println(result2);
    }
}
