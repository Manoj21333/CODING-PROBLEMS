import java.util.Scanner;

public class sumandproduct {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number ");
        int  n= sc.nextInt();
        int C = sc.nextInt();
        if (C==1){
            int sum=0;
            for(int i=1;i<=n;i++){
                sum+=i;

            }
            System.out.println("the sum of the numbers upto n is "+sum);
        }
        else if (C==2){
            int product=1;
            for(int i=1;i<=n;i++){
                product*=i;

            }
            System.out.println("the product of the numbers upto n is "+ product);
        }
        else
            System.out.println("-1");
    }
}
