class Employee implements Taxable {
    int empId;
    String name;
    double salary;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public void calcTax() {
        double incomeTaxAmount = salary * incomeTax;
        System.out.println("Income Tax for Employee " + empId + ": $" + incomeTaxAmount);
    }
}