import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        int a=S.nextInt();
        System.out.println(EvenOrNot(a));
    }
    private static boolean EvenOrNot(int i)
    {
        return i % 2 == 0;
    }
}
