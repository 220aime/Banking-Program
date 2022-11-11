
/** Program header: CheckingAccount.java
 *
 * Author:    AIME SERGE TUYISHIME
 * Class:     Java
 *
 *OCCC
 * Assignment 3
 * chapter IX
 */


import java.util.Date;
public class CheckingAccount {

	

	private String uniqualID;
	private double acctBalance;
	private double annualInterestRate;
	private Date createdDataTime;

	// constructor
	public CheckingAccount() {
		this.createdDataTime=new Date (System.currentTimeMillis());
	}

	public CheckingAccount(double initialBlance, String uniqualId, double annualInterestRate) {
		this.uniqualID = uniqualId;
		this.acctBalance = initialBlance;
		this.annualInterestRate = annualInterestRate;
		this.createdDataTime=new Date (System.currentTimeMillis());
	}

	// getters
	public String getUniqualId() {
		return uniqualID;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	// setters
	public void setUniqualId(String uniqualId) {
		this.uniqualID = uniqualId;
	}
	
	public double getAcctBalance() {
		return acctBalance;
	}

	public void setAcctBalance(double balance) {
		this.acctBalance = balance;
	}

	public Date getCreatedDataTime() {
		return createdDataTime;
	}

	public double getDailyIntRate(double annualIntRate) {
		double dailyInterestRate = (this.acctBalance * annualIntRate / 36000);
		int n =2;
		 dailyInterestRate = Math.round( dailyInterestRate*Math.pow(10,n))/Math.pow(10,n);		
		return  dailyInterestRate;
	}
	// Other methods than constructors
	
	public double depositCash(double deposit) {
		this.acctBalance += deposit;
		return this.acctBalance;
	}

	

	@Override
	public String toString() {
		return "CheckingAccount [uniqualID=" + uniqualID + ", acctBalance=" + acctBalance + ", annualInterestRate="
				+ annualInterestRate + ", createdDataTime=" + createdDataTime + "]";
	}
}
