package Day04;

public class practice {
    public static void main (String [] args){
        // x y z
        // min number
        // create a logic that will going to print minimum number between 3 numbers
        int x= 245;
        int y = -500;
        int z= 0;
        boolean xMax= x>y && x>z ;  // false && false == false
        //x has to smaller then y and smaller then z
        boolean yMax1= y>x && y>z ; // true && true = true
        //if y is minimum number then y has to be smaller then x and z
        boolean zMax2= z>x && z>y ; // true && false == false
        if (xMax){//false
            //java wont check inside this if
            System.out.println(x + " is the maximum number between " + x + " , " + y + " , " + z );
        }
        if (yMax1){//true
            System.out.println(y + " is the maximum number between " + x + " , " + y + " , " + z );
        }
        if (zMax2){ // false
            //java wont check inside this if
            System.out.println(z + " is the maximum number between " + x + " , " + y + " , " + z );
        }

    }
}

