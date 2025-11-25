package dao;
import model.Recipe;
import util.DBConnection;
import java.sql.*;
public class RecipeDAO{
public boolean addRecipe(Recipe r){
try{
Connection con=DBConnection.getConnection();
con.setAutoCommit(false);
String q="INSERT INTO recipes(title,ingredients,instructions,created_by) VALUES(?,?,?,?)";
PreparedStatement ps=con.prepareStatement(q);
ps.setString(1,r.getTitle());
ps.setString(2,r.getIngredients());
ps.setString(3,r.getInstructions());
ps.setInt(4,r.getUserId());
ps.executeUpdate();
con.commit();
return true;
}catch(Exception e){e.printStackTrace();return false;}
}
}
