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
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView login(@ModelAttribute Login login){
		ModelMap usuario = new ModelMap();
		
		ArrayList<Login> lista = new ArrayList<Login>();
		lista.add(login);
		System.out.println(lista);
		Iterator<Login> iterator = lista.iterator();
		while(iterator.hasNext()){
			Login valor = iterator.next();
			usuario.put("nombre",valor.getNombre());
			usuario.put("apellido", valor.getApellido());
		}
		return new ModelAndView("login",usuario);
		
	}
}
