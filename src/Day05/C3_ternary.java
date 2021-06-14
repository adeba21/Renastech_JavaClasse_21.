package Day05;

public class C3_ternary {

    public static void main(String[]args){
        // create a project that will print max number between two numbers

        int number1=25;
        int number2=35;
        int max=0;

        String message= "";

        if (number1>number2){
            max = number1;
        } else{
            max= number2;
        }
        message= " The maximum number is " +max;
        System.out.println(message);

        // ternary
        // if ?
        // else :

        int max2= (number1> number2) ? number1: number2 ;
        System.out.println(max2);
        String result= "";

        result=(true)? "JAVA" : "PYTHON";
        System.out.println(result);

    }
}
