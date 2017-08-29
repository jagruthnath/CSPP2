import java.util.Scanner;
public class SumOfEven
{
    public static void main(String [] a)
    {
        Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        System.out.println("Sum of first "+n+" integers is : "+n*(n+1));
    }
}
