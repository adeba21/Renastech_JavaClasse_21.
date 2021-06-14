package Day02;

public class C3_Variables {


    public static void main (String [] args){
        // double > Float > long > int > short > byte
        // the smallest number is byte which ranges from -128 to 127
        byte b1= 25;

        System.out.println(b1);

       // byte b2= 128 this is giving you an error due to the range limit

        byte b4=100;

        System.out.println(b4);

        // SHORT data type ranges from -32,768 to 32,767

        short s1=128;
        short s2=1000;
        short s3=25;

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


        // INT ranges whole numbers from -2,147,483,648 to 2,147,483,647

        System.out.println("*******int");

        int number= 32153178;
       System.out.println(number);
       // As a default java automatically picks int for whole number, example;
        System.out.println(55);

        // LONG ranges from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        System.out.println("*******long");

        long l1=200;

        //When you run long, always put L at the end
        long l2=32981631263L;

        System.out.println(l1);
        System.out.println(l2);

        System.out.println(55555555L);

        // FLOAT stores fractional numbers. it is sufficient for 6 to 7 decimal digits
        // double stores fractional numbers. it is sufficient for 15 decimat digits

        double d1= 5.1;

        System.out.println(d1);

        // as a default java automatically picks decimal number as double

        System.out.println(3.5);

        float f1=3.5F;
        System.out.println(f1);
        // if you want java to understand it is a float, just put letter "F" at the end of number

        double d2=5.5555555555;
        System.out.println(d2);

        System.out.println(d1+f1);











    }
}
