import java.util.Scanner;

public class Factors {
    public static void main(String[] a)
    {
        Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        int i=1;
        do {
            if (n%i==0)
                System.out.println(i);
        }while (i++<=n/2);
        System.out.println(n);
    }
}
