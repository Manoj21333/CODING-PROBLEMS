import java.util.Arrays;
import java.util.Scanner;

public class reverseintegersvalue2 {    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the size of array");
    int size=sc.nextInt();
    int arr[]=new int[size];
    System.out.println("enter the elements of array");
int temp=0;
    for(int i=0;i<size;i++){
        arr[i]= sc.nextInt();
    }
    System.out.println("reverse of the array");
    for (int i=0;i<size;i++){
        temp=arr[i];
        arr[i]=arr[size-i-1];
        arr[size-i-1]=temp;
    }
    System.out.println("reverse array "+ Arrays.toString(arr));
}

}
