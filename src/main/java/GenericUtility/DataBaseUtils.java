package GenericUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DataBaseUtils 
{
	Connection conn = null;
	ResultSet result = null;
	
   public void connectiontoDB() throws SQLException
    {
	   
	    //register the database
	    Driver driver = new Driver();
	    DriverManager.registerDriver(driver);
	
	    //get connection for database
	     conn = DriverManager.getConnection(Ipathconstants.dbUrl, Ipathconstants.dbUsername,Ipathconstants.dbPassword);
	
    }
   public ResultSet executeQuery(String query) throws SQLException
   {
	   //create statement
	   Statement state = conn.createStatement();
	   result = state.executeQuery(query);
	   return result;
   }
   public int updateQuery(String query) throws SQLException
   {
	   //create statement
	   Statement state = conn.createStatement();
	   int res = state.executeUpdate(query);
	   return res;
	   
   }
   public void disconnectDB() throws SQLException
   {
	  //close database connection
	   conn.close();
   }
}
	   
	   


