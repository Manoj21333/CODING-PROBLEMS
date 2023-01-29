import java.util.Scanner;



public class tofindspecificvalue {
    public static boolean contain(int arr[],int x){
    for(int i=0;i< arr.length;i++){
        if(x==arr[i]){
            return true;
        }
    }
    return false;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the element to be check");
        int x = sc.nextInt();
        System.out.println(contain(arr,x));

        }
    }

