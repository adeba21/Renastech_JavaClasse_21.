package Day03;

public class practice {

    public static void main (String[] args){

        //  Create 3 different number and link them

        int x= 20;

        int y= x+7;

        int z= y+8;

        System.out.println(" X is " + x);
        System.out.println(" Y is "+y);
        System.out.println(" Z is "+z);

        System.out.println("sum of x,y,z : " +x+y+z);
        System.out.println("sum of x,y,z "+ (x+y+z));

       boolean divisibleBy2= x % 2 == 0 ;
       boolean divisibleBy3= x % 3 == 0 ;

       System.out.println(x+" is divisible by 2 "+divisibleBy2);
       System.out.println(x+" is divisible by 2 "+divisibleBy3);

    }
}
