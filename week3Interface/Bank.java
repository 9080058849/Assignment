package week3Interface;

public class Bank extends SBI {
	@Override
	public void cibilScore() {
		System.out.println("Your cibilScore:6.0");
		
	}

@Override
public void maximumLoanAmounmt() {
	// TODO Auto-generated method stub
	System.out.println("The maximumLoan Amount is :1000000");
}

@Override
public void creditScore() {
	// TODO Auto-generated method stub
	System.out.println("The credit Score:7.5");
}

@Override
public void minimumBalance() {
	// TODO Auto-generated method stub
	System.out.println("Your minimum balance should be:1000");
}



@Override
public void bankBalance() {
	// TODO Auto-generated method stub
	System.out.println("Current BankBalance :50000");
}

@Override
public void maximumLoanAmount() {
	// TODO Auto-generated method stub
	System.out.println("Maximum Loan amount:100200");
}

	public static void main(String[] args)
	{
		Bank acc=new Bank();
		acc.cibilScore();
		acc.maximumLoanAmounmt();
		acc.creditScore();
		acc.minimumBalance();
		acc.iTloan();
		acc.bankBalance();
		acc.maximumLoanAmount();
	
		
	}
		
		
	
}

