package ar.edu.grupoesfera.cursospring.controladores;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerIndex {
	
	@RequestMapping("/index")//url que atiende
	public ModelAndView Index(){
		return new ModelAndView("redirect:/");
	}
}
