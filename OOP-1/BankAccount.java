import java.util.Random;

public class BankAccount {
    Random random = new Random();
    private String customerName;
    private String customerEmail;
    private String customerPhone;
    private int accountNumber = random.nextInt(1000);
    private double customerBalance;

    public BankAccount(String customerName, String customerEmail, String customerPhone, double customerBalance) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
        this.customerBalance = customerBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getCustomerBalance() {
        System.out.println("Your balance : " + this.customerBalance);
        return customerBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    private void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    private void setCustomerBalance(double customerBalance) {
        this.customerBalance = customerBalance;
    }

    public void depositFunds(double amount) {
        this.customerBalance += amount;
    }

    public void withdrawFunds(double amount) {
        if(amount > this.customerBalance) {
            System.out.println("Balance is insufficient for the transaction");
        } else {
            this.customerBalance -= amount;
        }
    }


}
