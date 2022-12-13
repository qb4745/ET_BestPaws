/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Medico;

/**
 *
 * @author vina
 */
public class RegistroMedico {
    ArrayList<Medico> medico;
    
    public RegistroMedico(){
        medico = new ArrayList<Medico>();
    }
    
    public void agregarMedico(Medico newMedico){
        if (this.verificarMedico(newMedico.getNombre()) == false) {
            medico.add(newMedico);
        } else {
            System.out.println("Medico Ya existe");
        }
    
    }
    
    public boolean verificarMedico(String nombreMedico){
        boolean existe = false;
        for (Medico medico : medico) {
            if(medico.getNombre()== nombreMedico) {
                existe = true;
                break;
            }
         
        
            
        }
        return existe;
    }
    
    public void listarMedico(){
        for (Medico medico : medico) {
            System.out.println(medico.toString());
        }
    }
}
