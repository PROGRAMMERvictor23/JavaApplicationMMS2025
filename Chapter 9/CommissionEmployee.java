class CommissionEmployee {

    private String name;
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String name, double sales, double rate) {
        this.name = name;
        this.grossSales = sales;
        this.commissionRate = rate;
    }

    public double earnings() {
        return grossSales  commissionRate;
    }

    public String getName() {
        return name;
    }
}