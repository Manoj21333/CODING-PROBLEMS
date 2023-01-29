import java.util.Scanner;

public class APseries {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int x= sc.nextInt();
        if (x>=1&&x<=1000){
            int num=0;
            for (int i=1;i<=x;i++){
                num=3*i+2;
                System.out.print(num+" ");
            }
        }
        else
            System.out.println("the number input is larger");

    }
}
