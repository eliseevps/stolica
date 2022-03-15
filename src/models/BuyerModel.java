package models;

import javax.swing.table.AbstractTableModel;
import java.sql.*;
import java.util.ArrayList;

public class BuyerModel extends AbstractTableModel {
    
    private int colnum=9;
    private String[] colNames={
        "ID покупателя",
        "Покупатель",
        "ИНН",
        "Директор",
        "Телефон директора",
        "Адрес",
        "Банк",
        "Номер счета",
        "Страна"
    };
    private  ArrayList<String[]> ResultSets;
    
    public BuyerModel(ResultSet rs) {
      
      ResultSets=new ArrayList<String[]>();  
    
      try{
        while(rs.next()){
      
              String[] row={
                rs.getString("ID_Client"),
                rs.getString("Client"),
                rs.getString("InnClient"),
                rs.getString("Director"),
                rs.getString("PhoneDir"),
                rs.getString("AddressClient"),
                rs.getString("BankClient"),
                rs.getString("AccountClient"),
                rs.getString("CountryClient")
            };
            ResultSets.add(row);
      
         }   
      }
      catch(Exception e){
          System.out.println("Exception in BuyerModel");
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
