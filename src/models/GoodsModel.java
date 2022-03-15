package models;

import javax.swing.table.AbstractTableModel;
import java.sql.*;
import java.util.ArrayList;

public class GoodsModel extends AbstractTableModel {
    
    private int colnum=11;
    private String[] colNames={
        "ID Заказа",
        "Наименование товара",
        "Изготовитель",
        "Единица измерения",
        "Цена за единицу измерения",
        "Количество товара",
        "Общая цена",
        "Дата заказа",
        "Статус",
        "Продавец",
        "Категория товара"
    };
    private  ArrayList<String[]> ResultSets;
    
    public GoodsModel(ResultSet rs) {
      
      ResultSets=new ArrayList<String[]>();  
    
      try{
        while(rs.next()){
      
              String[] row={
                rs.getString("ID_Goods"),
                rs.getString("Goods"),
                rs.getString("Manufacturer"),
                rs.getString("Unit"),
                rs.getString("CostUnit"),
                rs.getString("Count"),
                rs.getString("AllCost"),
                rs.getString("DATE_FORMAT(DateKind, '%e.%m.%Y')"),
                rs.getString("Status"),
                rs.getString("Seller"),
                rs.getString("NameCategory"),
          
            };
            ResultSets.add(row);
      
         }   
      }
      catch(Exception e){
          System.out.println("Exception in GoodsModel");
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
