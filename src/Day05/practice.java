package Day05;

public class practice {

    public static void main(String [] args){
        int number= 20;
        int number2= -number++ + number - ++number;

        System.out.println(number2);
        number=35;
        System.out.println(number);
        System.out.println(number2);

        int a= -10;
        int b= --a + a++ -a + --a*2 + 10/2 - 10%3 ;

        System.out.println(b);


    }
}
