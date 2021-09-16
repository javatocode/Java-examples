package springmvc.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_table")
public class Users {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private int id;
  
  @Column(name="uemail")
  private String email;
  
  @Column(name="upass")
  private String password;
  
  @Column(name="uadd")
  private String address;
  
  @Column(name="ucity")
  private String city;
  
  @Column(name="ustate")
  private String state;
  
  @Column(name="uzip")
  private String zip;
  
  @Column(name="ucheck")
  private String check;
  
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getZip() {
	return zip;
}
public void setZip(String zip) {
	this.zip = zip;
}
public String getCheck() {
	return check;
}
public void setCheck(String check) {
	this.check = check;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Users(int id, String email, String password, String address, String city, String state, String zip,
		String check) {
	super();
	this.id = id;
	this.email = email;
	this.password = password;
	this.address = address;
	this.city = city;
	this.state = state;
	this.zip = zip;
	this.check = check;
}
public Users() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "User [id=" + id + ", email=" + email + ", password=" + password + ", address=" + address + ", city=" + city
			+ ", state=" + state + ", zip=" + zip + ", check=" + check + "]";
}

  
  
}
