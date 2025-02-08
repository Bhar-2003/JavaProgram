import java.util.Scanner;
public class AutomorphicOddNumberPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Automorphic Number in terms of Ascending Order
        System.out.println("Enter the Lower Limit :");
        int lower_limit=sc.nextInt();
        System.out.println("Enter the Upper Limit :");
        int upper_limit=sc.nextInt();
        System.out.println("Odd Number Automorphic Number with in the Range :");
        System.out.println();
        for (int i=lower_limit;i<=upper_limit;i++){
            int num = i;
            int sqr = num * num;
            int count = 0;
            int temp = num;
            while (num > 0) {
                num /= 10;
                count++;
            }
            int  reverse= (int) (sqr%(Math.pow(10, count)));
            int position=1;
            if (temp == reverse) {
                if(position%2!=0) {
                    System.out.println(temp);
                    position++;
                }
                else
                {
                    System.out.println("There is no Even Position Automorphic Number in the Range");
                }
            }
        }
    }
}