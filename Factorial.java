import java.math.BigInteger;

public class Factorial {
    // 1*
    public static BigInteger factorial(int n){
        if (n == 0)
            return BigInteger.valueOf(1);
        return (factorial(n-1).multiply(BigInteger.valueOf(n)));
    }

    public static void main(String[] args) {
        System.out.println(factorial(50));
    }
}
