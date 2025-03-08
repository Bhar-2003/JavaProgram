import java.util.Scanner;
public class SmallestNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array :");
        int size=sc.nextInt();
        int small_number=0;
        System.out.println("Enter the Elements of Array :");
        int arr[]=new int[size];
        for (int i=0;i<=arr.length-1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array Elements :");
        for (int j=0;j<=arr.length-1;j++){
            System.out.print(arr[j]+" ");
            if(arr[j]>arr[0]){
                small_number=arr[0];
            }
            else {
                small_number=arr[j];
            }
        }
        System.out.println();
        System.out.println("The Smallest Element is "+small_number);
    }
}
