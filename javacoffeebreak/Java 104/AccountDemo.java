import InterestBearingAccount;

class AccountDemo {
	public static void main(String args[]) {
		InterestBearingAccount my_account = new InterestBearingAccount();

		my_account.deposit(250.00);

		System.out.println("Current balance " + my_account.getbalance());

		my_account.withdraw(80.00);

		System.out.println("Remaining balance " + my_account.getbalance());

		// Interest over the course of a year
		for (int i = 0; i < 12; i++) {
			my_account.add_monthly_interest();
		}
		System.out.println("Adding interest to account");

		System.out.println("Remaining balance " + my_account.getbalance());

	}
}