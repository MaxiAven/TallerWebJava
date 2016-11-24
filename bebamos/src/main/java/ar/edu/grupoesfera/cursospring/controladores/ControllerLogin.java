package ar.edu.grupoesfera.cursospring.controladores;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.Login;
import ar.edu.grupoesfera.cursospring.modelo.Usuario;
import ar.edu.grupoesfera.cursospring.servicio.RecetaService;


@Controller
public class ControllerLogin {

	@Autowired
	private RecetaService recetaService;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView login(){
		ModelMap model = new ModelMap();
		Login miLogin = new Login();
		model.addAttribute("login",miLogin);
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
			model.addObject("ListaRecetas", recetaService.listarRecetas());
			return model;
			}	else{
				ModelAndView model = new ModelAndView("msjError");
				return model;
			}
			
		}
		return null;
			
	}
	
	
}
