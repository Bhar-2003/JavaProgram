import java.util.Scanner;
public class HappyLargestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Lower Limit :");
        int lower_limit=sc.nextInt();
        System.out.println("Enter the Upper Limit :");
        int upper_limit=sc.nextInt();
        System.out.println("Printing Happy Largest Number in terms of Range :");
        for (int i=upper_limit;i>=lower_limit;i--){
            int num=i;
            int temp=num;
            int reminder,sum=0;
            while(num>9) {
                while(num>0) {
                    reminder=num%10;
                    sum+=(reminder*reminder);
                    num/=10;
                }
                num=sum;
                sum=0;
            }
            if(num==1) {
                System.out.println("The given "+temp+" is a Happy Number");
                return;
            }
        }
    }
}