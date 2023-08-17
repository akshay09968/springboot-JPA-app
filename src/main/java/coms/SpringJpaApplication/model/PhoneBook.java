package coms.SpringJpaApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PhoneBookInfo")
public class PhoneBook {
	
	@Id
	@GeneratedValue
	private int custID;
	private String pname;
	private String phone;
	private String email;
	
	
	public int getCustID() {
		return custID;
	}
	public void setCustID(int custID) {
		this.custID = custID;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
//model class will be converted into database as a table	
}
