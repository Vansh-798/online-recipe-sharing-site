import dao.UserDAO;
import model.User;
import threads.ActivityLoggerThread;
public class App{
public static void main(String[] args){
User u=new User();
u.setName("Prince");
u.setEmail("prince@gmail.com");
u.setPassword("1234");
u.setRole("USER");
UserDAO dao=new UserDAO();
if(dao.addUser(u))System.out.println("User added");
new ActivityLoggerThread().start();
}
}
