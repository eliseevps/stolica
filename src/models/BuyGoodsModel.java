package models;

import javax.swing.table.AbstractTableModel;
import java.sql.*;
import java.util.ArrayList;

public class BuyGoodsModel extends AbstractTableModel {
    
    private int colnum=7;
    private String[] colNames={
        "ID продажи",
        "Количество товара",
        "Цена за единицу",
        "Общая цена",
        "Дата продажи",
        "Товар",
        "Покупатель",
    };
    private  ArrayList<String[]> ResultSets;
    
    public BuyGoodsModel(ResultSet rs) {
      
      ResultSets=new ArrayList<String[]>();  
    
      try{
        while(rs.next()){
      
              String[] row={
                rs.getString("ID_Sell"),
                rs.getString("Volume"),
                rs.getString("CostUnitVol"),
                rs.getString("AllCostBuy"),
                rs.getString("DATE_FORMAT(DateVolume, '%e.%m.%Y')"),
                rs.getString("Goods"),
                rs.getString("Client")
            };
            ResultSets.add(row);
      
         }   
      }
      catch(Exception e){
          System.out.println("Exception in BuyGoodsModel");
            }
        
    }
   
    public Object getValueAt(int rowindex, int columnindex) {
        
       String[] row=ResultSets.get(rowindex);
       return row[columnindex];
        
    }

    public int getRowCount() {
        return ResultSets.size();
    }

    public int getColumnCount() {
        return colnum;
    }

    public String getColumnName(int param) {

       return colNames[param];
    }
}
