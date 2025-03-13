import java.util.Scanner;
public class BubbleSort {
    static void sort(int arr[]){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array :");
        int size=sc.nextInt();
        System.out.println("Enter the array Elements :");
        int arr[]=new int[size];
        for (int i=0;i<=arr.length-1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Original Array :");
        for (int ar : arr){
            System.out.print(ar+" ");
        }
        System.out.println();
        sort(arr);
        System.out.println("Bubble Sorted Array :");
        for (int ar :arr){
            System.out.print(ar+" ");
        }
    }
}
