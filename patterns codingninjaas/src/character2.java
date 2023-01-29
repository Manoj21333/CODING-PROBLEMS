import java.util.Scanner;

public class character2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= n; j++) {
                System.out.print((char) (ch + j));
            }
            System.out.println();
        }
    }
    }
