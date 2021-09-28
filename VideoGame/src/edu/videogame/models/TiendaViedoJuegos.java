package edu.videogame.models;

import edu.videogame.models.tiendavideos.Games;

import java.util.Objects;

public class TiendaViedoJuegos implements ServiciosTienda {

    protected String codigoBarras;
    protected String nombre;
    protected String descripcion;
    protected String referencia;
    protected String marca;
    protected Double precio;
    protected String tipo;
    protected Games games;

    public TiendaViedoJuegos() {
    }

    public TiendaViedoJuegos(String nombre, String descripcion, String referencia,
                             String marca, Double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.referencia = referencia;
        this.marca = marca;
        this.precio = precio;
    }

    @Override
    public void listarVideoGames() {


    }

    @Override
    public void consultarExistencias() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TiendaViedoJuegos tiendaViedoJuegos = (TiendaViedoJuegos) o;
        return nombre.equals(tiendaViedoJuegos.nombre) &&
                descripcion.equals(tiendaViedoJuegos.descripcion) &&
                referencia.equals(tiendaViedoJuegos.referencia) &&
                marca.equals(tiendaViedoJuegos.marca) &&
                precio <= tiendaViedoJuegos.precio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, descripcion, referencia, marca, precio);
    }
}
