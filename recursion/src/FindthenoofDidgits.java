import java.util.Scanner;

public class FindthenoofDidgits {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println( printdigit(n));
    }
    public static int printdigit(int n){
        if(n==0){
            return 0;
        }
        int smallans=printdigit(n/10);
        return smallans+1;
    }
}
