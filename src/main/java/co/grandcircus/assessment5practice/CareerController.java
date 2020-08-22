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
	
	@PostMapping("/submit-details")
	public String submitYear(Model model,String name, Integer year) {
		model.addAttribute("name",name);
		model.addAttribute("year",year);
		return "submit-details";		
	}
	@RequestMapping("/sorry")
	public String displayMessage(Model model,@RequestParam("name")String name,@RequestParam("year")Integer year) {
		String msg="";
		if(year<=1943 || year>=2003){
			if(year<=1943) {
			msg="Sorry, your birth year is out of range ";
		}else{
			msg="Sorry, you're too young";
		}	
		model.addAttribute("msg",msg);
		} if(Character.isLowerCase(name.charAt(0))){
			model.addAttribute("msg2","name does not follow guidelines");
		}
		return "sorry";
	}
	@RequestMapping("/carrer-selection")
	public String carrerSelection() {
		return "carrer-selection";
	}
	@RequestMapping("/carrer")
	public String carrerChoice(Model model,@RequestParam("choice") String choice) {
		/*String res="";
		if(choice.equalsIgnoreCase("system")) {
			res=choice;			
		}else if(choice.equalsIgnoreCase("scrum master")) {
			res=choice;
		}else if(choice.equalsIgnoreCase("QA Analyst")) {
			res=choice;
		}else
		{
			res=choice;
		}*/
		model.addAttribute("choice",choice);
		return "carrer-display";
	}
	
	

}
