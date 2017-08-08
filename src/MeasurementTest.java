import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MeasurementTest {
    @Test
    public void shouldReturnTheLengthInInches() {
        Measurement measurement = new Measurement(1, Unit.INCHES);
        assertThat(measurement, is(new Measurement(1, Unit.INCHES)));
    }

    @Test
    public void shouldNotBeEqualFor2DifferentMeasurements() {
        Measurement measurementInInches = new Measurement(10, Unit.INCHES);
        Measurement measurementInYards = new Measurement(10, Unit.YARDS);
        Assert.assertNotEquals(measurementInInches, measurementInYards);
    }

    @Test
    public void shouldAdd2Measurements() {
        Measurement measurement = new Measurement(10, Unit.INCHES);

        Measurement addition = measurement.add(new Measurement(12, Unit.INCHES));

        assertThat(new Measurement(22, Unit.INCHES), is(addition));
    }

    @Test
    public void shouldAdd2DifferentMeasurements() {
        Measurement measurement = new Measurement(1, Unit.INCHES);

        Measurement additionBetweenInchesAndYards = measurement.add(new Measurement(1, Unit.YARDS));

        assertThat(additionBetweenInchesAndYards, is(new Measurement(37, Unit.INCHES)));

        assertThat(measurement.add(new Measurement(1,Unit.FEET)),is(new Measurement(13,Unit.INCHES)));
    }

}
