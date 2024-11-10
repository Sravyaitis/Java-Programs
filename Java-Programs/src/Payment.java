
public class Payment {
	
	public static void payment(String walletType, int UID) {
		System.out.println("Wallet Type: "+walletType);
		System.out.println("ID: "+UID);
	}
	public static void payment(String cardType, long cardNo, int cvvNumber) {
		System.out.println("cardType: "+cardType);
		System.out.println("cardnum: " +cardNo);
	}
	public static void payment(String accountType, String username, int pwd, long accountNumber) {
		System.out.println("AccountType: "+accountType);
		System.out.println("username: "+username);
		System.out.println("password: "+pwd);
		System.out.println("Account Number: "+accountNumber);
	}

	public static void main(String[] args) {
		
		payment("Gpay",1234);
		payment("creditcard", 12345678, 234);
		payment("savings", "Sravya", 1234, 12345678);
	}
}
