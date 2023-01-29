import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();

        int level = 0;
        switch (s) {
            case "aarti":
                level = 1;
                break;
            case "bharti":
                level = 2;
                break;
            case "expert":
                level = 3;
                break;
            default:level =0;}
                System.out.println("your level is"+level);



    }
}