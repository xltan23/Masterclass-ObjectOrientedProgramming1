public class BankAccount {
    private String name;
    private String email;
    private String contact;
    private double balance;

    public BankAccount() {
        // Default constructor calling below constructor to set up default parameters
        this("Unknown", "N.A.", "N.A.", 0);
    }

    public BankAccount(String n, String e, String c, double b) {
        // Parameters created
        this.name = n;
        this.email = e;
        this.contact = c;
        this.balance = b;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double depositAmt) {
        if (depositAmt >= 0) {
            this.balance += depositAmt;
            System.out.println("$" + depositAmt + "  deposited. Your balance is now: $" + balance);
        } else {
            System.out.println("You cannot deposit a negative amount!");
        }

    }

    public void withdraw(double withdrawAmt) {
        if (withdrawAmt >= 0 && this.balance >= withdrawAmt) {
            this.balance -= withdrawAmt;
            System.out.println("$" + withdrawAmt + " withdrawn. Your balance is now: $" + balance);
        } else {
            System.out.println("Invalid withdrawal. Insufficient balance: $" + balance);
        }
    }

    public static void main(String[] args) {
        BankAccount RalphAcc = new BankAccount();
        RalphAcc.setName("Ralph");
        RalphAcc.setEmail("Ralph@gmail.com");
        RalphAcc.setContact("96350334");
        RalphAcc.setBalance(30000);

        RalphAcc.withdraw(1111);
        RalphAcc.withdraw(30000);

        BankAccount TerryAcc = new BankAccount("Terry", "Terry@gmail.com", "68290324", 70000);
        System.out.println(TerryAcc.getName());
        System.out.println(TerryAcc.getEmail());
        System.out.println(TerryAcc.getContact()); 
        TerryAcc.withdraw(450);

        BankAccount EmptyAcc = new BankAccount();
        System.out.println(EmptyAcc.getName());
        System.out.println(EmptyAcc.getEmail());
        System.out.println(EmptyAcc.getContact());
    }
    
}
