import java.util.Scanner;
public class Product {
    public static void main(String[] args) {
        //Product of Nth Digit
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the N th Digit");
        int n=sc.nextInt();
        int prd=1;
        for(int i=1;i<=n;i++)
        {
            prd*=i;
        }
        System.out.println(prd);
    }
}
