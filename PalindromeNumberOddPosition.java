import java.util.Scanner;
public class PalindromeNumberOddPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Palindrome Number in terms of Ascending Order
        System.out.println("Enter the Lower Limit :");
        int lower_limit = sc.nextInt();
        System.out.println("Enter the Upper Limit :");
        int upper_limit = sc.nextInt();
        int position=1;
        for (int i = lower_limit; i <= upper_limit; i++) {
            int number = i;
            int temp = number;
            int reverse = 0;
            while (number > 0) {
                int reminder = number % 10;
                reverse = (reverse * 10) + reminder;
                number /= 10;
            }
            if (temp == reverse) {

                    if (position % 2 != 0) {
                        System.out.println("The given " + temp + " is a Palindrome number and Prints Odd Position");
                    }
                position++;
                }
            }
        }
    }