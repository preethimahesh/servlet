import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.sql.Connection;
import java.util.List;
import java.util.ArrayList;
import java.util.*;
class Another
{
        public static void getQuery(String table,List<String> field_name,List<String> value)
		throws SQLException
        {
	  			Connection connection = DBConnection.getDBConnection();
				int i=0,j=0;
				String fieldname[]=new String[7];
				String fieldvalue[]=new String[7];
				  for (String name : field_name) {
					  fieldname[i]=name;
					  i++;					  
				  }
				  for (String field_value : value) {
					   fieldvalue[j]=field_value;
					   j++;					  
				  }
				Statement statement = connection.createStatement();
				String query = "INSERT INTO `"+table+"`(`"+fieldname[0]+"`,`"+fieldname[1]+"`,`"+fieldname[2]+"`,`"+fieldname[3]+"`,`"+fieldname[4]+"`,`"+fieldname[5]+"`,`"+fieldname[6]+"`) VALUES (?,?,?,?,?,?,?)";
				String query1 = "INSERT INTO `registration`(`f_name`, `l-name`, `email`, `date`, `time`, `topic`, `location`) VALUES (?,?,?,?,?,?,?)";
				//The Second query is just for compare purpose
				System.out.println(query); 
				System.out.println(query1);

				PreparedStatement s1=connection.prepareStatement(query);
			

				s1.setString(1,fieldvalue[0]);
				s1.setString(2,fieldvalue[1]);
				s1.setString(3,fieldvalue[2]);
				s1.setString(4,fieldvalue[3]);
				s1.setString(5,fieldvalue[4]);
				s1.setString(6,fieldvalue[5]);
				s1.setString(7,fieldvalue[6]);
				s1.executeUpdate();
    }
    }