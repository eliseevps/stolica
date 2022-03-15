package models;

import javax.swing.table.AbstractTableModel;
import java.sql.*;
import java.util.ArrayList;

public class SellerModel extends AbstractTableModel {
    
    private int colnum=11;
    private String[] colNames={
        "ID продавца",
        "Наименование фирмы",
        "ИНН",
        "Страна",
        "Директор",
        "Адрес",
        "Телефон",
        "Менеджер",
        "Телефон отдела продаж",
        "Банк",
        "Номер счет в банке"
    };
    private  ArrayList<String[]> ResultSets;
    
    public SellerModel(ResultSet rs) {
      
      ResultSets=new ArrayList<String[]>();  
    
      try{
        while(rs.next()){
      
              String[] row={
                rs.getString("ID_Seller"),
                rs.getString("Seller"),
                rs.getString("InnSeller"),
                rs.getString("Country"),
                rs.getString("Chief"),
                rs.getString("Address"),
                rs.getString("Phone"),
                rs.getString("Manager"),
                rs.getString("PhonePlus"),
                rs.getString("Bank"),
                rs.getString("Account"),
          
            };
            ResultSets.add(row);
      
         }   
      }
      catch(Exception e){
          System.out.println("Exception in SellerModel");
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
