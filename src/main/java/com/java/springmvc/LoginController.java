package com.java.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.java.service.LoginService;

@Controller
@SessionAttributes("name")
public class LoginController {

	@Autowired
	LoginService service;
	
	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String handleLogin(@RequestParam("name") String name, @RequestParam("password") String password,
			ModelMap map) {

		if (!service.validateUser(name, password)) {
			map.put("errorMessage", "Invalid credential");

			return "login";
		}

		map.put("name", name);

		System.out.println("Name---" + name);
		System.out.println("Password---" + password);

		return "Welcome";
	}

}
