public class CommissionEmployeeTest {

    public static void main(String[] args) {

        CommissionEmployee employee = new CommissionEmployee(
                "Sue", "Jones", "222-22-2222",
                10000, 0.06);

        System.out.println(employee);

        System.out.printf("Earnings: %.2f%n", employee.earnings());
    }
}