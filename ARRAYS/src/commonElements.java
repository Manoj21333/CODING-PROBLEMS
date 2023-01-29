import java.util.Scanner;
public class commonElements {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of the first array");
        int n=sc.nextInt();
        System.out.println("enter the size of second array");
        int m=sc.nextInt();
        int ar1[]=new int[n];
        int ar2 []=new int[m];
        System.out.println("enter the elements of first array");
        for (int i=0;i<n;i++){    //first array
            ar1[i]= sc.nextInt();

        }
        System.out.println("enter the elements of second array");
        for (int i=0;i<m;i++){       //second array
            ar2[i]= sc.nextInt();
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (ar1[i]==ar2[j]){
                    System.out.println("common element in both the array is "+ar1[i]);
                }
            }
        }
    }
}
