import java.lang.StringBuffer;
public class Sample {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("JAVA");
        System.out.println(s);
        System.out.println(s.append(" WORLD"));
        System.out.println(s.insert(5,"THE "));
        System.out.println(s.length());
        System.out.println(s.charAt(6));
    }
}
