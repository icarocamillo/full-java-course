package entities;

public class ImportedProduct extends Product{

	private double customsFee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}
	
	@Override
	public final String priceTag() {
		return super.getName() 
				+ " $ " 
				+ String.format("%.2f", totalPrice())
				+ " (Customs fee: $ "
				+ String.format("%.2f", this.getCustomsFee())
				+ ")";
	} 
	
	public double totalPrice() {
		return super.getPrice() + customsFee;
	}
}
