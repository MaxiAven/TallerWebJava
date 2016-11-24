package ar.edu.grupoesfera.cursospring.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.Ingrediente;
import ar.edu.grupoesfera.cursospring.modelo.Receta;
import ar.edu.grupoesfera.cursospring.servicio.RecetaService;

@Controller
public class ControllerReceta {

	@Autowired
	private RecetaService recetaService;

	@RequestMapping(value = "/cargarReceta", method = RequestMethod.GET)
	public ModelAndView receta() {
		Receta receta = new Receta();
		return new ModelAndView("cargarReceta", "nuevaReceta", receta);
	}

	@RequestMapping(value = "/agregarReceta", method = RequestMethod.POST)
	public ModelAndView registroReceta(@ModelAttribute Receta receta) {
		recetaService.agregarReceta(receta);
		List<Receta> ListaRecetas = recetaService.listarRecetas();
		return new ModelAndView("panel","ListaRecetas", ListaRecetas);
	}
	
	
	@RequestMapping(value = "/eliminarReceta")
	public ModelAndView eliminaReceta(Integer id) {
		recetaService.deleteReceta(id);
		ModelAndView model1 = new ModelAndView("panel");
		model1.addObject("ListaRecetas", recetaService.listarRecetas());
		return model1;
	}
	
	@RequestMapping(value = "/lista", method = RequestMethod.GET)
	public ModelAndView lista() {
		
		ModelAndView model = new ModelAndView("lista");
		model.addObject("recetas", recetaService.listarRecetas());
		return model;
		
	}
	
	@RequestMapping(value = "/editarReceta")
	public ModelAndView editarReceta(Integer id) {
		ModelAndView model1 = new ModelAndView("recetaEditar");
		model1.addObject("receta", recetaService.obtenerReceta(id));
		return model1;
	}
	
	@RequestMapping(value = "/actualizarReceta")
	public ModelAndView acutalizarReceta(Receta receta) {
		
		Integer id = receta.getIdReceta();
		String titulo = receta.getTitulo();
		String descripcion = receta.getDescripcion();
		
		recetaService.editarReceta(id, titulo, descripcion);
		
		ModelAndView model1 = new ModelAndView("panel");
		model1.addObject("ListaRecetas", recetaService.listarRecetas());
		return model1;
	}
	
	@RequestMapping(value = "/buscarReceta")
	public ModelAndView buscarReceta(@RequestParam("id") String nombre) {
		
		ModelAndView model = new ModelAndView("listaBusqueda");
		List<Receta> recetas = recetaService.recetasConBebidas(nombre);
		model.addObject("recetas",recetas);
		return model;
	    }
	
	@RequestMapping(value="/receta", method=RequestMethod.GET)
	public ModelAndView recetass(){
		Ingrediente ingrediente = new Ingrediente();
		return new ModelAndView("receta", "buscarIngrediente1", ingrediente);
	}
	
	@RequestMapping(value="/buscarIngrediente", method=RequestMethod.POST)
	public ModelAndView buscarIngrediente( @ModelAttribute("buscarIngrediente1") Ingrediente ingrediente){
		
		String ingrediente1 = ingrediente.getIngrediente();
		String ingrediente2 = ingrediente.getIngrediente2();
		
		ModelAndView model1 = new ModelAndView("receta");
		model1.addObject("recetasingrediente", recetaService.recetasConIngredientes(ingrediente1,ingrediente2));
		return model1;
		
	
	}
	
}
