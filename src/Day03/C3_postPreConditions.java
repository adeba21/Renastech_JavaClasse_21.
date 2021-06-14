package Day03;

public class C3_postPreConditions {

    public static void main(String[] args){

        // pre: this will change the value of the number immediately

        int x=10;
        System.out.println(x);
        System.out.println(++x);
        System.out.println(x); // the value stays as is
        System.out.println(++x);

        int y= 20;
        System.out.println(y);
        System.out.println(--y);
        System.out.println(y); // the value stays as is

        // post:  first wont change anything on variable, at the end it will change

        int z= 15;

        System.out.println(z++);
        System.out.println(z);
        System.out.println(z--);
        System.out.println(z);

        int w=20;
        System.out.println(w--);
        System.out.println(w--);

        int i=15;
        System.out.println(--i);
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);

    }
}
