import java.util.Scanner;

public class AdditionOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int size=sc.nextInt();
        System.out.println("Enter the Elements of Array :");
        int arr[]=new int[size];
        for (int i=0;i<=arr.length-1;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for (int i=0;i<=arr.length-1;i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum of Array "+sum);
    }
}
