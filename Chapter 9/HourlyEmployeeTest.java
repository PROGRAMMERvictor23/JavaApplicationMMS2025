public class HourlyEmployeeTest {

    public static void main(String[] args) {

        HourlyEmployee employee = new HourlyEmployee(
                "John", "Doe", "123-45-6789", 20.0, 45.0);

        System.out.println(employee);

        System.out.printf("Earnings: %.2f%n", employee.earnings());
    }
}