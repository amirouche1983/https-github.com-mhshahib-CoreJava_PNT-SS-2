package oop.encapsulation;

public class Computer {
	public boolean isAvailable;
	private String computerName;
	private String computerBrand;
	private int computerPrice;

	public String getComputerName() {
		return computerName;
	}

	public void setComputerName(String computerName) {
		this.computerName = computerName;
	}

	public String getComputerBrand() {
		return computerBrand;
	}

	public void setComputerBrand(String computerBrand) {
		this.computerBrand = computerBrand;
	}

	public int getComputerPrice() {
		return computerPrice;
	}

	public void setComputerPrice(int computerPrice) {
		this.computerPrice = computerPrice;
	}

}
