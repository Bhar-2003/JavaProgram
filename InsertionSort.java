import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int arr[]){
        for (int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while (j>=0 && key<=arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array :");
        int size=sc.nextInt();
        System.out.println("Enter the Elements of Array :");
        int arr[]=new int[size];
        for (int i=0;i<=arr.length-1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Original Array :");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        insertionSort(arr);
        System.out.println("Sorted Array :");
        for (int ar :arr)
            System.out.print(ar+" ");
    }
}
