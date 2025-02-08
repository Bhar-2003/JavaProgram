import java.util.Scanner;
public class PerfectSmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Perfect Number
        System.out.println("Enter the Lower Limit :");
        int lower_limit = sc.nextInt();
        System.out.println("Enter the Upper Limit :");
        int upper_limit = sc.nextInt();
        for (int j = lower_limit; j <= upper_limit; j++) {
            int num = j;
            int sum = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            if (sum == num) {
                System.out.println("The given " + num + " is a Perfect Number");
                return;
            }
        }
    }
}
