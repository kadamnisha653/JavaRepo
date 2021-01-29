package assignment;

public class Loan {
	
	final String loanScheme = "LHScheme";
	final double rateOfInterest = 20;
	double interestAmt;		//interest on taken loan i.e. loanAmt
	double totalLoanAmt;	//total loan amount i.e. (interestAmt + loanAmt) * t
	int loanAmt;	//loan taken by user
	int tenure;		//in months
	
	final void calcLoanAmt(int la, int t)
	{
		this.loanAmt = la;
		this.tenure = t;
		interestAmt = loanAmt * rateOfInterest;
		totalLoanAmt = (loanAmt + interestAmt) * tenure;
	}
	
	void showLoanInfo()
	{
		System.out.println("Loan Scheme : " + loanScheme);
		System.out.println("Rate of interest : " + rateOfInterest);
		System.out.println("Tenure : " + tenure);
		System.out.println("Total Payable Loan Amount : " + totalLoanAmt);
	}
}
