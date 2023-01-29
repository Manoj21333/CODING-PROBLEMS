public static int[] takeinput()
        {
        Scanner sc= new Scanner(Syatem.in);
        System.out.println("Enter size of the array");
        int x = sc.nextInt();
        int arr[]= new int[x];

        for(int i=0; i<x; i++)
        {
        System.out.println("Enter elememt for"+i+"index");
        arr[i] = sc.nextInt();
        } return arr;
        }

public static int largest(int arr[])
        {
        int max = Integer.MIN_VALUE ;
        for(int i=0; i<arr.length;i++){
        if(arr[i]> max){
        max = arr[i];
        }
        }return max;
        }
public static void main(String[] args)
        {

        int[] arr = takeinput();
        int lar = largest(arr);
        System.out.println(lar);

        }
        }