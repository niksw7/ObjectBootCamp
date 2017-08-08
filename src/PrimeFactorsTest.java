import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PrimeFactorsTest {
    @Test
    public void shouldCalculatePrimeFactor() {
        assertThat(PrimeFactors.calculate(1), is(Collections.emptyList()));

        assertThat(PrimeFactors.calculate(2), is(Arrays.asList(2)));

        assertThat(PrimeFactors.calculate(3), is(Arrays.asList(3)));

        assertThat(PrimeFactors.calculate(4), is(Arrays.asList(2, 2)));

        assertThat(PrimeFactors.calculate(5), is(Arrays.asList(5)));

        assertThat(PrimeFactors.calculate(6), is(Arrays.asList(2, 3)));

        assertThat(PrimeFactors.calculate(7),is(Arrays.asList(7)));

        assertThat(PrimeFactors.calculate(8),is(Arrays.asList(2,2,2)));

        assertThat(PrimeFactors.calculate(9),is(Arrays.asList(3,3)));

        assertThat(PrimeFactors.calculate(10),is(Arrays.asList(2,5)));

        assertThat(PrimeFactors.calculate(2*2*2*5*3*5*11*13),is(Arrays.asList(2,2,2,3,5,5,11,13)));


        assertThat(PrimeFactors.calculate(-1),is(Collections.emptyList()));





    }
}
