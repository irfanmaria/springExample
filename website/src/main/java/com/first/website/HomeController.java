package com.first.website;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("index ")
	public void home()
	{
		System.out.println("Hi.. Your tomcat is started");
	}

}
