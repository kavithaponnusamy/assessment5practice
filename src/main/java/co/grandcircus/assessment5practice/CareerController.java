package co.grandcircus.assessment5practice;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CareerController {
	
	@RequestMapping("/")
	public String index() {
		return "year-selection";
	}
	
	/*@PostMapping("/submit-details")
	public String submitYear(Model model,String name, Integer year) {
		model.addAttribute("name",name);
		model.addAttribute("year",year);
		return "submit-details";		
	}*/
	@PostMapping("/sorry")
	public String displayMessage(Model model,@RequestParam("name")String name,@RequestParam("year")Integer year) {
		String msg="";
		boolean valid=true;
		if(year<=1943 || year>=2003){
			if(year<=1943) {
			msg="Sorry, your birth year is out of range ";
			valid=false;
		}else{
			msg="Sorry, you're too young";
			valid=false;
		}	
		model.addAttribute("msg",msg);
		} if(Character.isLowerCase(name.charAt(0))){
			model.addAttribute("msg2","Name does not follow guidelines");
			valid=false;
		}
		if (valid) {
			return "career-selection";
		}else {
			return "sorry";
		}
	}
	@PostMapping("/career-selection")
	public String careerSelection() {
		return "career-selection";
	}
	@RequestMapping("/career")
	public String careerChoice(Model model,@RequestParam("choice") String choice) {
		model.addAttribute("choice",choice);
		return "career-display";
	}
	
	

}
