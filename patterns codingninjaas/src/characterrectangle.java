import java.util.Scanner;

public class characterrectangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print((char) ('A' + j));
            }
            System.out.println();
        }

    }
}
