import java.util.Scanner;

public class fabonacci {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(fab(n));
    }

    public static  int fab(int n) {
        if (n==0||n==1){
            return n;
        }
        return fab(n-1)+fab(n-2);
    }
}
