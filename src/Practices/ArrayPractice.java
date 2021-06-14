package Practices;


import java.util.Scanner;

public class ArrayPractice {


    public static void main(String[] args) {

        Scanner Demhat=new Scanner(System.in);

        System.out.println("Please enter a number for selecting days");

        int day=Demhat.nextInt();

        switch (day){

            case 10:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Number");

        }



}
}
