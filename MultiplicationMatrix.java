import java.util.Scanner;

public class MultiplicationMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Array :");
        int size=sc.nextInt();
        System.out.println("Enter the Elements of Array 1 :");
        int arr1[][]=new int[size][size];
        for (int i=0;i<=size-1;i++){
            for (int j=0;j<=size-1;j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the Elements of Array 2 :");
        int arr2[][]=new int[size][size];
        for (int i=0;i<=size-1;i++){
            for (int j=0;j<=size-1;j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array 1 Matrix :");
        for (int i=0;i<=size-1;i++){
            for (int j=0;j<=size-1;j++) {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Array 2 Matrix :");
        for (int i=0;i<=size-1;i++){
            for (int j=0;j<=size-1;j++) {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        int mult[][]=new int [size][size];
        System.out.println("Multiplication of two Matrix :");
        for (int i=0;i<=size-1;i++){
            for (int j=0;j<=size-1;j++) {
                for (int k = 0; k <= size - 1; k++) {
                    mult[i][j] += arr1[i][k] * arr2[k][j];
                }
                System.out.print(mult[i][j]+" ");
            }
            System.out.println();
        }
    }
}
