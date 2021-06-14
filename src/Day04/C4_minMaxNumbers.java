package Day04;

public class C4_minMaxNumbers {

    public static void main (String [] args){
        // x y z
        // min number
        // create a logic that will going to print minumum number between 3 numbers
        int x= 245;
        int y = -500;
        int z= 0;
        boolean xMin= x<y && x<z ;  // false && false == false
        //x has to smaller then y and smaller then z
        boolean yMin= y<x && y<z ; // true && true = true
        //if y is minimum number then y has to be smaller then x and z
        boolean zMin= z<x && z<y ; // true && false == false
        if (xMin){//false
            //java wont check inside this if
            System.out.println(x + " is the minimum number between " + x + " , " + y + " , " + z );
        }
        if (yMin){//true
            System.out.println(y + " is the minimum number between " + x + " , " + y + " , " + z );
        }
        if (zMin){ // false
            //java wont check inside this if
            System.out.println(z + " is the minimum number between " + x + " , " + y + " , " + z );
        }
        // create a logic that will going to print maximum number between 3 numbers
    }

}
