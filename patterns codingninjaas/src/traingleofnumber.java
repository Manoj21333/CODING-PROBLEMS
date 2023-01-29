import java.util.Scanner;

public class traingleofnumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            int sum1=i;
            for (int j=1;j<=i;j++){
                System.out.print(sum1);
                sum1++;
            }
            int sum=2*i-2;
            for (int j=1;j<=i-1;j++){
              //  int sum=2*i-2;
                System.out.print(sum);
                sum--;
            }
            System.out.println();
        }
    }
}
