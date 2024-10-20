/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sofía
 */
public class AdaptadorServicioLocal implements BuscarLibro {
    private ServicioLocal servicioLocal;

    public AdaptadorServicioLocal(ServicioLocal servicioLocal) {
        this.servicioLocal = servicioLocal;
    }

    @Override
    public void Buscar(String nombreLibro) {
        servicioLocal.BuscarEnBaseDeDatos(nombreLibro);
    }

    
    
}
