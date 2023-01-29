import java.util.Scanner;

public class Sumofnaturalnumbers {
    public static int printsum(int n) {
        if (n==1){
            return 1;
        }
        int ans=printsum(n-1);
        return n+ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(printsum(n));
    }
}
