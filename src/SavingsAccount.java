public class SavingsAccount extends Account {
    //en subklass SavingsAccount som har en instansvariabel interestRate
    // och en instansmetod addInterest. Det behöver finnas en konstruktor
    // som tar emot en double rate för att sätta interestRate.
    private double interestRate;



    public SavingsAccount(String name, double balance, double rate) {
        super(name, balance);
        this.interestRate = rate;


    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "Namn: " + this.getName() +
                "\nSaldo: " + this.getBalance() +
                "\nInterest rate: " + interestRate;
    }


}

//Bygg vidare på SavingsAccount genom att skapa en metod transfer.
//Denna metod ska flytta pengar från ett konto till ett annat.
//Metoden ska kunna skicka pengar från ett SavingsAccount till
// ett Account (eller en av dess subklasser)