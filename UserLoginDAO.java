package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserLoginDAO {
public Userbean checkUserLogin(String User_UserName,String User_Password) {
	Userbean bean=null;
	try {
		Connection con=DBconnect.getCon();
		PreparedStatement pstmt=con.prepareStatement("select * from HotelManagement where name=?and password=?");
			pstmt.setString(1,User_UserName);
			pstmt.setString(2,User_Password);
			
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				
				bean=new Userbean();
				bean.setId(rs.getString(1));
				bean.setPwd(rs.getString(2));
				bean.setUname(rs.getString(3));
			}
			}
	catch(Exception e) {
		e.printStackTrace();
		
	}
	return bean;
}
}
