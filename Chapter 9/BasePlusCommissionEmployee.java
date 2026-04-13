class BasePlusCommissionEmployee {

    private CommissionEmployee employee; // composition
    private double baseSalary;

    public BasePlusCommissionEmployee(CommissionEmployee employee, double baseSalary) {
        this.employee = employee;
        this.baseSalary = baseSalary;
    }

    public double earnings() {
        return employee.earnings() + baseSalary;
    }

    public void display() {
        System.out.println("Name: " + employee.getName());
        System.out.println("Total Earnings: " + earnings());
    }
}