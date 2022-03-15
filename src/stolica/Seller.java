package stolica;

import java.sql.*;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class Seller {
    private final MyDBConnection mdbc;
    private final java.sql.Statement stmt;
    
    public Seller() throws  Exception{
        
         mdbc=new MyDBConnection();
         mdbc.init();
         Connection conn=mdbc.getMyConnection();
         stmt= conn.createStatement();
    }    
     public void addSeller(String Seller, long InnSeller, String Country, String Chief, String Address, String Phone, String Manager, String PhonePlus, String Bank, String Account){
        String queryInsert = "";
            queryInsert = "INSERT INTO seller_firm (Seller, InnSeller, Country, Chief, Address, Phone, Manager, PhonePlus, Bank, Account) "
                    + "values('"+Seller+"','"+InnSeller+"','"+Country+"','"+Chief+"','"+Address+"','"+Phone+"','"+Manager+"','"+PhonePlus+"','"+Bank+"','"+Account+"')"; 
        try{
            int done=stmt.executeUpdate(queryInsert);
        }
        catch(Exception e){
            System.out.println("Exception in add Seller");
        
    }
     }
    
    public void updateSeller(String ID_Seller, String Seller, long InnSeller, String Country, String Chief, String Address, String Phone, String Manager, String PhonePlus, String Bank, String Account){
        String queryInsert = "";
            queryInsert = "UPDATE seller_firm SET Seller='"+Seller+"',InnSeller='"+InnSeller+"',Country='"+Country+"',Chief='"+Chief+"',Address='"+Address+"',Phone='"+Phone+"',Manager='"+Manager+"',PhonePlus='"+PhonePlus+"',Bank='"+Bank+"',Account='"+Account+"' WHERE ID_Seller = "+ID_Seller+""; 
        try{
            int done=stmt.executeUpdate(queryInsert);
            
        }
        catch(Exception e){
            System.out.println("Exception in update Seller");
        
        }
    }

        public void delSeller(String ID_Seller){
        String queryDel = "DELETE FROM seller_firm WHERE ID_Seller='"+ID_Seller+"'";
        try {
            int done=stmt.executeUpdate(queryDel);
            System.out.println(queryDel);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Этот продавец используется в других таблицах, удалять запрещено", "Ошибка удаления", ERROR_MESSAGE);
            System.out.println("Exception in delete Seller");
        }
        }
}
