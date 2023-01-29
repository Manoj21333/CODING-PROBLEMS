import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int i=1;
        System.out.println("enter the number ");
        int n=sc.nextInt();

        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
