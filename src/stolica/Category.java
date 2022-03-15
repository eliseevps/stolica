package stolica;

import java.sql.*;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class Category {
    
   private final MyDBConnection mdbc;
   private final java.sql.Statement stmt; 
   public Category() throws  Exception{
        
         mdbc=new MyDBConnection();
         mdbc.init();
         Connection conn=mdbc.getMyConnection();
         stmt= conn.createStatement();
    }
    
    public void addCategory(String NameCategory){
        String queryInsert = "";
            queryInsert = "INSERT INTO category (NameCategory) values('"+NameCategory+"')"; 
        try{
            int done=stmt.executeUpdate(queryInsert);
        }
      catch(Exception e){
          System.out.println("Exception in add Category");
            }
   }    
    public void updateCategory(String ID_Category, String NameCategory){
        String queryInsert = "";
            queryInsert = "UPDATE category SET NameCategory='"+NameCategory+"' WHERE ID_Category = "+ID_Category+""; 
        try{
            int done=stmt.executeUpdate(queryInsert);
            
        }
      catch(Exception e){
          System.out.println("Exception in update Category");
            }
        
    }
        public void delCategory(String ID_Category) throws SQLException{
        int yesNo;
        String queryDel = "DELETE FROM category WHERE ID_Category='"+ID_Category+"'";
        try {
            int done=stmt.executeUpdate(queryDel);
            System.out.println(queryDel);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Эта категория используется в других таблицах, удалять запрещено", "Ошибка удаления", ERROR_MESSAGE);
            System.out.println("Exception in delete Category");
        }
    }
}
