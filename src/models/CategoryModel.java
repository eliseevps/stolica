package models;

import javax.swing.table.AbstractTableModel;
import java.sql.*;
import java.util.ArrayList;


public class CategoryModel extends AbstractTableModel {
    
    private int colnum=2;
    private String[] colNames={
        "ID категории",
        "Название категории"
    };
    private  ArrayList<String[]> ResultSets;
    
    public CategoryModel(ResultSet rs) {
      
      ResultSets=new ArrayList<String[]>();  
    
      try{
        while(rs.next()){
      
              String[] row={
                rs.getString("ID_Category"),
                rs.getString("NameCategory")
            };
            ResultSets.add(row);
      
         }   
      }
      catch(Exception e){
          System.out.println("Exception in CategoryModel");
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
