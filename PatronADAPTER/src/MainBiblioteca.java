/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sofía
 */
public class MainBiblioteca {
    public static void main(String[] args) {
        
        ServicioEnLinea SLinea = new ServicioEnLinea();
        ServicioLocal SLocal = new ServicioLocal();
        BuscarLibro AdaptadorSLinea = new AdaptadorServicioEnLinea(SLinea);
        BuscarLibro AdaptadorSLocal = new AdaptadorServicioLocal(SLocal);
        
       testAdapter(AdaptadorSLinea);
       testAdapter(AdaptadorSLocal);
        
    }
    
    static void testAdapter(BuscarLibro Blibro){
        Blibro.Buscar("Libro");
    }
}
