public class MergeSort {
    static void mergeSort(int arr[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    static void merge(int arr[],int left,int mid,int right){
        int size1=mid-left+1;
        int size2=right-mid;
        int left_array[]=new int[size1];
        int right_array[]=new int[size2];
        System.arraycopy(arr, left, left_array, 0, size1);
        System.arraycopy(arr, mid + 1, right_array, 0, size2);
        int i=0,j=0,k=left;
        while(i<size1 && j<size2){
            if(left_array[i]<=right_array[j]){
                arr[k]=left_array[i];
                i++;
            }
            else {
                arr[k]=right_array[j];
                j++;
            }
            k++;
        }
        while (i<size1){
            arr[k]=left_array[i];
            i++;
            k++;
        }
        while (j<size2){
            arr[k]=right_array[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,52,56,53,89,23,67,90,23};
        System.out.println("Original Array :");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        mergeSort(arr,0,arr.length-1);
        System.out.println("Sorted Array");
        for (int ar : arr){
            System.out.print(ar+" ");
        }
    }
}
