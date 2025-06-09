package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddCustomerDetailDAO {
public int insertCustomer(AddCustomerDetailBean bean) {
	int rowCount=0;
	try {
		Connection con=DBconnect.getCon();
		PreparedStatement pstmt=con.prepareStatement("insert into customerdetails values(?,?,?,?,?)");
	    pstmt.setString(1,bean.getCustomer_RoomNo());
	    pstmt.setString(2, bean.getCustomer_Name());
	    pstmt.setString(3, bean.getCustomer_Price());
	    pstmt.setString(4, bean.getCustomer_Contact());
	    pstmt.setString(5, bean.getCustomer_Rent());
	    
	    rowCount=pstmt.executeUpdate();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return rowCount;
}
}
