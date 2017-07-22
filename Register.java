import java.io.IOException;
import java.io.PrintWriter;
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
import java.util.List;
import java.util.ArrayList;
@WebServlet("/register")
public class Register extends HttpServlet
{
	public void doPost(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException, IOException
			{
				Register rg=new Register();
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				
				String table=request.getParameter("databasename");

				String field1=request.getParameter("field1");
				String field2=request.getParameter("field2");
				String field3=request.getParameter("field3");
				String field4=request.getParameter("field4");
				String field5=request.getParameter("field5");
				String field6=request.getParameter("field6");
				String field7=request.getParameter("field7");

				List<String> field_name = new ArrayList<String>();
				field_name.add(field1);
				field_name.add(field2);
				field_name.add(field3);
				field_name.add(field4);
				field_name.add(field5);
				field_name.add(field6);
				field_name.add(field7);

				String firstname=request.getParameter("firstname");
				String lastname=request.getParameter("lastname");
				String email=request.getParameter("email");
				String date=request.getParameter("date");				
				String time=request.getParameter("time");
				String topic=request.getParameter("topic");
				String location=request.getParameter("location");

				List<String> value = new ArrayList<String>();
				value.add(firstname);
				value.add(lastname);
				value.add(email);
				value.add(date);
				value.add(time);
				value.add(topic);
				value.add(location);

		/*	int i=0,j=0;
				String fieldname[]=new String[7];
				String fieldvalue[]=new String[7];
				  for (String name : field_name) {
					  fieldname[i]=name;
					  out.println(fieldname[i]);
					  i++;					  
				  }
				  for (String field_value : value) {
					   fieldvalue[j]=field_value;
					   out.println(fieldvalue[j]);
					  j++;					  
				  }*/

				try {
						Another.getQuery(table,field_name,value);
						out.println("Successful Updated");
				
					} 
					catch (Exception e) {
						out.println("Unsuccessful");
					}
}	
}