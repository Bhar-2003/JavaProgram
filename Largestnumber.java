import java.util.Scanner;

public class Largestnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array :");
        int size=sc.nextInt();
        int large_value=0;
        System.out.println("Enter the Elements of Array :");
        int arr[]=new int[size];
        for (int i=0;i<=arr.length-1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array Elements :");
        for (int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
            if(arr[i]>arr[0]){
                large_value=arr[i];
            }
            else {
                large_value=arr[0];
            }
        }
        System.out.println();
        System.out.println("The Largest Element is "+large_value);
    }
}
