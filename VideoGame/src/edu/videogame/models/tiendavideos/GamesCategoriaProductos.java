package edu.videogame.models.tiendavideos;

import edu.videogame.models.TiendaViedoJuegos;
import edu.videogame.models.videos.MarcasJuegos;

import java.util.ArrayList;

public class GamesCategoriaProductos implements Games {
    private ArrayList<MarcasJuegos> articulos;

    public GamesCategoriaProductos(ArrayList<MarcasJuegos> articulos) {
        this.articulos = articulos;
    }

    @Override
    public Integer consultarUnidadesArticulo(TiendaViedoJuegos tiendaViedoJuegos) {
        Integer resultado = 0;
        for(TiendaViedoJuegos tiendaViedoJuegosActual : this.articulos){
            if(tiendaViedoJuegosActual.equals(tiendaViedoJuegos)){
                resultado++;
            }
        }
        return resultado;
    }
}
