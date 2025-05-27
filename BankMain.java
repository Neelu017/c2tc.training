public class BankMain {
    public static void main(String[] args) {
        BankImple ob=new BankImple();
        ob.withdraw(2000);
        ob.deposit(2000);
        if(ob instanceof BankImple) {
            ob.deposit(4000);
        }
    }
    
}
