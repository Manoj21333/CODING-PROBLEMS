import java.util.Scanner;

public class printnames {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        String  names[]=new String[n];
        System.out.println("enter the elements of the array");
        for (int i=0;i<n;i++){
            names[i]=sc.next();
        }
        System.out.println("the various names are given as :");
        for (int i=0;i< names.length;i++){
            System.out.println("names "+(i+1)+" :"+names[i]);
        }
    }
}
