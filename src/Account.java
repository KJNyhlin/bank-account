public class Account {




    //Skapa en Account klass som representerar ett bankkonto.Account klassen ska
    //ha en balance där kontots saldo sparas

    //en instansvariabel name av typen String
    protected String name;
    private double balance;

    //Två konstruktörer.  en som sätter balance till 0 och en som tar in en balance.
    public Account() {
        this.balance = 0;
    }
    public Account(double balance) {
        this.balance = balance;
    }

    //en ny konstruktor som sätter både name och balance
    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    //en metod withdraw som minskar saldot
    public void withdraw(double amount) {
        this.balance -= amount;
    }
    //en metod deposit som ökar saldot
    public void deposit(double amount) {
        this.balance += amount;
    }

    //två metoder getName och setName som läser respektive skriver till name
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //en metod toString som returnerar en sträng innehållandes en mening
    // med name och balance på lämplig form.
    public String toString() {
        return "Namn: " + this.getName() +
                "\nSaldo: " + this.balance;
    }
    public static void transfer(Account fromAccount, Account toAccount, double amount) {
        fromAccount.setBalance(fromAccount.getBalance() - amount);
        toAccount.setBalance(toAccount.getBalance() + amount);
    }
}
