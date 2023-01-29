import java.util.Scanner;

public class squarerootwithoutmathfunction {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        int output =0;
        while(output*output<=n){
            output=output+1;
        }
        System.out.println(output-1);
    }
}
