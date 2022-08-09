import java.util.Scanner;

public class Array_Insertion_At_Any_Position
{
    public static void main(String[] args)
    {
        int n,m,p;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of elements in array");
        n=sc.nextInt();
        int a[]= new int[n];
        int b[]= new int[n+1];
        System.out.println("enter values");
        for (int i = 0; i < n; i++)
        {
            a[i]= sc.nextInt();
        }
        System.out.println("enter position where value to be inserted");
        m=sc.nextInt();
        System.out.println("enter new value to be inserted");
        p=sc.nextInt();
        for (int i = 0; i < (n+1); i++) {
            if (i<(m-1))
            {
                b[i]= a[i];
            }
            else if (i==(m-1))
            {
                b[i]=p;
            }
            else
            {
                b[i]= a[i-1];
            }
        }
        System.out.println("elements are:");
        for (int i = 0; i < (n+1); i++)
        {
            System.out.println(b[i]);
        }
    }


}
