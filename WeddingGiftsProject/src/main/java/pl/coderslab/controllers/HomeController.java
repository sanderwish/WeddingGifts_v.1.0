package pl.coderslab.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pl.coderslab.entities.User;

@Controller
public class HomeController {

	@GetMapping("")
	public String home(Model model, HttpSession session ) {
		if(session.getAttribute("loggedUser") != null) {
			User user = (User)session.getAttribute("loggedUser");
			model.addAttribute("info", "Jesteś zalogowany jako:" + user.getUserName());
		}
		return "index";
	}
}