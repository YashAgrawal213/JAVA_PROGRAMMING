import java.util.Scanner;

public class fibonacci_using_recursion
{
    int fibo(int n)
    {
        int s=0;
        if (n==1)
            return 0;
        else if(n==2)
            return 1;
        else{
            s=s+fibo(n-1) + fibo(n-2);
            return s;
        }
    }

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            fibonacci_using_recursion obj = new fibonacci_using_recursion();
            int r = obj.fibo(n);
            System.out.println(r);
    }
}
