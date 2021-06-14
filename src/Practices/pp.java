package Practices;

public class pp {

        public static void uniquecharacters(String test){
        String temp = "";
        for (int i = 0; i < test.length(); i++){
            if (temp.indexOf(test.charAt(i)) == - 1){
                temp = temp + test.charAt(i);
            }
        }
        System.out.println(temp + " ");
    }

    /* Driver program*/
    public static void main(String args[])
    {
        String str = "AAABBBCCCDEF";
        uniquecharacters(str);
    }
}








