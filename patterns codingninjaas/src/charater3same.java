import java.util.Scanner;

public class charater3same {
            public static void main(String[] args) {
                Scanner s= new Scanner(System.in);
                System.out.println("enter the number");
                int n=s.nextInt();
                for (int i=0;i<n;i++){
                    char ch=(char)('A'+i);
                   for (int j=0;j<=i;j++){
                        System.out.print(ch+" ");
                    }
                    System.out.println();
                }

            }
}
