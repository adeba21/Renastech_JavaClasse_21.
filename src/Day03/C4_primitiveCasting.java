package Day03;

public class C4_primitiveCasting {

    public static void main (String[] args){

        // 2 types of primitive casting
            // 1- implicit casting (done automatically from java)
            // 2- explicit casting ( needs to be handle manually)

        byte    a=20;
        long    l1=a;// this is implicit casting
        int     i1=10;
        byte    b2=(byte)i1;// casting done by programmer manually

        double  c1=2.3;
        float   f1=(float) c1; // explicit casting

        int     i2=2000;
        long    l2=i2;
        short   s1=(short) l2;
        byte    b3=(byte) s1;





    }
}
