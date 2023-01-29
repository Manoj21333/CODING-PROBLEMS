import java.util.Scanner;

public class printnumbersincreasinfform {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        printnum(n);
    }
    public static void printnum(int n){
     if (n==0){
         return ;
     }
     printnum(n-1);
        System.out.print(n+" ");
    }
}
