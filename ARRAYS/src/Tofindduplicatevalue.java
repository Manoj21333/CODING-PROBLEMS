import java.util.Scanner;

public class Tofindduplicatevalue {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter the element of array");
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();

        }
        for (int i=0;i< arr.length-1;i++){
            for (int j=i+1;j< arr.length;j++){
            if( (arr[i]==arr[j])&&(i!=j)){
                System.out.println("duplicate value is "+arr[j]);
                }

            }

        }


    }
}
