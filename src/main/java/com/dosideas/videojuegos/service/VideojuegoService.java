
package com.dosideas.videojuegos.service;

import com.dosideas.videojuegos.domain.Videojuego;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class VideojuegoService {
    
    public List<Videojuego> buscarDestacados(){
        List<Videojuego> destacados = new ArrayList<>();
        
        Videojuego juego = new Videojuego();
        
        juego.setNombre("Bioshock");
        juego.setDescripcion("BioShock es una serie de videojuegos retrofuturísticos creada por Ken Levine, publicada por 2K Games y desarrollada por varios estudios, incluidos Irrational Games y 2K Marin.");
        juego.setImagenUrl("https://cdn02.nintendo-europe.com/media/images/10_share_images/games_15/nintendo_switch_4/H2x1_NSwitch_BioShockTheCollection_image1600w.jpg");
        destacados.add(juego);
        
        juego = new Videojuego();
        juego.setNombre("Insurgency: Sandstorm");
        juego.setDescripcion("Insurgency: Sandstorm es un videojuego de disparos en primera persona táctico multijugador desarrollado por New World Interactive y publicado por Focus Home Interactive.");
        juego.setImagenUrl("https://fanatical.imgix.net/product/original/a39877c6-124e-4970-8496-032495d6555f.jpeg?auto=compress,format&w=400&fit=max");
        destacados.add(juego);
        
        juego = new Videojuego();
        juego.setNombre("The Witness");
        juego.setDescripcion("The Witness es un videojuego 3D perteneciente al género de rompecabezas creado por Jonathan Blow, desarrollado y publicado por Thekla, Inc. The Witness fue lanzado para Microsoft Windows y PlayStation 4 el 26 de enero de 2016.");
        juego.setImagenUrl("https://image.api.playstation.com/vulcan/img/rnd/202010/0113/lPr8tG9zmhZ7KB2T0uZxtRu1.png");
        destacados.add(juego);
        
        juego = new Videojuego();
        juego.setNombre("Braid");
        juego.setDescripcion("Braid es un videojuego de plataformas y lógica creado por el desarrollador independiente Jonathan Blow para el servicio Xbox Live Arcade de Xbox 360. ");
        juego.setImagenUrl("https://media.gq.com/photos/5b69c0a55d4e9014fe47f7ee/master/pass/braid-video-game-10th-anniversary-gq-1.jpg");
        destacados.add(juego);
        
        return destacados;
        
    }
    
}
