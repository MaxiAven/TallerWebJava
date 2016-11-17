package ar.edu.grupoesfera.cursospring.controladores;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//import ar.edu.grupoesfera.cursospring.modelo.Login;
import ar.edu.grupoesfera.cursospring.modelo.Usuario;
import ar.edu.grupoesfera.cursospring.servicio.UsuarioService;

@Controller
public class ControllerRegistro {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@RequestMapping(value="/registro", method=RequestMethod.GET)
	public ModelAndView registro(){
		Usuario usuario = new Usuario();
		return new ModelAndView("registro", "nuevoUsuarioForm", usuario);
	}
	
	@RequestMapping(value="/agregarUsuario", method=RequestMethod.POST)
	public ModelAndView registroUsuario(@Valid @ModelAttribute("nuevoUsuarioForm") Usuario usuario, BindingResult bindingResult ){
		
		if (bindingResult.hasErrors()) {
			return new ModelAndView("registro", "nuevoUsuarioForm", usuario);
		}
		usuarioService.agregarUsuario(usuario);
		return new ModelAndView("index");
	}

}
