package de.nordakademie;

public class TelephoneNumber {
   private String countryCode="+49";
   private String cityCode ="04121";
	private String connection = "40900";

	public TelephoneNumber() {
		super();
	}

	public TelephoneNumber(String countryCode, String cityCode, String connection) {
		super();
		this.countryCode = countryCode;
		this.cityCode = cityCode;
		this.connection = connection;
	}

	@Override
	public String toString() {
		return countryCode+cityCode+connection;
	}
	
	
}
