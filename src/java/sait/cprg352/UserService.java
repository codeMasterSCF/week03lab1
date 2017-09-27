
package sait.cprg352;

/**
 *
 * @author 463849
 */
public class UserService {
    
    public boolean login(String username, String password){
    
        String user1 = "Adam";
        String user2 = "Betty";
        String pw = "password";
        
        if(username.equals(user1) || username.equals(user2) && password.equals(pw)){
            return true;
        }
        else{
            return false;
        }
    } 
}
