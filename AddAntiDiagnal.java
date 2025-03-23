import java.util.Scanner;

public class AddAntiDiagnal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int size=sc.nextInt();
        System.out.println("Enter the Elements of Array :");
        int arr[][]=new int[size][size];
        for (int i=0;i<=arr.length-1;i++){
            for (int j=0;j<=arr.length-1;j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("Matrix :");
        for (int i=0;i<=arr.length-1;i++){
            for (int j=0;j<=arr.length-1;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int sum=0;
        for (int i=0;i<=size-1;i++){
                sum += arr[i][size-1-i];
        }
        System.out.println("Sum of Primary Diagonal "+sum);
    }
}
