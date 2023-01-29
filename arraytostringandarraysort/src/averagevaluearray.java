import java.util.Scanner;

public class averagevaluearray {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
                for(int i=0;i<n;i++){
                    arr[i]= sc.nextInt();
                }
                float average=0;
                for (int i=0;i<n;i++){
                    average+=arr[i];

                }
        System.out.println("average of the elements of the array is "+average/n);
    }
}
