package Day05;

import sun.lwawt.macosx.CSystemTray;

public class C1_ifElseStatement {

    public static void main(String[]args){
        // 2 numbers
        //please create a java program to check if the 2 numbers are equal or not
        // if it is equal
        int x= 10;
        int y= 11;

        boolean bool1= x==y;

        if (bool1){
            System.out.println("Numbers are Equal!");
        } else { //this block will cover whatever left from the first condition
            // not equal
            System.out.println("Numbers are not Equal!");
        }
        if (1+1==2){
            System.out.println("1+1 = " + (1+1));
            System.out.println("1+1 is 2");
        } else {
            System.out.println("1+1 !=" +(1+1) );
            System.out.println(" 1+1 is not 2");
        }
        // please create a java program to see if numbers are even or odd

        System.out.println("************");
        int ab=21;


        boolean bool2= ab / 2 ==0;
        if (bool2){
            System.out.println(ab+ " is an even number");
        } else {
            System.out.println(ab+ " is an odd number");

        }
    }
}
