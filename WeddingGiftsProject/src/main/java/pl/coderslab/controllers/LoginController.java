package pl.coderslab.controllers;

import javax.servlet.http.HttpSession;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import pl.coderslab.entities.User;
import pl.coderslab.repositories.UserRepository;

@Controller
public class LoginController {

	@Autowired
	UserRepository userRepository;

	@GetMapping("/login")
	public String login() {
		return "loginForm";
	}

	@PostMapping("/login")
	public String login(@RequestParam String userName, @RequestParam String password, HttpSession session, Model model) {

		User user = userRepository.findFirstByUserName(userName);
		if (user != null && BCrypt.checkpw(password, user.getPassword())) {
			session.setAttribute("loggedUser", user);
		} else {
			model.addAttribute("info", "Błędny login lub hasło");
			session.setAttribute("loggedUser", null);
			return "loginForm";
		}
		return "redirect:/";
	}

	@GetMapping("/logout")
	@ResponseBody
	public String logout(HttpSession session) {
		session.setAttribute("loggedUser", null);
		return "wylogowałeś się";
	}
}
