package space.bumtiger.fragmentEx;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
	@GetMapping("/home")
	public String showContent(Model model) {
		model.addAttribute("localDate", LocalDate.now());
		return "content";
	}

}
