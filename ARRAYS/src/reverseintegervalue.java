import java.util.Scanner;

public class reverseintegervalue {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter the elements of array");

        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("reverse of the array");
        for (int i=0;i<size;i++){
            System.out.println(arr[size-1-i]);
        }
    }
}
