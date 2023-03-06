import java.util.Scanner;

public class Account {
    double accountBalance = 200000;

    public void debit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter amount to withdraw");
        double withdraw = sc.nextDouble();
        if (withdraw > accountBalance)
            System.out.println("Insufficient Balance");
        else
            accountBalance = accountBalance - withdraw;
        System.out.println("Remaining balance : " + accountBalance);
    }
}

