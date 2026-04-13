public class HourlyEmployee extends Employee {

    private double hours; // hours worked
    private double wage;  // wage per hour

    // Constructor
    public HourlyEmployee(String firstName, String lastName,
                          String ssn, double wage, double hours) {
        super(firstName, lastName, ssn);

        setWage(wage);
        setHours(hours);
    }

    // set wage
    public void setWage(double wage) {
        if (wage < 0.0) {
            throw new IllegalArgumentException("Wage must be >= 0.0");
        }
        this.wage = wage;
    }

    // get wage
    public double getWage() {
        return wage;
    }

    // set hours
    public void setHours(double hours) {
        if (hours < 0.0 || hours > 168.0) {
            throw new IllegalArgumentException("Hours must be between 0 and 168");
        }
        this.hours = hours;
    }

    // get hours
    public double getHours() {
        return hours;
    }

    // calculate earnings
    public double earnings() {
        if (hours <= 40) {
            return wage * hours;
        } else {
            return (40 * wage) + ((hours - 40) * wage * 1.5);
        }
    }

    // toString method
    @Override
    public String toString() {
        return String.format("Hourly Employee: %s%nHourly wage: %.2f%nHours worked: %.2f",
                super.toString(), wage, hours);
    }
}