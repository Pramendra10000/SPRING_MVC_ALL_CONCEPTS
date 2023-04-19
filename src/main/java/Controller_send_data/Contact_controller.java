package Controller_send_data;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import Model_user.user;

@Controller
public class Contact_controller {

	
	@ModelAttribute
	public void common_data(Model m) {
		m.addAttribute("First", "Handling Form with ModelAttribute");
		System.out.println("Common data print : : :  >>> ");
		
	}
	
	
	
	@RequestMapping("/")
	public String showform(Model model) {
		System.out.println("This is contact page : :");
		model.addAttribute("topic", "Welcome to Programing");
		model.addAttribute("info", "Have a good day , All the best !");
		return "contact";
	}

	
// new pattern to use with spring mvc
	
	@RequestMapping(path = " ", method = RequestMethod.POST)
	public String formsubmit(@RequestParam(name = "name",required = true) String name, @RequestParam("email") String email,
			@RequestParam("pass") String pass ,Model model) {

 user us = new user();
 us.setName(name);
 us.setEmail(email);
 us.setPass(pass);
 
 System.out.println("All Details ::::  "+us);
 
 model.addAttribute("user", us);
		
		return "Home";
	}
	
	
	// by using @model attribute templete
	
	@RequestMapping(path = "/formsubmit", method = RequestMethod.POST)
	public String formsubmit(@ModelAttribute user user ,Model model) {

		model.addAttribute("info", "Thank you For Visit Page!");
 System.out.println("All Details ::::  "+user);
 
 //model.addAttribute("user", user);
		
		return "Home";
	}
	
	
	
	

}
