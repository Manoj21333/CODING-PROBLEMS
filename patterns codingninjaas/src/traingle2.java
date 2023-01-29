import java.util.Scanner;

public class traingle2 {
    public static void main(String[] args) {
                Scanner s= new Scanner(System.in);
                System.out.println("enter the number");
                int n=s.nextInt();
                int i=1;
                while (i<=n){
                    int j=1;
                    int t=i;
                    while (j<=i){
                        System.out.print(t+" ");
t++;
                        j++;
                    }
                    System.out.println();
                    i++;
                }

            }
}
