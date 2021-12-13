import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public abstract class DAOImpl<D extends DBData<K>,K> implements DAO<D,K> {

	
	public abstract String getInsertValueStr(D data);
	public abstract Statement getStatement();
	public abstract D getNewData(ResultSet rs);
	public abstract String getKeyColumnName();
	public abstract String getUpdateValueStr(D data);
	String dbTableName;
	
	
	public DAOImpl(String dbTableName){
		this.dbTableName = dbTableName;
	}
	

	@Override
	public void insert(D data) {
		try {
			String fmt =  "INSERT INTO %s VALUES(%s)";
			String valueStr = getInsertValueStr(data);
			String q =  String.format(fmt, dbTableName,valueStr);
			getStatement().execute(q);
		} catch (SQLException e) {e.printStackTrace();}
	}

	@Override
	public List<D> findAll() {
		ArrayList<D> dataList = new ArrayList<D>();
		ResultSet rs;
		try {
			rs = getStatement().executeQuery("SELECT *FROM "+ dbTableName);
			while(rs.next()) {
				dataList.add(getNewData(rs));
			}
		}
		catch(SQLException e){e.printStackTrace();}
		
		return dataList;
	}

	@Override
	public D findByKey(K key) {
		D data = null;
		ResultSet rs;
		try {
			String fmt ="SELECT * FROM %s WHERE %s = '%s'";
			String q = String.format(fmt,dbTableName,getKeyColumnName(),key.toString());
			rs = getStatement().executeQuery(q);
			if(rs.next()) {
				data = getNewData(rs);
			}
			
		}
		catch (SQLException e) {e.printStackTrace();}
		return data;
	}

	@Override
	public void update(K key,D data) {
		D data2 = findByKey(key);
		if(data2 !=null) {
			try {
				String fmt ="UPDATE %s SET %s WHERE %s = '%s'";
				String q = String.format(fmt,dbTableName,getUpdateValueStr(data)
						,getKeyColumnName(),key.toString());
				getStatement().execute(q);
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}

	@Override
	public void deleteByKey(K key) {
		
		try {
			String fmt =  "DELETE FROM %s WHERE %s = '%s'";
			String q = String.format(fmt,dbTableName,getKeyColumnName(),key.toString());
			getStatement().execute(q);
		}
		catch(SQLException e){e.printStackTrace();}
	}
		

	@Override
	public void deleteByData(D data) {
		deleteByKey(data.getKey());
	}

}
