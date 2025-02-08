import java.util.Scanner;
public class StrongThirdPositionNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Strong Number
        System.out.println("Enter the Lower Limit :");
        int lower_limit=sc.nextInt();
        System.out.println("Enter the Lower Limit :");
        int upper_limit=sc.nextInt();
        int position=1;
        for (int j=lower_limit;j<=upper_limit;j++) {
            int num=j;
            int temp=num,sum=0;
            while (num > 0) {
                int reminder = num % 10;
                int fact = 1;//again initialization for 15 step
                for (int i = 1; i <= reminder; i++) {
                    fact *= i;
                }
                sum += fact;
                num /= 10;
            }

            if (temp == sum) {
                if (position % 3 == 0) {
                    System.out.println("The given " + sum + " is an Third Position Strong Number.");
                }
                position++;
            }
        }
    }
}
