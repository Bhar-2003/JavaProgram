import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(int arr[]){
        for (int i=0;i<arr.length;i++){
            int index=i;
            for (int j=i;j<=arr.length-1;j++){
                if (arr[index]>arr[j])
                    index=j;
            }
            if (i!=index){
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Elements :");
        int size=sc.nextInt();
        System.out.println("Enter the Elements of Array :");
        int arr[]=new int[size];
        for (int i=0;i<=arr.length-1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Original Array :");
        for (int ar : arr)
            System.out.print(ar+" ");
        System.out.println();
        selectionSort(arr);
        System.out.println("Sorted Array :");
        for (int ar : arr)
            System.out.print(ar+" ");
    }
}
