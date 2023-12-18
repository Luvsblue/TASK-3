class Product implements Taxable {
    int pid;
    double price;
    int quantity;

    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    public void calcTax() {
        double salesTaxAmount = price * salesTax * quantity;
        System.out.println("Sales Tax for Product " + pid + ": $" + salesTaxAmount);
    }
}