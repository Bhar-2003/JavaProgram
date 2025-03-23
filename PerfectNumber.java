import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        //Perfect Number or Complete Numbers or Aliquot or granville
        System.out.println("Enter the Number :");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                sum+=i;
            }
        }
    if(sum==num) {
        System.out.println("The given "+num+" is a Perfect Number");
    }
    else {
        System.out.println("The given "+num+" is not a Perfect Number");
    }
    }
    }
