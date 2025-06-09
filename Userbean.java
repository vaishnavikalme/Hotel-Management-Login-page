package pack1;

import java.io.Serializable;

public class Userbean implements Serializable {
private String id;
private String uname;
private String pwd;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public Userbean() {
	
}
}
