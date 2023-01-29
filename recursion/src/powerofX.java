import java.util.Scanner;

public class powerofX {
    public static int printpower(int n,int x){
        if(x==0&&n==0){
            return 1;
        }
        if(n==0){
            return 0;
        }
        if (x==0){
            return 1;
        }
        int ans=printpower(n,x-1);

        return n*ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        System.out.println(printpower(n,x));
    }
}
