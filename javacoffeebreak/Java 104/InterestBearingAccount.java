import Account;

class InterestBearingAccount extends Account {
	private static double default_interest = 7.95;

	private double interest_rate;

	public InterestBearingAccount(double amount, double interest) {
		balance = amount;
		interest_rate = interest;
	}

	public InterestBearingAccount(double amount) {
		balance = amount;
		interest_rate = default_interest;
	}

	public InterestBearingAccount() {
		balance = 0.0;
		interest_rate = default_interest;
	}

	public void add_monthly_interest() {
		balance = balance + (balance * interest_rate / 100) / 12;
	}

}