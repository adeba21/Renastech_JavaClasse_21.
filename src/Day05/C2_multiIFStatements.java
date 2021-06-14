package Day05;

public class C2_multiIFStatements {

    public static void main(String [] args){

        //multi if else blocks

        int x=23;
        int y=23;

        if (x==y){
            System.out.println(x+ " is equal to "+ y);

        } else if (x > y){

            System.out.println(x + " is bigger than "+ y);
        } else {
            System.out.println(x+ " is smaller than "+y);
        }
        System.out.println("***********");
        // starting point is 0                                                  print you are on the start
        // ending point is 10                                                   print you are at end
        // anything between the numbers means you are on the way                print you are on the way

        int num=3;

        if (num==0){

            System.out.println(" you are on the start ");
        } else if (num==10){
            System.out.println(" you are at end ");
        } else{
            System.out.println(" you are on the way ");
        }





    }
}
