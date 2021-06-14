package Practices;

import java.util.Arrays;

public class P1_withBoysMaxIntMethod {

    //(Array) Find Maximum
//Write a method that can find the maximum number from an int Array

    public static void main(String[] args) {

        int array[] = new int[]{21231, -132142, 1234567, 2121, 0, 21};

        int max = maxNumber(array);
        System.out.println("The maximum number is: "+max);

        int min = minNumber(array);
        System.out.println("The minimum number is: "+min);
    }

    public static int maxNumber(int[] inputArray){

        int maxValue = inputArray[0];

        for(int i=1;i < inputArray.length;i++){
            if(inputArray[i] > maxValue){
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    public static int minNumber(int[] inputArray){
        int minValue = inputArray[0];
        for(int i=1;i<inputArray.length;i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
}


