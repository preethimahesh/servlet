import java.io.IOException;
//import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import javax.servlet.annotation.*;
import java.io.PrintWriter;
//import java.util.List;
//import java.util.ArrayList;
@WebServlet("/Register")
public class Register extends HttpServlet
{	

	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		
		res.setContentType("text/html");

		PrintWriter pt= res.getWriter();
		String firstname1=req.getParameter(firstname);
		String lastname1=req.getParameter(lastname);
		int contactno1=req.getParameter(contactno);
		try{
		Connection conn=DBConnection.getDBConnection();
		Statement st=conn.createStatement();
		String query="INSERT INTO stu_details VALUES(?,?,?)";

		PreparedStatement ps=conn.prepareStatement(query);
		ps.setString(1,firstname1);
		ps.setString(2,lastname1);
		ps.setString(3,contactno1);
		//ResultSet ps=st.executeQuery(query);
		int i=ps.executeUpdate();
		if(i>0){
			pt.println("successfully updated");
		}
		else
		{
			pt.println("unsuccessful");
		}
	}
	catch(SQLException e)
	{
		System.out.println(e);
	}
	} 
}
