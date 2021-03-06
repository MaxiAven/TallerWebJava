package ar.edu.grupoesfera.cursospring.controladores;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.Login;


@Controller
public class ControllerLogin {
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView login(){
		ModelMap model = new ModelMap();
		Login miLogin = new Login();
		model.addAttribute("login",miLogin);
		//model.addAttribute(login, miLogin)
		return new ModelAndView("login",model);
		
	}
	
	//metodo que carga en una lista lo cargado por el formulario
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView login(@ModelAttribute Login login){
		
		Login maxi = new Login();
		maxi.setNombre("maxi");
		maxi.setPassword("1234");
		
		
		ArrayList<Login> logueos = new ArrayList<Login>();
		logueos.add(maxi);
		
		for(Login usuario : logueos){
			if(usuario.getNombre().equals(login.getNombre()) && usuario.getPassword().equals(login.getPassword())){
			ModelAndView model = new ModelAndView("panel");
			return model;
			}	else{
				ModelAndView model = new ModelAndView("msjError");
				return model;
			}
			
		}
		return null;
			
	}
}
