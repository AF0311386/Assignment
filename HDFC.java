public class HDFC{
    public static void main(String[] args) {
        double balance = 25000.0;
        double depositAmount = 15000.0;
        double transferAmount = 11000.0;
        double interestRate = 0.02;
        int months = 12;
        balance += depositAmount;
        balance -= transferAmount;
        double interestValue = balance * interestRate * months;
        System.out.println("Current Balance: " + balance);
        System.out.println("Interest Value: " + interestValue);
    }
}