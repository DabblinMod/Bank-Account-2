
public class BankAccount implements BankSystem{
	protected String owner;//owner of the bank acount
	protected int total=0;
	public BankAccount(String name, int inputAmount) {
		this.owner=name;
		this.total=inputAmount;//how much is in the bank
	}
	@Override
	public void deposit(int value) {
		// TODO Auto-generated method stub
		System.out.println("You are depositting: " +value);
		this.total+=value;
	}
	@Override
	public int withdraw(int value) {
		// TODO Auto-generated method stub
		System.out.println("You are about to take out: " +value);
		this.total-=value;
		//this will return the remaining amount after the withdrawl
		System.out.println("Your current amount is now: "+this.total);
		return total;
	}
	@Override
	public String getBalance() {
		// TODO Auto-generated method stub
		return "Your current balance is: "+this.total;
	}
	public static void main(String[] args) {
		BankAccount tom=new BankAccount("Tommy", 1500);
		System.out.println(tom.getBalance());
	}
}
