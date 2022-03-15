package stolica;

import java.sql.*;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class Buyer {
    private final MyDBConnection mdbc;
    private final java.sql.Statement stmt;  
    public Buyer() throws  Exception{
        
         mdbc=new MyDBConnection();
         mdbc.init();
         Connection conn=mdbc.getMyConnection();
         stmt= conn.createStatement();
    }    
     public void addBuyer(String Client, long InnClient, String CountryClient, String Director, String AddressClient, String PhoneDir, String BankClient, String AccountClient){
        String queryInsert = "";
            queryInsert = "INSERT INTO buyer_firm (Client, InnClient, CountryClient, Director, AddressClient, PhoneDir, BankCLient, AccountClient) "
                    + "values('"+Client+"','"+InnClient+"','"+CountryClient+"','"+Director+"','"+AddressClient+"','"+PhoneDir+"','"+BankClient+"','"+AccountClient+"')"; 
        try{
            int done=stmt.executeUpdate(queryInsert);
        }
        catch(Exception e){
            System.out.println("Exception in add Buyer");
        
    }
     }   
        public void updateBuyer(String ID_Client, String Client, long InnClient, String CountryClient, String Director, String AddressClient, String PhoneDir, String BankClient, String AccountClient){
        String queryInsert = "";
            queryInsert = "UPDATE buyer_firm SET Client='"+Client+"',InnClient='"+InnClient+"',CountryClient='"+CountryClient+"',Director='"+Director+"',AddressClient='"+AddressClient+"',PhoneDir='"+PhoneDir+"',BankClient='"+BankClient+"',AccountClient='"+AccountClient+"' WHERE ID_Client = "+ID_Client+""; 
        try{
            int done=stmt.executeUpdate(queryInsert);
            
        }
        catch(Exception e){
            System.out.println("Exception in update Buyer");
        
        }
    }
        public void delBuyer(String ID_Client){
        String queryDel = "DELETE FROM buyer_firm WHERE ID_Client='"+ID_Client+"'";
        try {
            int done=stmt.executeUpdate(queryDel);
            System.out.println(queryDel);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Этот покупатель используется в других таблицах, удалять запрещено", "Ошибка удаления", ERROR_MESSAGE);
            System.out.println("Exception in delete Buyer");
        }
        }

}
