import java.util.Scanner;

public class farnehiettocelciustable {
    public static void num(int start,int end,int step){
        int current=start;
        while(current<=end){

            int farnehiet = (int) ((5.0/9) * (current - 32));
            System.out.println(current+"  "+farnehiet);
            current+=step;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int start= sc.nextInt();
int end= sc.nextInt();
int step=sc.nextInt();
num(start,end,step);

    }
}
