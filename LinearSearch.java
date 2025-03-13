import java.util.Scanner;

public class LinearSearch {
    static int  linearSearch(int arr[],int key){
        System.out.println("The key Found at Index Number :");
        for (int i=0;i<=arr.length-1;i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int size=sc.nextInt();
        System.out.println("Enter the Array Elements :");
        int arr[]=new int[size];
        for (int i=0;i<=arr.length-1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Key :");
        int key=sc.nextInt();
        System.out.println("Original Array :");
        for (int ar :arr){
            System.out.print(ar+" ");
        }
        System.out.println();
        System.out.println(linearSearch(arr,key));
    }
}
