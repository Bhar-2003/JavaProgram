import java.util.Scanner;
public class SecondSmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array :");
        int size = sc.nextInt();
        System.out.println("Enter the Elements of Array :");
        int arr[] = new int[size];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = sc.nextInt();
        }
        int small_number1 = arr[0];
        int small_number2 = 0;
        int len=arr.length;
        System.out.println("Array Elements :");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i]+" ");
            if(arr[i]<small_number1){
                small_number2=small_number1;
                small_number1=arr[i];
            }
            else if (arr[i]>small_number1 && ( small_number2==0||arr[i]<small_number2)){
                small_number2=arr[i];
            }
        }
        System.out.println();
        System.out.println("The Second Smallest Element is "+small_number2);
    }
}
