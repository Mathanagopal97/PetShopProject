package com.niit;


import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.dao.UserDAO;
import com.niit.model.Product;
import com.niit.model.User;



@Controller
public class UserController {

	@Autowired
	UserDAO userDAO;
	
	/*@RequestMapping(value="account",method=RequestMethod.GET)
	public String showaccount(Model m)
	{
		User user= new User();
		m.addAttribute(user);
		
		List<User> listUser=userDAO.retrieveUser();
		m.addAttribute("userList",listUser);
		return "Account";
	}*/
	/*@RequestMapping(value="user",method=RequestMethod.GET)

	   public String userForm(Locale locale,Model model) {
	      model.addAttribute("user", new User());
	      return "User";
	   }*/
	/*@RequestMapping(value="user",method=RequestMethod.POST)
	   public String saveUser(@ModelAttribute("user") @Valid User user, BindingResult result,
	         Model model) {

	      if (result.hasErrors()) {
	         return "User";
	      }
	      return "Login";
	   }
	*/
	
	/*@RequestMapping(value="user", method=RequestMethod.POST)
    public String submitForm(@Valid User user, BindingResult result, Model m) {
        if(result.hasErrors()) {
            return "user";
        }
         
        m.addAttribute("message", "Successfully saved person: " + user.toString());
        return "Login";
    }*/
	@RequestMapping(value="user",method=RequestMethod.GET)
	public String showUser(Model m)
	{
		User user = new User();
		m.addAttribute(user);
		
		return "User";
	}

	    /*@RequestMapping(value = "user", method = RequestMethod.GET)
	    public String viewUser(Map<String, Object> model) {
	        User user = new User();
	        model.put("user", user);
	        return "User";
	    }
	 
	    @RequestMapping(value = "user", method = RequestMethod.POST)
	    public String doLogin(@Valid @ModelAttribute("user") User user,
	            BindingResult result, Map<String, Object> model) {
	 
	        if (result.hasErrors()) {
	            return "User";
	        }
	 
	        return "Login";
	    }
	*/
	@RequestMapping(value="AddUser",method=RequestMethod.POST)
	public String addUser(@ModelAttribute("user")User user,Model m)
	{
		user.setRole("ROLE_USER");
		user.setEnabled("True");
		userDAO.addUser(user);
		
		return "Login";
	}
			
	/*@RequestMapping(value="updateUser/{userName}",method=RequestMethod.GET)
	public String updateuser(@PathVariable("userName") String userName,Model m)
	{
		User user=userDAO.getUser(userName);
		m.addAttribute(user);
		
		List<User> listUser=userDAO.retrieveUser();
		m.addAttribute("userList",listUser);
		return "UpdateUser";
	}*/
	
	/*@RequestMapping(value="UpdateUser",method=RequestMethod.POST)
	public String updateMyUser(@ModelAttribute("user")User user,Model m)
	{
		userDAO.updateUser(user);
		
		List<User> listUser=userDAO.retrieveUser();
		m.addAttribute("userList",listUser);
		return "Account";
	}*/
	
	
}