import java.util.Scanner;

public class binarytoDecimal {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int res =0;
        for (int i=0;n!=0;i++){
            int x= n%10;
            res+=( (int)Math.pow(2,i))*x;
            n=n/10;
        }
        System.out.println(res);
    }
}
