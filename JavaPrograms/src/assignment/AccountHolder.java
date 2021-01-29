package assignment;

public class AccountHolder extends Loan implements Bank{
	
	String accHolderName;
	String accHolderAddr;
	String accountType;
	int accountNo;
	double balance;
	
	public void showBankInfo()
	{
		System.out.println("Bank Name : " + bankName);
		System.out.println("Branch Name : " + branchName);
	}
	
	void showAccountHolderInfo()
	{
		System.out.println("Account Holder Name : " + accHolderName);
		System.out.println("Account Holder Address : " + accHolderAddr);
		System.out.println("Account Type : " + accountType);
		System.out.println("Account No : " + accountNo);
		System.out.println("Balance : " + balance);
	}
	
	
	

}
