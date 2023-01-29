import java.util.Arrays;
import java.util.Scanner;

public class secondlargest {
    public static int secondlargest(int a[],int size){
        int temp;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; i < size; i++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

return a[size-2];
        }
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int size = sc.nextInt();
      int a[]=new int[size];
      for(int i=0;i<a.length;i++){
          a[i]= sc.nextInt();
      }
        System.out.println(secondlargest(a,size));
    }
}
