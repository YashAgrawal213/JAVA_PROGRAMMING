import java.util.Scanner;
public class sum
{
    void func()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter I value");
        int a=sc.nextInt();
        System.out.println("enter II value");
        int b = sc.nextInt();
        int r= a+b;
        System.out.println("Total="+r);

    }
    public static void main(String args[])
    {
        sum obj = new sum();
        obj.func ();

    }
}

