package Day19;

import java.util.ArrayList;

public class C7_listPractice {

    //create an list of Integers
    //add 4 numbers
    //return maximumnumber

    public static void main(String[] args) {


        ArrayList<Integer> numberList=new ArrayList<>();
        numberList.add(-250);
        numberList.add(57);
        numberList.add(-600);
        numberList.add(0);

        //just assume max number is list index 0
        int maximum=numberList.get(0);
        //create your loop that will check each number and compare with maximum number
        //if it is bigger it will reassigne to maximum
        for (int i=0; i <numberList.size() ; i++){

            if (numberList.get(i)>maximum){
                maximum = numberList.get(i);
            }

        }

        System.out.println(maximum);

//create logic that will print the minumum from arraylist

        //int minumum=numberList.get(0);
        int minumum= Integer.MAX_VALUE; //2147483647
        System.out.println(Integer.MAX_VALUE);

        for (int i =0 ; i< numberList.size() ;i++){
            if(numberList.get(i) < minumum){
                minumum = numberList.get(i);
            }
        }

        System.out.println(minumum);


    }
    }

