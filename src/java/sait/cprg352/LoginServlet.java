
package sait.cprg352;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import domain.User;

/**
 *
 * @author 463849
 */
public class LoginServlet extends HttpServlet {

    UserService userService = new UserService();
    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String logoutMessage = request.getParameter("logout");
        request.setAttribute("logout", logoutMessage);
        
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String user = request.getParameter("user");
        String password = request.getParameter("pw");
        
        User user1 = new User();
        user1.setName(user);
        user1.setPassword(password);
        
        request.setAttribute("user", user1.getName());
        request.setAttribute("password", user1.getPassword());
        
        if(user == null || user.isEmpty() || password == null || password.isEmpty()){
            
            request.setAttribute("errorMessage", "Both username and Password required");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            return;
            
        }
        
        if(!userService.login(user1.getName(),user1.getPassword())){
            
            request.setAttribute("invalid", "Username or Password Invalid");
            request.setAttribute("user", user);
            request.setAttribute("password", password);
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            return;
            
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/mainPage.jsp").forward(request, response);
        
    }

}
