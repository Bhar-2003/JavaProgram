public class Main {
    public static void main(String[] args){
        Main.m1(1);
    }
    public static void m1(int i)
    {
        System.out.print(i);
        if(i>=3) return;
        m1(i+1);
        m1(i+1);
        System.out.print(i);
        m1(i+1);
        System.out.print(i);
    }
}