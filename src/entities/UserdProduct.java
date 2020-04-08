package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UserdProduct extends Product {

	SimpleDateFormat sdf = new SimpleDateFormat("(DD/MM/YYYY");
	
	private Date manufactureDate;
	
	
	public UserdProduct(){
		super();
	}


	public UserdProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}


	public Date getManufactureDate() {
		return manufactureDate;
	}


	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	
	public SimpleDateFormat getSdf() {
		return sdf;
	}


	public void setSdf(SimpleDateFormat sdf) {
		this.sdf = sdf;
	}


	public String priceTag(){
		return super.priceTag() + " ( Manufacture date:" + sdf + " ) "; 
	}
	
	
}
