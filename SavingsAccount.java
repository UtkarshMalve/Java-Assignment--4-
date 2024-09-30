package ASSIGNMENT4;

class SavingsAccount {
	private static double annualInterestRate;
	private double savingsBalance;

	public SavingsAccount(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	public void calculateMonthlyInterest() {
		double monthlyInterest = savingsBalance * annualInterestRate / 12;
		savingsBalance += monthlyInterest;
	}

	public static void modifyInterestRate(double newInterestRate) {
		annualInterestRate = newInterestRate;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public static void main(String[] args) {
		SavingsAccount saver1 = new SavingsAccount(2000.00);
		SavingsAccount saver2 = new SavingsAccount(3000.00);

		SavingsAccount.modifyInterestRate(0.03); // 3% annual interest rate

		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();

		System.out.println("Saver 1 balance: $" + saver1.getSavingsBalance());
		System.out.println("Saver 2 balance: $" + saver2.getSavingsBalance());

		SavingsAccount.modifyInterestRate(0.04); // 4% annual interest rate

		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();

		System.out.println("Saver 1 balance: $" + saver1.getSavingsBalance());
		System.out.println("Saver 2 balance: $" + saver2.getSavingsBalance());
	}
}
