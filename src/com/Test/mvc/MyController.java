package com.task.mvc;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
		 Class.forName();
                    code of Sql
		return "home";
	}  
 

}
