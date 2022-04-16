package example.hibedemo.HibernateDemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="cars")
public class Car {
	@Transient
	private static int count = 0;
	
	@Id
	@Column(name="id")
	private int mId = 0;
	
	@Column(name="car_brand")
	private String brand = "Default";
	
	@Column(name="car_model")
	private String model = "Default";
	
	@Column(name = "quantity")
	private int stock = 0;
	
	public Car() {
		mId = count++;
	}
	public Car(String brand, String model, int stock) {
		this();
		this.brand = brand;
		this.model = model;
		this.stock = stock;
	}
	public int getmId() {
		return mId;
	}
	public void setmId(int cId) {
		mId = cId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
}
