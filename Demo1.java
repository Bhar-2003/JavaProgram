import java.util.Scanner;

public class Demo1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int size = sc.nextInt();
        System.out.println("Enter the Elements of Array 1 :");
        int arr[][] = new int[size][size];
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr.length - 1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the Elements of Array 2 :");
        int arr2[][] = new int[size][size];
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr.length - 1; j++) {
                arr2[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Array 1 Matrix :");
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr.length - 1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Array 1 Matrix :");
        for (int i = 0; i <= arr2.length - 1; i++) {
            for (int j = 0; j <= arr2.length - 1; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int mult[][] = new int[size][size];
        System.out.println("Multiplication Matrix :");
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr.length - 1; j++) {
                for (int k = 0; k <= size - 1; k++) {
                    mult[i][j] += arr[i][k] * arr2[k][j];
                }
                System.out.print(mult[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
