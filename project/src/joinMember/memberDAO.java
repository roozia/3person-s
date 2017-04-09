package joinMember;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class memberDAO {

	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	String url = "localhost:1521:orcl";
	String id = "hr";
	String pw = "hr";
	String sql = null;
	
	public memberDAO() throws ClassNotFoundException	{
		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@"+url, id, pw);
			stmt = con.createStatement();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int insert(memberDTO dto)	{
		
		int res = 0;
		
		sql = "insert into member"+
				"(carnum, name, tel, id)" +
				"values ('"+
				dto.car3Real+"','"+
				dto.nameReal+"','"+
				dto.phoneReal+"','"+
				dto.idReal+"')";
		
		System.out.println(sql);
				
		try {
			res = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;
		
		
		
		
	}
}
