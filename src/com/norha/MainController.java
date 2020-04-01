package com.norha;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome() {
		return "hello";
	}

	
	
	@GetMapping("displayname")
	public ModelAndView displayName(@RequestParam("firstName") String firstName) {
		ModelAndView modelAndView = new ModelAndView("displayName");
		Date date= new Date();
		List<String> names = new ArrayList<>();
		names.add("Robin");
		names.add("Rinu");
		names.add("Peter");
		names.add("Tinu");
		names.add("Tintu");
		names.add("Jobin");
		modelAndView.addObject("names", names);
		modelAndView.addObject("date", date);
		modelAndView.addObject("name", firstName);
		return modelAndView;
	}
	
	/*
	 * Following is make Use of modelAndView
	 */

	/*
	 * @GetMapping("displayname") public ModelAndView
	 * displayName(@RequestParam("firstName") String firstName) { ModelAndView
	 * modelAndView = new ModelAndView("displayName");
	 * modelAndView.addObject("name", firstName); return modelAndView; }
	 */
	/*
	 * Following is make Use of @RequestParam("firstName") String firstName,Model
	 * model
	 */

	/*
	 * @RequestMapping("displayname") public String
	 * displayName(@RequestParam("firstName") String firstName,Model model) {
	 * model.addAttribute("name", firstName); return "displayName"; }
	 */

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
