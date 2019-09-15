package Main;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
    public static int B;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int b = s.nextInt();

        B = b;
        if (B > 0) {
            int H = s.nextInt();
            if (H > 0) {
                boolean flag = true;
            } else System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
}