import java.util.Arrays;
public class array {
    public static void main(String[] args){

        int[] my_array1 = {

        String[] my_array2 = {

        };
        System.out.println("Original numeric array : "+Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("Sorted numeric array : "+Arrays.toString(my_array1));

        System.out.println("Original string array : "+Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println("Sorted string array : "+Arrays.toString(my_array2));
    }
}
