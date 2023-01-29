import java.util.Scanner;
public class DecimaltoBinary {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num = sc .nextInt();
        long Binarynum=0;
        int placevalue =1;
        while(num!=0){
            int rem=num%2;
            Binarynum+=(long)rem*placevalue;
            placevalue*=10;
            num=num/2;
        }
        System.out.println(Binarynum);
    }
}
