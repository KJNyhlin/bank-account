public class Main {
    public static void main(String[] args) {

        //Ändra i ditt program så att du testar de nya metoderna. För att
        // testa toString räcker det att du anropar System.out.println(savingsAccount);

        Account bankkonto = new Account("Kalle", 120000.0);
        //System.out.println(bankkonto);
        bankkonto.setName("KJN");
        bankkonto.setBalance(130000);
        //System.out.println(bankkonto);
        SavingsAccount sparkonto = new SavingsAccount("Kalle", 70000, 4.0);
        sparkonto.setBalance(80000);
        sparkonto.setInterestRate(4.2);
        //System.out.println(sparkonto);

        //flytta pengar från ett konto till ett annat:
        System.out.println(bankkonto);
        System.out.println(sparkonto);
        Account.transfer(bankkonto, sparkonto, 21000);
        System.out.println("överfört 21000");
        System.out.println(bankkonto);
        System.out.println(sparkonto);



    }
}