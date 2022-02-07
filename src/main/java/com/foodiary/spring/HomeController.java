package com.foodiary.spring;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/demo", method = RequestMethod.GET)
	public String demo(Locale locale, Model model) {
		return "Demo";	
}
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String New(Locale locale, Model model) {
		return "New";	
}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {
		return "login";	
}
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join(Locale locale, Model model) {
		return "join";	
}
	@RequestMapping(value = "/diary", method = RequestMethod.GET)
	public String diary(Locale locale, Model model) {
		return "Mydiary";	
}
	@RequestMapping(value = "/gallery", method = RequestMethod.GET)
	public String gallery(Locale locale, Model model) {
		return "gallery";	
}
	@RequestMapping(value = "/memo", method = RequestMethod.GET)
	public String memo(Locale locale, Model model) {
		return "input_memo";	
}
	@RequestMapping(value = "/fmemo", method = RequestMethod.GET)
	public String fmemo(Locale locale, Model model) {
		return "input_food";	
}
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String search(Locale locale, Model model) {
		return "input_search";	
}	
	@RequestMapping(value = "/input_gallery", method = RequestMethod.GET)
	public String input_gallery(Locale locale, Model model) {
		return "input_gallery";	
}	
	@RequestMapping(value = "/input_search", method = RequestMethod.GET)
	public String input_search(Locale locale, Model model) {
		return "input_search";	
}	
	@RequestMapping(value = "/calendar", method = RequestMethod.GET)
	public String calendar(Locale locale, Model model) {
		return "calendar";	
}	
	@RequestMapping(value = "/input_food", method = RequestMethod.GET)
	public String input_food(Locale locale, Model model) {
		return "input_food";	
}		
	@RequestMapping(value = "/input_memo", method = RequestMethod.GET)
	public String input_memo(Locale locale, Model model) {
		return "input_memo";	
}			
}
