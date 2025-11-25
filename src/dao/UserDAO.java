package dao;
import model.User;
import util.DBConnection;
import java.sql.*;
public class UserDAO{
public boolean addUser(User u){
try{
Connection con=DBConnection.getConnection();
String q="INSERT INTO users(name,email,password,role) VALUES(?,?,?,?)";
PreparedStatement ps=con.prepareStatement(q);
ps.setString(1,u.getName());
ps.setString(2,u.getEmail());
ps.setString(3,u.getPassword());
ps.setString(4,u.getRole());
return ps.executeUpdate()>0;
}catch(Exception e){e.printStackTrace();return false;}
}
}
