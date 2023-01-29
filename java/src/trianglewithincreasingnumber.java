import java.util.Scanner;

public class trianglewithincreasingnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 1;
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {


                System.out.print(sum+" ");
                sum++;
            }
            System.out.println();
        }

    }
}