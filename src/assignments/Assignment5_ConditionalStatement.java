package assignments;

public class Assignment5_ConditionalStatement {

	public static void main(String[] args) 
	{
		System.out.println("Execution Started");
		
		String customerName = "John Doe";
		int creditScore = 720;
		double income = 55000.0;
		boolean isEmployed = true;
		double debtToIncomeRatio = 35.0;
		
		if(creditScore>750)
		{
			System.out.println("Loan Approved Automatically");
		}
		
		else if(creditScore>=650 && creditScore<=750)
			
		{
			System.out.println("Additional Checking is performed for income,employment status and debt to Income Ratio");
			
			if(income>=55000.0 && isEmployed==true && debtToIncomeRatio<40.0)
			{
				System.out.println("Loan is approved");
			}
			
			else
			{
				System.out.println("Loan is decliened due to income or employement status or debtincomereatio is not meeting the condition"  );
			}
		}
		
		else if(creditScore<650)
		{
			System.out.println("The Loan is declied");
		}

	
}

}