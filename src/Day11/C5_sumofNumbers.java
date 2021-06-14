package Day11;
import java.util.Scanner;
public class C5_sumofNumbers {

        //create a java logic that will sum the given numbers
        //ex if input is 5 ;
        //output will be 1 + 2 +3 + 4 +5 == 15
        public static void main(String[] args) {

            Scanner scanner=new Scanner(System.in);
            System.out.println("Please enter your number here");
            int number=scanner.nextInt();//this will read given number from consule
            int start=0;
            int sum=0; //1 + 2 +3
            while (start <= number){ //0 1 2 3 4  (4 <= 3)
                sum += start ; //0 + 0 + 1 + 2 + 3
                start ++;//1 2 3 4
            }
            System.out.println(sum);
        }
}
