import java.util.Scanner;

public class square2 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the numbers of rows");
        int n=s.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print(j+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
