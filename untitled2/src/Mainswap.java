import java.util.Scanner;

public class Mainswap
{public static void main(String [] args)
{int m;
    Scanner m=int.next();
    int n=8;
    swapvariables(m,n);



}
    static void swapvariables(int m,int n)
    {
        int temp=m;
        m=n;
        n=temp;
        System.out.println("value of one var"+m+"value of second var"+n);

    }
}
