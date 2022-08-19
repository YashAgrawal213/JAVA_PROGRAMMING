import java.util.Scanner;

public class Binary_Search
{
    public void search(int ar[], int s )
    {
        int start=0;
        int end= ar.length-1;
        int mid= (start+end) /2;
        while (s != ar[mid] && start <= end)
        {
            mid= (start+end) /2;
            if (s > ar[mid])
            {
                start = mid+1;
            }
            else
            {
                end=mid-1;
            }
        }

        if (s == ar[mid])
        {
            System.out.println("search successful found at  "+ (mid+1));
        }
        else
        {
            System.out.println("search faied");
        }
    }
    public static void main(String[] args)
    {
        Binary_Search obj= new Binary_Search();
        int ar[]={1,2,6,7,9,12,16,18,25,29,36,48,59,66,70,76,85,89,92,96,99,100};
        System.out.println("enter element to be searched");
        Scanner t= new Scanner(System.in);
        int s= t.nextInt();
        obj.search(ar,s);

    }
}
