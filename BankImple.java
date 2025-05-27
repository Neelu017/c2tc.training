public class BankImple implements Bank {
    private double balance=155000;
    public void withdraw(double amount) {
        if(amount>0&&amount<=balance){
            balance=balance-amount;
            System.out.println("The amount after withdraw "  +balance);

        }
        else{
            System.err.println("Insufficient balance");
        }

    }
    public void deposit(double amount){
        if(amount<DEPOSIT_LIMIT){
            balance=balance+amount;
            System.out.println("The amount after depsoit "  + balance);

        }
        else{
            System.err.println("Depsoit limit exceeds");
        }
    }
    
}
