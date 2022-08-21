import java.util.Scanner;

public class Binary_Searching {
    public static void main(String[] args) {
        int c = 0, i , beg , end, mid=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of elements in an array ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("enter elements");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("enter element to be find");
        int x = sc.nextInt();

        beg=0;
        end = n-1;

        while (beg<=end)
        {
            mid =(beg+end)/2;
            if (x==a[mid])
            {
                c++;
                break;
            }
            else if (x>a[mid])
            {
                beg=mid+1;
            }
            else if (x<a[mid])
            {
                end= mid-1;
            }

        }
        if (c>0)
        {
            System.out.println("item found at position  "+(mid+1));
        }
        else
        {
            System.out.println("item not found");
        }

    }
}
