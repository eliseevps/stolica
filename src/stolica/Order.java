package stolica;

import java.sql.*;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class Order {
    private final MyDBConnection mdbc;
    private final java.sql.Statement stmt;
    private String Goods;
    private int Count;
    private int Category;
    private int ID_Goods;
    private String CategoryOrder;
    
    public Order() throws  Exception{
        
         mdbc=new MyDBConnection();
         mdbc.init();
         Connection conn=mdbc.getMyConnection();
         stmt= conn.createStatement();
    }
        
    public void setOrder(String itemGoods){
        String query1 = "SELECT ID_Goods FROM kind_goods WHERE ID_Goods='"+itemGoods+"'";  
        System.out.println(query1);
        try {
            ResultSet resultSet = stmt.executeQuery(query1);
            resultSet.first();
            this.ID_Goods = resultSet.getInt("ID_Goods");
            
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

    }
    public String Goods()
    {
        String query3 = "SELECT Goods FROM kind_goods where ID_Goods = '"+ID_Goods+"'";
        try {
            ResultSet resultSet = stmt.executeQuery(query3);
            resultSet.first();
            this.Goods = resultSet.getString("Goods");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }  
        return Goods; 
    }
public int Count()
    {
        String query3 = "SELECT Count FROM kind_goods where ID_Goods = '"+ID_Goods+"'";
        try {
            ResultSet resultSet = stmt.executeQuery(query3);
            resultSet.first();
            this.Count = resultSet.getInt("Count");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }  
        return Count; 
    }
public int Category()
    {
        String query3 = "SELECT ID_Category FROM kind_goods where ID_Goods = '"+ID_Goods+"'";
        try {
            ResultSet resultSet = stmt.executeQuery(query3);
            resultSet.first();
            this.Category = resultSet.getInt("ID_Category");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }  
        return Category; 
    }
    public String CategoryOrder()
    {
        Category();
        String query3 = "SELECT NameCategory FROM category where ID_Category = '"+Category+"'";
        try {
            ResultSet resultSet = stmt.executeQuery(query3);
            resultSet.first();
            this.CategoryOrder = resultSet.getString("NameCategory");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }  
        return CategoryOrder; 
    }
     public void addOrder(String Goods, String DateStart, int Period, long GoodsID, int Count, String Category){
        String queryInsert = "";
            queryInsert = "INSERT INTO order_goods (Goods, DateStart, Period, GoodsID, Count, Category, ID_Goods) "
                    + "values('"+Goods+"','"+DateStart+"','"+Period+"','"+GoodsID+"','"+Count+"','"+Category+"','"+ID_Goods+"')"; 
        System.out.println(queryInsert);
            try{
            int done=stmt.executeUpdate(queryInsert);
        }
        catch(Exception e){
            System.out.println("Exception in add OrderAdd");
        
        }
    }
        
        public void updateOrder(String ID_Order,String Goods, String DateStart, int Period, long GoodsID, int Count, String Category){
        String queryInsert = "";
            queryInsert = "UPDATE order_goods SET Goods='"+Goods+"',DateStart='"+DateStart+"',Period='"+Period+"',GoodsID='"+GoodsID+"',Count='"+Count+"',Category='"+Category+"' WHERE ID_Order = "+ID_Order+""; 
        try{
            int done=stmt.executeUpdate(queryInsert);
            
        }
        catch(Exception e){
            System.out.println("Exception in update OrderUpdate");
        
        }
    }
        public void updateGoods(String Status){
        String queryInsert = "";
            queryInsert = "UPDATE kind_goods SET Status='"+Status+"' WHERE ID_Goods = "+ID_Goods+""; 
        try{
            int done=stmt.executeUpdate(queryInsert);
            
        }
        catch(Exception e){
            System.out.println("Exception in update OrderUpdateGoods");
        
        }
    }
        public void delOrder(String ID_Order){
        String queryDel = "DELETE FROM order_goods WHERE ID_Order='"+ID_Order+"'";
        try {
            int done=stmt.executeUpdate(queryDel);
            System.out.println(queryDel);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Это поступление используется в других таблицах, удалять запрещено", "Ошибка удаления", ERROR_MESSAGE);
            System.out.println("Exception in delete OrderUpdateGoods");
        }
    }
}
