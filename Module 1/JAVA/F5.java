import java.util.Scanner;

/**
 * Created by jagru on 8/28/2017.
 */
public class F5
{
    public static void main(String[] args) {
        String s;
        System.out.println("Enter date as dd-mm-yyyy : ");
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        String [] a=s.split("-");
        int x=Integer.parseInt(a[2]);
        if (x%4==0)
            if (x%100==0)
                if (x%400==0)
                    System.out.println("Leap year");
                else
                    System.out.println("Not a leap year");
            else
                System.out.println("Leap year");
        else
            System.out.println("Not a leap year");
    }
}
