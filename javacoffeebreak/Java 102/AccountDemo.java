
class AccountDemo {
	public static void main(String args[]) {
		Account my_account = new Account();

		my_account.deposit(300.00);

		System.out.println("Current balance " + my_account.getbalance());

		my_account.withdraw(170.00);

		System.out.println("Remaining balance " + my_account.getbalance());
	}
}