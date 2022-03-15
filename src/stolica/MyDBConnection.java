package stolica;

import java.sql.*;

public class MyDBConnection {
    private Connection myConnection;
    public MyDBConnection() {
    }

    public void init(){
       try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        myConnection=DriverManager.getConnection(
                "jdbc:mysql://remotemysql.com/2q4KMbYEZH?autoReconnect=true","2q4KMbYEZH", "mgMVzFOAex");
        }
        catch(Exception e){
            System.out.println("Failed to get connection");
            e.printStackTrace();
        }
    }
    public Connection getMyConnection(){
        return myConnection;
    }
 
    public void close(ResultSet rs){
        if(rs !=null){
            try{
               rs.close();
            }
            catch(Exception e){}
        }
    }
    
     public void close(java.sql.Statement stmt){
        if(stmt !=null){
            try{
               stmt.close();
            }
            catch(Exception e){}
        }
    }
  public void destroy(){
    if(myConnection !=null){
         try{
               myConnection.close();
            }
            catch(Exception e){}  
    }
  }
}
