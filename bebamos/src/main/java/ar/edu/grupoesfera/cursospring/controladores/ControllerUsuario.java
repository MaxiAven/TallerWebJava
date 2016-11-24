package ar.edu.grupoesfera.cursospring.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.Usuario;
import ar.edu.grupoesfera.cursospring.servicio.UsuarioService;

@Controller
public class ControllerUsuario {
	

	@Autowired
	private UsuarioService usuarioService;

	@RequestMapping(value="/listaUsuario", method = RequestMethod.GET)
	public ModelAndView usuario(){
		ModelAndView model = new ModelAndView("listaUsuario");
		List<Usuario> listaUsuarios = usuarioService.listarUsuario();
		model.addObject("listaUsuarios",listaUsuarios);
		return model;
	}
	
	
	@RequestMapping(value = "/eliminarUsuario")
	public ModelAndView eliminaReceta(Integer id) {
		usuarioService.deleteUsuario(id);
		ModelAndView model1 = new ModelAndView("listaUsuario");
		model1.addObject("listaUsuarios", usuarioService.listarUsuario());
		return model1;
	}
	

}
