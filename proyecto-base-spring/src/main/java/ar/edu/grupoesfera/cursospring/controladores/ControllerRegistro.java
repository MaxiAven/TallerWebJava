package ar.edu.grupoesfera.cursospring.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//import ar.edu.grupoesfera.cursospring.modelo.Login;
import ar.edu.grupoesfera.cursospring.modelo.Usuario;

@Controller
public class ControllerRegistro {
	
	@RequestMapping(value="/registro", method=RequestMethod.GET)
	public ModelAndView registro(){
		ModelMap model = new ModelMap();
		Usuario usuario = new Usuario();
		model.addAttribute("usuario",usuario);
		return new ModelAndView("registro",model);
		
	}
	
	@RequestMapping(path="/registro", method=RequestMethod.POST)
	public ModelAndView registroUsuario(@ModelAttribute Usuario usuario){
		
		ModelMap registroUsuario = new ModelMap();
		registroUsuario.put("nombre", usuario.getNombre());
		registroUsuario.put("apellido", usuario.getApellido());
		registroUsuario.put("fecha", usuario.getFecha());
		registroUsuario.put("password", usuario.getPassword());
		registroUsuario.put("nombreUsuario", usuario.getNombreUsuario());
		return new ModelAndView("confirmaRegistro",registroUsuario);
	}

}
