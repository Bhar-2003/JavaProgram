import java.util.Scanner;
public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num=sc.nextInt();
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
        if(temp==1) {
            System.out.println("The given "+temp+" is a Happy Number");
        }
        else {
            System.out.println("The given "+temp+" is a Happy Number");
        }
    }
}
