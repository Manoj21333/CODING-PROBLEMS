import java.util.Scanner;

public class addtwomatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row of matrix");
        int m = sc.nextInt();
        System.out.println("enter the column");
        int n = sc.nextInt();
        int arr1[][] = new int[m][n];
        System.out.println("enter the elements of first matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j] = sc.nextInt();

            }
        }
        int arr2[][] = new int[m][n];
        System.out.println("enter the elements of second matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr2[i][j] = sc.nextInt();

            }
        }
        int arr3[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr3[i][j]+"\t" );

            }
            System.out.println();
        }
    }
}