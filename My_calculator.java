import java.util.Scanner;

public class My_calculator {

    interface AdvancedArithmetic{
        int divisorSum(int n);
    }

    static class Calculator implements AdvancedArithmetic{
        public int divisorSum(int n) {

            int sum = 0;
            for (int i = 1; i <= n ; i++) {
                if (n % i == 0) sum += i;
            }
            return sum;
        }
    }

    public static class ab {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            AdvancedArithmetic Calculator=new Calculator();
            int sum= Calculator.divisorSum(n);
            System.out.println("I implemented: AdvancedArithmetic\n"+sum);
        }
    }
}




