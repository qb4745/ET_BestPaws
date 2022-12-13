/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Mascota;

/**
 *
 * @author vina
 */
public class RegistroMascota {
    ArrayList<Mascota> mascota;
    
    public RegistroMascota(){
        mascota = new ArrayList<Mascota>();
    }
    
    public void agregarMascota(Mascota newMascota){
        if (this.verificarMascota(newMascota.getNombre()) == false) {
            mascota.add(newMascota);
        } else {
            System.out.println("Mascota Ya existe");
        }
    
    }
    
    public boolean verificarMascota(String nombreMascota){
        boolean existe = false;
        for (Mascota mascota : mascota) {
            if(mascota.getNombre()== nombreMascota) {
                existe = true;
                break;
            }
         
        
            
        }
        return existe;
    }
    
    public void listarMascota(){
        for (Mascota mascota : mascota) {
            System.out.println(mascota.toString());
        }
    }
    
}
