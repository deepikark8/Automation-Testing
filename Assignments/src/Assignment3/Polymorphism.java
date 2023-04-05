package Assignment3;
import java.util.Scanner;
public class Polymorphism {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int amountInBank = 10000;
		System.out.println("Balance : "+amountInBank);
		System.out.println("Amount to be withdrawn :");
		double amountToBeWithdrawn1 = reader.nextDouble();
		System.out.println("Is it from your Current Account (true/false)");
		boolean isCurrentAccount1 = reader.nextBoolean(); 
		CurrentAccount cAcc = new CurrentAccount();
		Account cAccount = cAcc;
		cAccount.extra = cAcc.extraCharges;
		cAccount.withdrawAmount(amountInBank, isCurrentAccount1, amountToBeWithdrawn1);
		reader.close();
	}
}
class Account{
	double balance;
	float extra;
	void withdrawAmount(int amount,boolean isCurrentAccount,double amountToWithdraw) {
		if(isCurrentAccount) {
			// Add charges to withdraw only if it    is a current account. Extra 10%.
			System.out.println("amountToWithdraw :"+ amountToWithdraw);
			float b = 100;
			float result = extra/b;
			balance = amount - (amountToWithdraw + (result * amountToWithdraw ));
		}else {
			balance = amount - amountToWithdraw;
		}
		System.out.println("Balance after withdraw :"+balance);
	 }
	 void makePayment() {	 
	 }
}
class SavingsAccount extends Account{	
}
class CurrentAccount extends Account{
	float extraCharges = 10;	
}