package org.example;

public class Customer implements DiscountRate {
    private String customerName;
    private String customerType; // Premium, Gold, Silver, Normal

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public Customer(String customerName, String customerType) {
        this.customerName = customerName;
        this.customerType = customerType;
    }

    // Getters and setters

    @Override
    public double getServiceMemberDiscount() {
        switch (customerType) {
            case "Premium":
                return 0.2; // 20% discount
            case "Gold":
                return 0.15; // 15% discount
            case "Silver":
                return 0.1; // 10% discount
            default:
                return 0; // 0% discount for Normal customers
        }
    }

    @Override
    public double getProductMemberDiscount() {
        // All customer types get the same 10% discount on products
        return 0.1;
    }
}
