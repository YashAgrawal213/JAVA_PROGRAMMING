import java.util.Scanner;
public class Binary_Search_input
{
    public static void main(String[] args)
    {
        int c=0,n;
        Scanner t= new Scanner(System.in);
        System.out.println("enter number of elemets in array");
        n=t.nextInt();
        int ar[]= new int[n];
        System.out.println("Enter the sorted array: ");
        for (int a=0 ; a<n; a++)
        {
            ar[a]= t.nextInt();
        }
        System.out.println("enter element to be searched");
        int s= t.nextInt();
        int start=0;
        int end= n-1;
        int mid = 0;

        while (start <= end)
        {
            mid=(start+end)/2;
            if(ar[mid] == s)
            {
                c++;
                break;
            }
            else if (ar[mid] < s)
            {
                start = mid+1;
            }
            else if (ar[mid] > s)
            {
                end = mid-1;
            }
        }
        if (c>0)
        {
            System.out.println("item found at position "+(mid+1));
        }
        else
        {
            System.out.println("search failed");
        }
    }
}