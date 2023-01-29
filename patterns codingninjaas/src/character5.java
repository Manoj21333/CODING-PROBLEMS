import java.util.Scanner;

public class character5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int m= sc.nextInt();
        for (int i=1;i<=m;i++){
            char ch= (char)('A'+m-i);
            for (int j=1;j<=i;j++){
                System.out.print((char)(ch+j-1));
            }
            System.out.println();
        }
    }
}
