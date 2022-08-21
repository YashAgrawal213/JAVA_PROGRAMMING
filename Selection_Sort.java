import java.util.Scanner;

public class Selection_Sort
{
    void sort(int arr[])
    {
        int x;
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {
            x=i;
            for (int j = i+1; j < n; j++)
            {
                if (arr[x] > arr[j])
                {
                    x=j;
                }
            }
            if (x!=i)
            {
                int temp= arr[x];
                arr[x]= arr[i];
                arr[i]=temp;
            }
        }
    }

    void print_array(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args)
    {
        Selection_Sort obj = new Selection_Sort();
        int arr[]=new int[5];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the array to be sorted : ");
        for (int a=0 ; a<5; a++)
        {
            arr[a]= s.nextInt();
        }
        obj.sort(arr);
        obj.print_array(arr);
    }
}




