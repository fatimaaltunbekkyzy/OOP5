public class Account {
    private double balance;
    private String accountNumber;

    public Account (String accountNumber){
        this.accountNumber = accountNumber;
        this.balance = 0.0;

    }
    public double checkBalance(){
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit : " + amount + "Rub.Жаны баланс : " + balance);
        } else {
            System.out.println("Балансынызда акча жок.");
        }
    }
    public void withdrawal(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Alundu : " + amount + "Rub. Жаны баланс : " + balance);
        }else {
            System.out.println("Akcha jok je summa ters.");
        }
    }
    public void transaction(Account targetAccount,double amount){
        if(amount > 0 && amount <= balance){
            withdrawal(amount);
            targetAccount.deposit(amount);
            System.out.println("Rub " + targetAccount.accountNumber + "accountka kotoruldu.");
        }else {
            System.out.println("Балансынызда акча жок.");
        }
    }
}
