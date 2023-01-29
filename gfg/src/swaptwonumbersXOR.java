import java.io.*;
public class swaptwonumbersXOR {
    static void swaptwonumbersusingbitwiseXOR(int m,int n){
        m=m^n;
        n=m^n;
        m=m^n;
        System.out.println("swaped values are");
        System.out.println(m);
        System.out.println(n);
    }
    public static void main(String[] args){
        int a=8;
        int b= 9;
        swaptwonumbersusingbitwiseXOR(a,b);

    }
}
