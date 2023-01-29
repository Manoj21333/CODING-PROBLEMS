public class bitwiseoperators {
    public static void main(String[] args){
        int a=20;int b=15;
        System.out.println("bitwise and operator"+ (a&b));//
        System.out.println("bitwise or operators"+(a|b));
        System.out.println("bitwise xor operators"+(a^b));//same numbers give 0 and different give 1
        System.out.println("bitwise not operator"+ (~a));
        System.out.println("left shift operator"+(a<<2));
        System.out.println("right shift operator "+(a>>2));
    }
}
