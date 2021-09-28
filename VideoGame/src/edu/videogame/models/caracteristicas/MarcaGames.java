package edu.videogame.models.caracteristicas;

import edu.videogame.models.TiendaViedoJuegos;

import java.util.List;

public class MarcaGames extends TiendaViedoJuegos {

    private List<String> marcas;
    private TablaCaracteristicasGames tablaCaracteristicasGames;
    private Boolean esConsola;

    @Override
    public void consultarExistencias() {
        if(this.esConsola){
            this.consultarExistenciasMarcasConsolas();
        } else {
            this.consultarExistenciasMarcaGames();
        }
        System.out.println("Se confirma existencia del video Juego ");
    }

    private void consultarExistenciasMarcaGames(){
        System.out.println("Vamos a la tienda de MarcaGames");
        System.out.println("Se busca video Juego por marca "+this.marca);
        System.out.println("Se busca video Juego por "+this.nombre);
    }
    private void consultarExistenciasMarcasConsolas(){
        System.out.println("Vamos a la tienda de MarcaGames");
        System.out.println("Se busca video Juego por marca "+this.marca);
        System.out.println("Se busca video Juego por "+this.nombre);
    }
}
