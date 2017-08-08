import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrimeFactors {

    public static List<Integer> calculate(int number) {
        int remainder = number;
        List<Integer> factors = new ArrayList<>();
        int divisor = 2;
        while (remainder > 1) {
            while (remainder % divisor == 0) {
                factors.add(divisor);
                remainder /= divisor;
            }
            divisor++;
        }
        return factors;
    }
}
