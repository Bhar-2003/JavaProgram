import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Age :");
        int Age=sc.nextInt();
        if(Age>=18)
        {
            System.out.println("You are Eligible to Vote");
        }
        else {
            System.out.println("You are Not Eligible to Vote");
        }
    }
}
