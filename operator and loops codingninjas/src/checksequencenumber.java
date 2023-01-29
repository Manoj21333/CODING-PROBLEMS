import java.util.Scanner;

public class checksequencenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc .nextInt();
        int prev = sc.nextInt();
        int count =2;
        boolean isdec=true;
        while(count<=n){
            int curr=sc.nextInt();
            if(curr==prev){
                isdec=false;
                System.out.println("false");
                return;
            }
             if(curr<prev){
                 if (isdec=false) {
                     System.out.println("false");
                     return;
                 }
                }
                else
                    if(isdec=true){
                        isdec=false;


            }
                    prev=curr;
                    count++;
            System.out.println("true");
        }

    }
}
