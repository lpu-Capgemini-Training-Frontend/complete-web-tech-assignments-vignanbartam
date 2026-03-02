package day7;

public class Bank {
	int Account;
	String AccountHname;
	String IFSC;
	int balance = 0;
	int micr;
	public Bank(int Account, String AccountHname, String IFSC, int micr) {
		this.Account=Account;
		this.AccountHname = AccountHname;
		this.IFSC = IFSC;
		this.micr = micr;
	}
	public void getDeatails() {
		System.out.println("Account number: " + Account  + "\nAccount Holder Name: " + AccountHname + "\nIFSC code: " + IFSC + "\nBalance: " + balance + "\nMICR: " + micr);
	}
	public void setAhn(String AccountHname) {
		
		this.AccountHname = AccountHname;
	}
	public void setbalance(int balance) {
		this.balance = balance;
	}
}
