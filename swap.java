import java.util.Scanner;
public class swap
{
    swap()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter I value");
        int a = sc.nextInt();

        System.out.println("enter II value");
        int b = sc.nextInt();

        System.out.println("value of a before swapping="+a);
        System.out.println("value of b before swapping="+b);

        int c = a;
        a=b;
        b=c;

        System.out.println("............................................");
        System.out.println("value of a after swapping="+a);
        System.out.println("value of b after swapping="+b);
    }

    public static void main(String args[])
    {
        swap obj = new swap();

    }
}
