package Day03;

public class C2_unaryOperators {

    public static void main(String[]args){

        // create variables

        byte b1= 5;
        byte b2= b1;
        int  b3= -b1;
        int  b4= +b3;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);


        int x=21;
        int y= -x;
        boolean z= y>0;
        boolean w= x<= 0;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(w);
    }
}
