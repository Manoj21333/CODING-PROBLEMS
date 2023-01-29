public class incrementdecrement {
    public static void main(String[] args) {
        int a=50,b=60;
        if(a++>50&&b++>60){
            System.out.println("inside if ");
        }
        else
            System.out.println("inside else");
        System.out.println(a+" "+b);
    }
}
