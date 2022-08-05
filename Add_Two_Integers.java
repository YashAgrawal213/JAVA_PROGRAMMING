import java.util.Scanner;

public class Add_Two_Integers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int x = sc.nextInt();
        System.out.println("enter second number");
        int y = sc.nextInt();
        int z = x+y;

        System.out.println("addition of "+x+" and "+y+" is = "+z);
    }
}
