package Main;

public class Ques {
    public static void main(String[] args){
        String str1 = new String("Hello World");
        String str2 = new String("Hello World");
        String str3 = "Hello World";
        String str4 = "Hello World";
        int a = 0 , b = 0, c = 0;
        if (str3 == str4)
            a = 1;
        else
            a = 2;
        if (str1.equals(str3))
            b = 1;
        else
            b = 2;
        if (str1 == str4)
            c = 1;
        else
            c = 2;
        System.out.print(a+"\t"+b+"\t"+c);
    }

}
