package entities;

public class savingsAccount extends Account{

	private Double interestRate;
	
	
	public void SavingsAccount() {
		 Super();	
	}


	private void Super() {
		// TODO Auto-generated method stub
		
	}


	public savingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}


	public Double getInterestRate() {
		return interestRate;
	}


	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		interestRate += balance * interestRate;
	}
	
	@Override
	public void withdraw (double amount) {
    	balance -= amount;
    }
}
