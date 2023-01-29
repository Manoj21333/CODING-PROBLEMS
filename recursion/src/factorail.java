import java.util.Scanner;

public class factorail {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int ans =printfact(n);
        System.out.println(ans);
    }
    public static int printfact(int n){
        if(n==0){
            return 1;
        }
        int ans=printfact(n-1);
        return n*ans;
    }
}
