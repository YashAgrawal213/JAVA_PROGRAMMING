import java.util.Scanner;

public class Array_Creation
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of elements in array");
        n=sc.nextInt();
        int a[]= new int[n];
        System.out.println("enter values");
        for (int i = 0; i < n; i++)
        {
            a[i]= sc.nextInt();
        }
        System.out.println("elements are:");
        for (int i = 0; i < n; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
