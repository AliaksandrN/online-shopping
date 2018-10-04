package ne.anovik.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	// @GetMapping(value = {"/", "/home", "/index"})
	// public ModelAndView index(){
	// ModelAndView mv = new ModelAndView("page");
	// mv.addObject("greeting", "Hello to Web Mvc");
	// return mv;
	// }

	@GetMapping(value = { "/", "/home", "/index" })
	public String page(Model model) {
		model.addAttribute("title", "Home");
		model.addAttribute("userClickHome", true);
		return "page";
	}

	@GetMapping(value = { "/about" })
	public String about(Model model) {
		model.addAttribute("title", "About us");
		model.addAttribute("userClickAbout", true);
		return "page";
	}

	@GetMapping(value = { "/contact" })
	public String contact(Model model) {
		model.addAttribute("title", "Contact Us");
		model.addAttribute("userClickContact", true);
		return "page";
	}

}
