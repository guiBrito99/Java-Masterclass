
public class BankAccount {
	private int accountNumber;
	private double balance = 0;
	private String customerName, email, phoneNumber;
	
	public BankAccount() {
		this(0,0,"No name","No e-mail","No phone");
		System.out.println("Empty constructor called");
	}
	
	public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void depositFunds(double deposit) {
		if(deposit <= 0) System.out.println("Cannot deposit this amount");
		else {
			balance += deposit;
			System.out.println("Deposited " + deposit);
		}
	}
	
	public void withdrawFunds(double withdraw) {
		if(withdraw <= 0 || withdraw > balance) System.out.println("Cannot withdraw this amount");
		else {
			balance -= withdraw;
			System.out.println("Withdrawed " + withdraw);
		}
	}
	
	
	
}
