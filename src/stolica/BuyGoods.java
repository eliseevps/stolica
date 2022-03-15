package stolica;

import java.sql.*;

public class BuyGoods {
    private final MyDBConnection mdbc;
    private final java.sql.Statement stmt;
    private int Count,
                ID_Order,
                ID_Goods,
                ID_Client;
    private double CostUnit;
    
    public BuyGoods() throws  Exception{
        
         mdbc=new MyDBConnection();
         mdbc.init();
         Connection conn=mdbc.getMyConnection();
         stmt= conn.createStatement();
    } 
    
    public void setBuyGoods(String itemGoods, String itemOrder, String itemBuyer){
        String query1 = "SELECT ID_Order FROM order_goods WHERE Goods='"+itemOrder+"'";  
        System.out.println(query1);
        try {
            ResultSet resultSet = stmt.executeQuery(query1);
            resultSet.first();
            this.ID_Order = resultSet.getInt("ID_Order");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        String query2 = "SELECT ID_Client FROM buyer_firm WHERE Client = '"+itemBuyer+"'";
        System.out.println(query2);
        try {
            ResultSet resultSet = stmt.executeQuery(query2);
            resultSet.first();
            this.ID_Client = resultSet.getInt("ID_Client");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }  
        String query3 = "SELECT ID_Goods FROM kind_goods WHERE Goods='"+itemGoods+"'";  
        System.out.println(query1);
        try {
            ResultSet resultSet = stmt.executeQuery(query3);
            resultSet.first();
            this.ID_Goods = resultSet.getInt("ID_Goods");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
    public int Count()
    {
        String query3 = "SELECT Count FROM order_goods WHERE ID_Order = '"+ID_Order+"'";
        System.out.println(query3);
        try {
            ResultSet resultSet = stmt.executeQuery(query3);
            resultSet.first();
            this.Count = resultSet.getInt("Count");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }  
        return Count; 
    }
    public double CostUnit()
    {
        String query3 = "SELECT CostUnit FROM kind_goods WHERE ID_Goods = '"+ID_Goods+"'";
        System.out.println(query3);
        try {
            ResultSet resultSet = stmt.executeQuery(query3);
            resultSet.first();
            this.CostUnit = resultSet.getInt("CostUnit");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }  
        return CostUnit; 
    }
     public void addBuyGoods(int Volume, double CostUnitVol, double AllCostBuy, String DateVolume){
        String queryInsert = "";
        String queryupdateGoods = "";
            queryInsert = "INSERT INTO buy_goods (Volume, CostUnitVol, AllCostBuy, DateVolume, ID_Order, ID_Client) "
                    + "values('"+Volume+"','"+CostUnitVol+"','"+AllCostBuy+"','"+DateVolume+"','"+ID_Order+"','"+ID_Client+"')"; 
            queryupdateGoods = "UPDATE order_goods SET Count=Count-'"+Volume+"' WHERE ID_Order = "+ID_Order+"";
        try{
            {int done=stmt.executeUpdate(queryupdateGoods);
            done=stmt.executeUpdate(queryInsert);}   
        }
        catch(Exception e){
            System.out.println("Exception in add BuyGoods");
        
    }
}    
        public void updateBuyGoods(String ID_Sell, int Volume, double CostUnitVol, double AllCostBuy, String DateVolume){
        String queryInsert = "";
            queryInsert = "UPDATE buy_goods SET Volume='"+Volume+"',CostUnitVol='"+CostUnitVol+"',AllCostBuy='"+AllCostBuy+"',DateVolume='"+DateVolume+"',ID_Client='"+ID_Client+"',ID_Order='"+ID_Order+"' WHERE ID_Sell = "+ID_Sell+""; 
        try{
            int done=stmt.executeUpdate(queryInsert);
            
        }
        catch(Exception e){
            System.out.println("Exception in update BuyGoods");
        
        }
    }
        public void delBuyGoods(String ID_Sell){
        String queryDel = "DELETE FROM buy_goods WHERE ID_Sell='"+ID_Sell+"'";
        try {
            int done=stmt.executeUpdate(queryDel);
            System.out.println(queryDel);
        } catch (SQLException e) {
            System.out.println("Exception in delete BuyGoods");
        }
        }
}
