public class BasePlusCommissionEmployeeTest {

    public static void main(String[] args) {

        BasePlusCommissionEmployee employee =
                new BasePlusCommissionEmployee(
                        "Bob", "Lewis", "333-33-3333",
                        5000, 0.04, 300);

        System.out.println(employee);

        System.out.printf("Earnings before raise: %.2f%n",
                employee.earnings());

        // give 10% raise
        employee.setBaseSalary(employee.getBaseSalary() * 1.10);

        System.out.printf("Earnings after 10%% raise: %.2f%n",
                employee.earnings());
    }
}