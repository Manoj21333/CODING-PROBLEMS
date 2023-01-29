import java.util.Scanner;

public class sumequalstonum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int a[] = new int[s];
        for (int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        int num = sc.nextInt();
        for (int i = 0; i < s; i++) {
            for (int j = i + 1; j < s; j++) {
                if (num == a[i] + a[j]) {
                    System.out.println(num+"="+a[i]+"+"+a[j] );
                }
            }
        }
    }
}
