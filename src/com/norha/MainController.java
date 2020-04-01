package com.norha;

import java.net.http.HttpRequest;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String welcome() {
		return "hello";
	}
	
	
	@RequestMapping("displayname")
	public String displayName(@RequestParam("firstName") String firstName,Model model) {
		model.addAttribute("name", firstName);
		return "displayName";
	}
	
	
	/* Following is make use of HttpServletRequest.setAttribute */
	
	/*
	 * @RequestMapping("displayname") public String displayName(HttpServletRequest
	 * request) { String firstName= request.getParameter("firstName");
	 * request.setAttribute("firstName", firstName); return "displayName"; }
	 */
	
	/*
	 * Following Calls are equal as above
	 */
	/*
	 * @RequestMapping(value = "displayname") public String displayName() { return
	 * "displayName"; } 
	 */
	
	/*
	 * @RequestMapping(value = "displayname",method = RequestMethod.GET) public
	 * String displayName() { return "displayName"; }
	 */
}
