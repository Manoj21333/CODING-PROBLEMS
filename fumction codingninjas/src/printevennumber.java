import java.util.Scanner;

public class printevennumber {
    public static void printevennumber(int start,int end){
        if(start%2!=0){
            start++;
        }
       for (int i=start;i<=end;i+=2){
           System.out.println(i);
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 int m= sc.nextInt();
        printevennumber(n,m);
    }
}
