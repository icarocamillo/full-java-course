package entities;

public class PhysicalPerson extends Person {
	
	private Double healthSpending;

	public PhysicalPerson() {
	}
	
	public PhysicalPerson(String name, double annualIncome, double healthSpending) {
		super(name, annualIncome);
		this.healthSpending = healthSpending;
	}

	public double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(double healthSpending) {
		this.healthSpending = healthSpending;
	}
	
	@Override
	public double tax() {
		
		/* Conditional IF Ternary Version
		double sum = (super.getAnnualIncome() <= 20000.00) ? super.getAnnualIncome() * 0.15 : super.getAnnualIncome() * 0.25;
		*/
		
		double sum;
		if (super.getAnnualIncome() <= 20000.00) {
			sum = super.getAnnualIncome() * 0.15;
		}
		else {
			sum = super.getAnnualIncome() * 0.25;
		}
		sum -= getHealthSpending() * 0.50;
		if (sum < 0.0) {
			sum = 0.0;
		}
		return sum;	
	}

}