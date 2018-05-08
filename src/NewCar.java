import java.text.NumberFormat;

public class NewCar {

	private String make;
	private String model;
	private int year;
	private double price;

	public NewCar() {

	}

	public NewCar(String make, String model, int year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getFormattedPrice() {
		return formatNumber(getPrice());
	}

	private String formatNumber(double x) {
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(2);
		String format = number.format(x);
		return format;

	}

	@Override
	public String toString() {

		return "Make: " + make + "\tModel: " + model + "\tYear: " + year + "\tPrice: $" + getFormattedPrice();
		

	}

}
