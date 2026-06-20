
public class Main {

	public static void main(String[] args) {
		BankAccount acc = new BankAccount();
		System.out.println(acc.getBalance());
		
		
		acc.setAccountNumber(1234);
		acc.setCustomerName("Guilherme");
		acc.setEmail("gui@gmail.com");
		acc.setPhoneNumber("123456789");
		
		System.out.println(acc.getBalance());
		acc.depositFunds(-3.4);
		acc.withdrawFunds(1000);
		acc.depositFunds(200);
		acc.withdrawFunds(200.1);
		acc.withdrawFunds(150);
		System.out.println(acc.getBalance());
		

	}

}
