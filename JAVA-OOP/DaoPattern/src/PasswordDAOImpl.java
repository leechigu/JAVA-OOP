import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.util.ArrayList;

import java.util.List;


public class PasswordDAOImpl extends DAOImpl<PasswordInfo ,String>{
 
	final static String DB_FILE_NAME ="password.db";
	
	Connection connection = null;
	Statement statement = null;
	ResultSet rs = null;
	
	
	public PasswordDAOImpl(String dbTableName){
		super(dbTableName);
		try {
			final String table = " (url TEXT PRIMARY KEY, id TEXT, password TEXT)";
			connection = DriverManager.getConnection("jdbc:sqlite:"+dbTableName);
			statement = connection.createStatement();
			statement.setQueryTimeout(20);
			
			statement.executeUpdate("DROP TABLE IF EXISTS "+dbTableName);
			statement.executeUpdate("CREATE TABLE "+dbTableName + table);
		}
		catch(SQLException e) {e.printStackTrace();}
		
		
	}
	public Statement getStatement() {
		return statement;
	}
	public String getInsertValueStr(PasswordInfo data) {
		String fmt = "'%s', '%s', '%s'";
		String q = String.format(fmt, data.getKey(), data.getId(), data.getPassword());
		return q;
	}
	
	public PasswordInfo getNewData(ResultSet rs) {
		PasswordInfo p = null;
		if(rs !=null) {
			try{
				p =new PasswordInfo(rs.getString("url"),rs.getString("id"),rs.getString("password"));
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return p;
		
	}
	public String getKeyColumnName() {
		return "URL";
	}
	public String getUpdateValueStr(PasswordInfo data) {
		String fmt = "id = '%s',password = '%s'";
		String q = String.format(fmt, data.getId(),data.getPassword());
		return q;
		
	}
	

}
