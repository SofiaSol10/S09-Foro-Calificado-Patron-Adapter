/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sofía
 */
public class AdaptadorServicioEnLinea implements BuscarLibro {
    
    private ServicioEnLinea servicioEnLinea;

    public AdaptadorServicioEnLinea(ServicioEnLinea servicioEnLinea) {
        this.servicioEnLinea = servicioEnLinea;
    }

    @Override
    public void Buscar(String nombreLibro) {
        servicioEnLinea.BuscarEnLinea(nombreLibro);
    }
    

}
