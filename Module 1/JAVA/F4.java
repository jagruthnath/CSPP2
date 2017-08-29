import java.util.Scanner;

/**
 * Created by jagru on 8/28/2017.
 */
public class F4 {
    public static void main(String[] args) {
        String s;
        System.out.println("Enter input:");
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        System.out.print(s.substring(1,s.length()-1));
    }
}
