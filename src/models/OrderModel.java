package models;

import javax.swing.table.AbstractTableModel;
import java.sql.*;
import java.util.ArrayList;

public class OrderModel extends AbstractTableModel {
    
    private int colnum=8;
    private String[] colNames={
        "ID поступления",
        "Наименование товара",
        "Дата изготовления",
        "Срок хранения",
        "Штрих-код",
        "Количество",
        "Категория",
        "Заказ",
    };
    private  ArrayList<String[]> ResultSets;
    
    public OrderModel(ResultSet rs) {
      
      ResultSets=new ArrayList<String[]>();  
    
      try{
        while(rs.next()){
      
              String[] row={
                rs.getString("ID_Order"),
                rs.getString("Goods"),
                rs.getString("DATE_FORMAT(DateStart, '%e.%m.%Y')"),
                rs.getString("Period"),
                rs.getString("GoodsID"),
                rs.getString("Count"),
                rs.getString("Category"),
                rs.getString("ID_Goods"),
          
            };
            ResultSets.add(row);
      
         }   
      }
      catch(Exception e){
          System.out.println("Exception in OrderModel");
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
