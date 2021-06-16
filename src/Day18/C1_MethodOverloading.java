package Day18;

public class C1_MethodOverloading {

    public static void main(String[] args) {
        String str="Demhat";
        String revers="";

        for (int i=str.length()-1; i>=0; i--){
revers+=str.charAt(i);
            System.out.println(revers);
        }
        System.out.println(revers);
    }
}
