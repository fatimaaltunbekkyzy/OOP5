//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Account account1 = new Account("124356");
Account account2 = new Account("653421");
account1.deposit(1000);
account2.deposit(200);
account1.transaction(account2,300);
        System.out.println("Account1 balancu : " + account1.checkBalance());
        System.out.println("Account2 balancu : " + account2.checkBalance());

    }
}