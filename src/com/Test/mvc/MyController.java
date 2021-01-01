package com.Test.mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController 
{
	@RequestMapping("/reg")
	public String loadMyFirstPage()
	{
		return "registration";
	}

	@RequestMapping(value ="/myreg",method = RequestMethod.POST)
	public String performLogin(@ModelAttribute("user") Employee user)  
	{
	try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/springmvc","root","root");


			PreparedStatement ps=con.prepareStatement("insert into data (eEmail,eName,ePass,eCity) values(?,?,?,?)");

			ps.setString(1, user.geteEmail());
			ps.setString(2, user.geteName());
			ps.setString(3, user.getePass());
			ps.setString(4, user.geteCity());
			int row=ps.executeUpdate();
				
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return "home";
	}  
 

}