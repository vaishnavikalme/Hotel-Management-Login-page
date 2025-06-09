package pack1;

import java.io.Serializable;

public class AddCustomerDetailBean implements Serializable {
private String customer_RoomNo,customer_Name,customer_Price,customer_Contact,customer_Rent;

public String getCustomer_RoomNo() {
	return customer_RoomNo;
}

public void setCustomer_RoomNo(String customer_RoomNo) {
	this.customer_RoomNo = customer_RoomNo;
}

public String getCustomer_Name() {
	return customer_Name;
}

public void setCustomer_Name(String customer_Name) {
	this.customer_Name = customer_Name;
}

public String getCustomer_Price() {
	return customer_Price;
}

public void setCustomer_Price(String customer_Price) {
	this.customer_Price = customer_Price;
}

public String getCustomer_Contact() {
	return customer_Contact;
}

public void setCustomer_Contact(String customer_Contact) {
	this.customer_Contact = customer_Contact;
}

public String getCustomer_Rent() {
	return customer_Rent;
}

public void setCustomer_Rent(String customer_Rent) {
	this.customer_Rent = customer_Rent;
}
public AddCustomerDetailBean() {
	
}

}
