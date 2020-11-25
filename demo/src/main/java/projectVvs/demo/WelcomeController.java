package projectVvs.demo;

import javax.servlet.http.HttpServletRequest;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@Controller
public class WelcomeController {
	private CollectedData data = new CollectedData();


	@GetMapping("/")
	public String hello(HttpServletRequest request, Model model) {
		float weight = Float.parseFloat(request.getParameter("weight"));
		int age = Integer.parseInt(request.getParameter("age"));
		float height = Float.parseFloat(request.getParameter("height"));
		String gender = request.getParameter("gender");



		data.setAll(age,height,weight,gender);
		data.getKcal();

		BigDecimal p = new BigDecimal(data.getProtein());
		BigDecimal c = new BigDecimal(data.getCarb());
		BigDecimal f = new BigDecimal(data.getFat());

		float prot = p.floatValue();
		float carb = c.floatValue();
		float fat = f.floatValue();

		model.addAttribute("Kcal",data.Wkcal());
		model.addAttribute("prot",prot);
		model.addAttribute("carb",carb);
		model.addAttribute("fat",fat);

		return "/hello";
	}





}
