package edu.videogame.models.videos;

import edu.videogame.models.TiendaViedoJuegos;

import java.util.List;

public class MarcasJuegos extends TiendaViedoJuegos {

    private String accesorios;
    private Double capacidad;
    private String coleccion;
    private String consolas;
    private Boolean retro;
    private List<CategoriaProducto> categoriaGames;

    @Override
    public void consultarExistencias() {
        System.out.println("Vamos a la bodega de video  juaegos");
        System.out.println("Se busca el estante de la marca "+this.marca);
        System.out.println("Se busca el gabinete de los "+this.nombre);

        TiendaViedoJuegos tiendaViedoJuegosBusqueda = new TiendaViedoJuegos(this.nombre, this.descripcion,
                this.referencia, this.marca, this.precio);

        Integer unidades = this.games.consultarUnidadesArticulo(tiendaViedoJuegosBusqueda);

        if(unidades > 0 ){
            System.out.println("Hay " + unidades + "unidades de dicho articulo");
        }
        System.out.println("No hay unidades de dicho articulo");
    }
}
