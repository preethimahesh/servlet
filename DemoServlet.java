import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@WebServlet("/welcome")
public class DemoServlet implements Servlet{
   ServletConfig config=null;
   public void init(ServletConfig config){
      this.config=config;
      System.out.println("Initialization complete");
   }

   public void service(ServletRequest req,ServletResponse res)
   throws IOException,ServletException{
       res.setContentType("text/html");
       PrintWriter pwriter=res.getWriter();
       pwriter.print("<html>");
       pwriter.print("<body>");
       pwriter.print("<h1>Servlet Example Program</h1>");
       pwriter.print("</body>");
       pwriter.print("</html>");
   }
   public void destroy(){
       System.out.println("servlet life cycle finished");
   }
   public ServletConfig getServletConfig(){
       return config;
   }
   public String getServletInfo(){
       return "A Demo program written by Chaitanya";
   }
}