import static java.lang.Math.pow;
public class MyCalculator {
    public long power(final int n, final int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        } else if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        }
        return (long) pow(n, p);
    }
}
