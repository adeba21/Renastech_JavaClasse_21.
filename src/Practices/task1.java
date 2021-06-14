package Practices;

import java.util.Arrays;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        String firstName="Demhat ";
        String lastName=" Bademkiran";

        System.out.println(firstName.indexOf("e"));

        int x=9;
        int y=21;


        System.out.println(Math.max(x,y));
        System.out.println(Math.sqrt(x));
        System.out.println(Math.random());

        //Print "1" if x is equal to y, print "2" if x is greater than y, otherwise print "3".
        if (x==y){
            System.out.println("1");
        }else if (x>y){

            System.out.println("2");
        }else{
            System.out.println("3");
        }

        int demo=20;

        String result=(demo==21)?"merhaba":"Hey";//ternary operator
        System.out.println(result);


        int day=4;

        switch (day){
            case 1:
                System.out.println("Demhat");
            case 2:
                System.out.println("Ramazan");
                break;
            default:
                System.out.println("invalid number");
        }

        int dem=1;
        do {
            System.out.println(dem);
            dem++;
        }
        while(dem<10);


        for (int demhat=1; demhat<=10; demhat++){
            System.out.println(demhat+":"+" Hey ");
        }

        String [] brands={"Nike","Adidas", "New Balance", "Puma"};
        for (String d:brands){
            System.out.println(d);
        }

        for (int d=0; d<=10; d++){
            if (d==6){
               break;
            }

            System.out.println(d+" Demhat Bademkiran");
        }
String [] cars={"BWM","Nissan","Toyota"};
        System.out.println(cars[1]);

        cars[0]="Opel";
        System.out.println(cars[0]);
        System.out.println(cars.length);
        for (String demo1:cars){
            System.out.println(demo1);
        }

        int[][] z={{1,2,3,4,5},{6,8,8,10}};
        }


}



