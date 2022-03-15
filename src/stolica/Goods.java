package stolica;

import java.sql.*;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class Goods {
    private final MyDBConnection mdbc;
    private final java.sql.Statement stmt;
    private int ID_Seller;
    private int ID_Category;
    
    public Goods() throws  Exception{
        
         mdbc=new MyDBConnection();
         mdbc.init();
         Connection conn=mdbc.getMyConnection();
         stmt= conn.createStatement();
    } 
    public void setGoods(String itemSeller, String itemCategory){
        String query1 = "SELECT ID_Seller FROM seller_firm WHERE Seller='"+itemSeller+"'";  
        System.out.println(query1);
        try {
            ResultSet resultSet = stmt.executeQuery(query1);
            resultSet.first();
            this.ID_Seller = resultSet.getInt("ID_Seller");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        String query2 = "SELECT ID_Category FROM category WHERE NameCategory = '"+itemCategory+"'";
        System.out.println(query2);
        try {
            ResultSet resultSet = stmt.executeQuery(query2);
            resultSet.first();
            this.ID_Category = resultSet.getInt("ID_Category");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }       
         
    }
        
     public void addGoods(String Goods, String Manufacturer, String Unit, double CostUnit, int Count, double AllCost, String DateKind,  String Status){
        String queryInsert = "";
            queryInsert = "INSERT INTO kind_goods (Goods, Manufacturer, Unit, CostUnit, Count, AllCost, DateKind, Status, ID_Seller, ID_Category) "
                    + "values('"+Goods+"','"+Manufacturer+"','"+Unit+"','"+CostUnit+"','"+Count+"','"+AllCost+"','"+DateKind+"','"+Status+"','"+ID_Seller+"','"+ID_Category+"')"; 
        try{
            int done=stmt.executeUpdate(queryInsert);
        }
        catch(Exception e){
            System.out.println("Exception in add GoodsAdd");
        
        }
    }
        
        public void updateGoods(String ID_Goods, String Goods, String Manufacturer, String Unit, double CostUnit, int Count, double AllCost, String DateKind, String Status){
        String queryInsert = "";
            queryInsert = "UPDATE kind_goods SET Goods='"+Goods+"',Manufacturer='"+Manufacturer+"',Unit='"+Unit+"',CostUnit='"+CostUnit+"',Count='"+Count+"',AllCost='"+AllCost+"',DateKind='"+DateKind+"',Status='"+Status+"',ID_Seller='"+ID_Seller+"',ID_Category='"+ID_Category+"' WHERE ID_Goods = "+ID_Goods+""; 
        try{
            int done=stmt.executeUpdate(queryInsert);
            
        }
        catch(Exception e){
            System.out.println("Exception in update GoodsUpdate");
        
        }
    }
        public void delGoods(String ID_Goods){
        String queryDel = "DELETE FROM kind_goods WHERE ID_Goods='"+ID_Goods+"'";
        try {
            int done=stmt.executeUpdate(queryDel);
            System.out.println(queryDel);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Этот заказ используется в других таблицах, удалять запрещено", "Ошибка удаления", ERROR_MESSAGE);
            System.out.println("Exception in delete GoodsUpdate");
        }
     }
}
