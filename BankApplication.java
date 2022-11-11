
/** Program header: BankApplication.java
 *
 * Author:    AIME SERGE TUYISHIME
 * Class:     Java
 *
 *OCCC
 * Assignment 3
 * chapter IX
 */
import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		
				CheckingAccount checkingAccount = new CheckingAccount ();
				
				//opening Scanner
				Scanner input = new Scanner (System.in);
				Scanner keyboard = new Scanner (System.in);
				
				
				System.out.println ("\n");
				System.out.println ("_________________________\n");
				System.out.println ("  MID-FIRST BANKING APP");
				System.out.println ("_________________________\n");
				
				//user input
				System.out.print("Enter unique ID: ");
				String uniqueID = keyboard.nextLine();
				
				while(uniqueID.length() < 4){
					System.out.println("!!!ERROR: unique IDs are at least 4 characters long!!!: ");
					System.out.print("Enter unique ID: ");					
					uniqueID = keyboard.nextLine();
					
				}
				//set Id  to details
				checkingAccount.setUniqualId(uniqueID);				
				
				//user input
				System.out.print("Enter The Initial Balance: ");
				double acctBalance = input.nextDouble();
				
				while(acctBalance < 500){
					System.out.println("!!!ERROR: new account need at least $500!!!: ");
					System.out.print("Enter The Inintial Balance: ");
					acctBalance = input.nextDouble();
					
				}				
				checkingAccount.setAcctBalance(acctBalance);				
				System.out.print("Enter annual interest rate as apercentage: ");
				double annualInterestRate = input.nextDouble();
				
				int option;
				do {
					System.out.println ("\n");
					System.out.println ("\n");
			    System.out.println ("________________________\n");
			    System.out.println (" *    Options Below    *");
			    System.out.println ("________________________");
				System.out.println ("1. Deposit");
				System.out.println ("2. View Interest Rate ");
				System.out.println ("3. View Account Details");
				System.out.println ("4. Exit\n");
				System.out.print ("ENTER YOUR SELECTION # ");
				option = input.nextInt();
				
				
				while(option > 4) {
					System.out.println("INVALID SELECTION - TRY AGAIN!");
					System.out.print ("# ");
					option = input.nextInt();
				}
				
				
								
				if (option == 1){ 
					System.out.print ("Enter Deposit Ammount: ");	
					double theDeposit = input.nextDouble();
					while(theDeposit < 1) {
						System.out.println("ERROR: deposit must must be great than $0!!!");
						System.out.print ("Enter Your Deposit Amount: ");
						theDeposit = input.nextDouble();
					}
					
					//set theDepositAmount to depositAmount
					checkingAccount.depositCash(theDeposit);
					//Calculate new Balance 
					 double AccountNewBalance = checkingAccount.getAcctBalance();					
					System.out.print("New Balance:  ");
				    System.out.println(AccountNewBalance);
				}
				else if (option == 2 ) {
					
					double dailyInterestRate = checkingAccount.getDailyIntRate(annualInterestRate);					
					System.out.print("Your Daily Interest is: ");
					//dailyInterestRate = Math.round(dailyInterestRate);
					System.out.println(dailyInterestRate);
					
				}
				
				else if (option == 3) {
					
					System.out.print("Uniqual ID: ");
					String TheUniqualID =checkingAccount.getUniqualId();
					System.out.println(TheUniqualID);		
					System.out.print("Account Creation Date/Time: " + checkingAccount.getCreatedDataTime() + "\n");					
					System.out.println("Balance: " + checkingAccount.getAcctBalance());
					System.out.println("Daily Interest Amount: " + checkingAccount.getDailyIntRate(annualInterestRate));
				
				}
				
				else if (option == 4) {

					System.out.println("Program exiting..."); 
					
					  System.exit(0);
				}
				System.out.println ("________________________");
				
				}while(option != 4);
				
	}
}