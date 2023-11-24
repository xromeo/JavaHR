import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static List<Integer> primeFactors(int n) {
        List<Integer> factors = new ArrayList<>();
        int i = 2;

        while (i * i <= n) {
            if (n % i != 0) {
                i++;
            } else {
                n /= i;
                factors.add(i);
            }
        }

        if (n > 1) {
            factors.add(n);
        }

        return factors;
    }

    public static void main(String[] args) {
        int num = 28;
        List<Integer> result = primeFactors(num);

        System.out.printf("Los factores primos de %d son: %s%n", num, result);
    }
}
