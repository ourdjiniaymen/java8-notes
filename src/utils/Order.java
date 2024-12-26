package utils;

public class Order {
    private String customerName;
    private double orderTotal;

    public Order(String customerName, double orderTotal) {
        this.customerName = customerName;
        this.orderTotal = orderTotal;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customerName='" + customerName + '\'' +
                ", orderTotal=" + orderTotal +
                '}';
    }
}
