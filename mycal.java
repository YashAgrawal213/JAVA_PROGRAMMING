import java.util.Scanner;
class mycal
{
    public long power(int n,int p) throws Exception
    {
        long c=1;
        if(p<0||n<0)
        {
            throw new Exception("n or p should not be negative!!!");
        }
        else if (p==0 || n==0)
        {
            throw new Exception("n or p should not be zero!!!");
        }
        else
        {
            for(int i=1;i<=p;i++)
            {
                c=c*n;
            }
        }
        return c;
    }
}
class Vth
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        mycal obj = new mycal();
        int a= sc.nextInt();
        int b=sc.nextInt();
        try
        {
            System.out.println(obj.power(a,b));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
