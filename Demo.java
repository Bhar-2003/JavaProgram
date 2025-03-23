import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size :");
        int num=76;
        int temp=num;
        int count=0;
        int sqrt=num*num;
        while (temp>0){
            temp/=10;
            count++;
        }
        int sum=(int)(sqrt%(Math.pow(10,count)));
        if(num==sum){
            System.out.println("The given number is an Automorphic Number");
        }
        else {
            System.out.println("Not an Not Number");
        }
    }
}
