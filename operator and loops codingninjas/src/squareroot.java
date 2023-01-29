import java.util.Scanner;

public class squareroot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number which squareroot is to be find ");
        int num = sc.nextInt();
        double square_root =Math.pow(num,0.5);
        System.out.println("squareroot of the number is " +square_root);
    }
}
