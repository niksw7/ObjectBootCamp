public class Measurement {
    private int length;
    private Unit unit;


    public Measurement(int length, Unit unit) {
        this.length = length;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object obj) {
        Measurement measurement = (Measurement) obj;
        return this.length == measurement.length && this.unit == measurement.unit;
    }

    public Measurement add(Measurement otherMeasurement) {
        int addedLength = this.unit.convertToInches(this.length)+ otherMeasurement.unit.convertToInches(otherMeasurement.length);
        return new Measurement(addedLength, Unit.INCHES);
    }


}

class Unit {
    private static int YARD_IN_INCHES = 36;
    private static int FEET_IN_INCHES = 12;

    public static Unit YARDS = new Unit(YARD_IN_INCHES);
    public static Unit FEET = new Unit(FEET_IN_INCHES);
    public static Unit INCHES = new Unit(1);

    int inInches;

    public Unit(int inInches) {
        this.inInches = inInches;
    }

    public int convertToInches(int value) {
        return (value * inInches);
    }

}