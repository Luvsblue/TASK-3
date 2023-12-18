public class XYZ {
    public static void main(String[] args) {

        int empId = 333;
        String empName = "Muthu";
        double empSalary = 50000.0;

        Employee employee = new Employee(empId, empName, empSalary);
        employee.calcTax();

        int pid = 456;
        double price = 10.0;
        int quantity = 5;

        Product product = new Product(pid, price, quantity);
        product.calcTax();
    }
}