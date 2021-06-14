package Practices;

import java.util.Scanner;

public class sumofnumbers {

    //Write a program to calculate the sum of following series where n is input by user.

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int sum=0;
        int number = 0;
        System.out.println("Please enter your numbers");
        number=scan.nextInt();

        for (int i=0; i<=number; i++){
            sum+=number+i;
            System.out.println(sum);
        }
        System.out.println("sum is: "+sum);



    }

    }

