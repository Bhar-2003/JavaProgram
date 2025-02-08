import java.util.Scanner;
public class AutomorphicLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Automorphic Number in terms of Ascending Order
        System.out.println("Enter the Lower Limit :");
        int lower_limit=sc.nextInt();
        System.out.println("Enter the Upper Limit :");
        int upper_limit=sc.nextInt();
        System.out.println("Largest Automorphic Number with in the Range :");
        System.out.println();
        for (int i=upper_limit;i>=lower_limit;i--){
            int num = i;
            int sqr = num * num;
            int count = 0;
            int temp = num;
            while (num > 0) {
                num /= 10;
                count++;
            }
            int  reverse= (int) (sqr%(Math.pow(10, count)));
            if (temp == reverse) {
                System.out.println(temp);
                return;
            }
        }
    }
}