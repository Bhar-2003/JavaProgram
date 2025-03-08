import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Array :");
        int size=sc.nextInt();
        System.out.println("Enter the Elements of Array :");
        int arr[][]=new int[size][size];
        for (int i=0;i<=arr.length-1;i++){
            for (int j=0;j<=arr.length-1;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original Matrix :");
        for (int i=0;i<=arr.length-1;i++){
            for (int j=0;j<=arr.length-1;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Transpose Matrix :");
        for (int i=0;i<=arr.length-1;i++){
            for (int j=0;j<=arr.length-1;j++) {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }

    }
}
