import java.util.Scanner;

public class MagicThirdPositionNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Lower Limit :");
        int lower_limit = sc.nextInt();
        System.out.println("Enter the Upper Limit :");
        int upper_limit = sc.nextInt();
        System.out.println("Magic Even Position Number in terms of Range :");
        for (int i = lower_limit; i <= upper_limit; i++) {
            int num = i;
            int reminder,position=1, sum = 0;
            int number = num;
            while (number > 9) {
                while (number > 0) {
                    reminder = number % 10;
                    sum += reminder;
                    number /= 10;
                }
                number = sum;
                sum = 0;
            }
            if (number == 1 ) {
                if(position % 3 == 0){
                System.out.println("The given " + num + " is a Magic Number ");
                }
                position++;
            }
        }
    }
}
