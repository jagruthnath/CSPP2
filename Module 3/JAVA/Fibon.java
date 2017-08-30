import java.util.Scanner;

public class Fibon {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        int a=S.nextInt();
        System.out.println(fibon(a));
    }
    private static int fibon(int i)
    {
        if (i==1 || i==0)
            return i;
        return fibon(i-1)+fibon(i-2);
    }
}
