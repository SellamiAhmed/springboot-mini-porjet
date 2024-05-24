package dsi22.project.produits.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {
	
	@GetMapping("/accessDenied")
	public String error()
	{
	return "accessDenied";
	}
	
	@GetMapping("/login")
	public String login()
	{
	return "login";
	}
	
	@GetMapping("/logout")
	public String logout(HttpServletRequest request) throws ServletException
	{
	request.logout();
	return "redirect:/login";
	}

}
