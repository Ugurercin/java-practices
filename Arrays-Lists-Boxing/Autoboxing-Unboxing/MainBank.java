public class MainBank {
    public static void main(String[] args) {
        Bank bank = new Bank("Java National Bank");

        bank.addBranch("Java");
        bank.addCustomer("Java", "Uğur", 101.2);
        bank.addCustomer("Java", "Tina", 55.05);
        bank.addCustomer("Java", "Clay", 100);

        bank.addBranch("Spring");
        bank.addCustomer("Spring", "Bob", 54);

        bank.addCustomerTransaction("Java", "Uğur", 123.23);
        bank.addCustomerTransaction("Java", "Tina", 24.55);
        bank.addCustomerTransaction("Java", "Clay", 58.55);

        bank.listCustomers("Java", true);

    }

}

