
package com.dosideas.videojuegos.controller;

import com.dosideas.videojuegos.domain.Videojuego;
import com.dosideas.videojuegos.service.VideojuegoService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ListadoController {
 
    private final VideojuegoService videojuegoService;

    public ListadoController(VideojuegoService videojuegoService) {
        this.videojuegoService = videojuegoService;
             for (Videojuego game : videojuegoService.buscarDestacados()) {
            System.out.println(game.getNombre());
        }
    }
      
    //metodo que va atender las peticiones que vengan de la raíz  
     @RequestMapping("/")
     public String listarVideojuegos(Model model){
        //Invocar al service//alt + enter
        List<Videojuego> buscarDestacados = videojuegoService.buscarDestacados();
        model.addAttribute("videojuegos", buscarDestacados);
     
        return "listado";
    }
   
}
