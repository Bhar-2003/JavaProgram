import java.util.Arrays;
import java.util.Scanner;

public class MergeSort1 {
    public static int[] mergeSort(int arr[]){
        if (arr.length<=1)
            return arr;
        int mid=arr.length/2;
        int first[]= mergeSort(Arrays.copyOfRange(arr,0,mid-1));
        int second[]=mergeSort(Arrays.copyOfRange(arr,mid,arr.length-1));
        return sort(first,second);
    }
    public static int[] sort(int first[],int second[]){
        int sum[]=new int[first.length+second.length];
        int i=0,j=0,k=0;
        while (i<first.length && j<second.length){
            if (first[i]<second[j])
                sum[k++]=first[i++];
            else
                sum[k++]=second[j++];
        }
        while (i<first.length)
            sum[k++]=first[i++];
        while (j<second.length)
            sum[k++]=second[j++];

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int size=sc.nextInt();
        System.out.println("Enter the Array Elements :");
        int arr[]=new int[size];
        for (int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        System.out.println("Original Array :");
        for (int ar : arr)
            System.out.print(ar+" ");
        System.out.println();
        mergeSort(arr);
        System.out.println("Merge Sorted Array :");
        for (int ar : arr)
            System.out.print(ar+" ");
    }
}
