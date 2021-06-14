package Day04;

public class C1_logicalOperators {

    public static void main(String [] args){


        // && means and
        // || means or
        // ! means not (opposite)

        System.out.println((5>3) && (3>5));
        System.out.println((10>1) && (5<26));
        System.out.println((2==3) && (3>=5));
        System.out.println((3>10) && (2==3));

        // || or
System.out.println("*************************");

        System.out.println((5>3) || (3>5));
        System.out.println((10>1) || (5<26));
        System.out.println((2==3) || (3>=5));
        System.out.println((3>10) || (2==3));


        System.out.println("*************************");

        boolean bo1=true;
        boolean bo2=!(10!=15);

        System.out.println(bo1&&bo2);

        boolean boo3= !!!!!!bo1;
        boolean boo4=!(10>=10);

        System.out.println( (boo3 || boo4) && true);

        System.out.println(("Ramazan" == "Sibel") || ("sibel"=="Sibel")); // everything has to match in parenthesis. if not, it will be false


    }
}
