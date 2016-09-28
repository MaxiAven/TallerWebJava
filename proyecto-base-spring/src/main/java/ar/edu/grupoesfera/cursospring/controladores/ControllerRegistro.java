package ar.edu.grupoesfera.cursospring.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerRegistro {
	
	@RequestMapping("/registro")
	public ModelAndView registro(){
		return new ModelAndView("registro");
	}

}
