import java.util.Scanner;

public class swaptwonumbers {
    static void swaptwonumberswithoutusingthirdvariable(int m,int n){
        m=m-n;
        n=m+n;
        m=n-m;
        System.out.println("swaped values are "+m);
        System.out.println(n);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        swaptwonumberswithoutusingthirdvariable(a,b);
    }
}
