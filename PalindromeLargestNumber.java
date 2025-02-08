import java.util.Scanner;
public class PalindromeLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Palindrome Number in terms of Largest Number in given Range
        System.out.println("Enter the Lower Limit :");
        int lower_limit = sc.nextInt();
        System.out.println("Enter the Upper Limit :");
        int upper_limit = sc.nextInt();
        for (int i = upper_limit; i >= lower_limit;i--) {
            int number = i;
            int temp = number;
            int reverse = 0;
            while (number > 0) {
                int reminder = number % 10;
                reverse = (reverse * 10) + reminder;
                number /= 10;
            }
            if (temp == reverse) {
                System.out.println("The given " + temp + " is a palindrome number and Prints largest among the range");
                return;
            }
        }
    }
}