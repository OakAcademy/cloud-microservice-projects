package bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainTest {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Bank name: ");
		String bankName = br.readLine();
		System.out.println("\nEnter the Loan Name: ");
		String loanName = br.readLine();
		AbstractFactory bankFactory = FactoryCreator.GetFactory("Bank");
		Bank b = bankFactory.GetBankName(bankName);
		System.out.println("\nEnter the interested rate: ");
		double rate = Double.parseDouble(br.readLine());
		System.out.println("\nEnter the Loan amount: ");
		double loanAmount = Double.parseDouble(br.readLine());
		System.out.println("\nEnter the years: ");
		int years = Integer.parseInt(br.readLine());
		System.out.println("You will take loan from " + b.GetBankName());
		AbstractFactory loanFactory = FactoryCreator.GetFactory("Loan");
		Loan l = loanFactory.GetLoan(loanName);
		l.GetInterestedRate(rate);
		l.CalculatePayment(loanAmount, years);

	}

}
