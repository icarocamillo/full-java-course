package entities;

public class LegalPerson extends Person {

	private Integer numberEmployees;

	public LegalPerson() {
	}
	
	public LegalPerson(String name, double annualIncome, Integer numberEmployees) {
		super(name, annualIncome);
		this.numberEmployees = numberEmployees;
	}

	public Integer getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(Integer numberEmployees) {
		this.numberEmployees = numberEmployees;
	}
	
	@Override
	public double tax() {
		if (getNumberEmployees() <= 10) {
		return super.getAnnualIncome() * 0.16;
		}
		else {
			return super.getAnnualIncome() * 0.14;
		}
			
	}
	
}
