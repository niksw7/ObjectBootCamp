public class Measurement {
    private int length;
    private String unit;

    public Measurement(int length, String unit) {
        this.length = length;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object obj) {
        Measurement measurement = (Measurement) obj;
        return this.length == measurement.length && this.unit == measurement.unit;
    }

    public Measurement add(Measurement measurement) {
        if (measurement.unit != "inches") {
            measurement = measurement.convertToInches();
        }
        return new Measurement(length + measurement.length, unit);
    }

    private Measurement convertToInches() {
        if (unit == "yards")
            return new Measurement(length * 36, "inches");
        else if (unit == "feet") {
            return new Measurement(length * 12, "inches");
        }
        return this;
    }
}
