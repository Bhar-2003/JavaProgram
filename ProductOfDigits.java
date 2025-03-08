import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int size=sc.nextInt();
        System.out.println("Enter the Elements of Array :");
        int arr[]=new int[size];
        for (int i=0;i<=arr.length-1;i++){
            arr[i]=sc.nextInt();
        }
        int product=1;
        for (int i=0;i<=arr.length-1;i++){
            product=product*arr[i];
        }
        System.out.println("Product of Array "+product);
    }
}
