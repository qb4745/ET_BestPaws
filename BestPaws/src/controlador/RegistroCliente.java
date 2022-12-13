/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Cliente;

/**
 *
 * @author vina
 */
public class RegistroCliente {
    ArrayList<Cliente> cliente;
    
    public RegistroCliente(){
        cliente = new ArrayList<Cliente>();
    }
    
    public void agregarCliente(Cliente newCliente){
        if (this.verificarCliente(newCliente.getNombre()) == false) {
            cliente.add(newCliente);
        } else {
            System.out.println("Libro Ya existe");
        }
    
    }
    
    public boolean verificarCliente(String nombreCliente){
        boolean existe = false;
        for (Cliente cliente : cliente) {
            if(cliente.getNombre()== nombreCliente) {
                existe = true;
                break;
            }
         
        
            
        }
        return existe;
    }
    
    public void listarCliente(){
        for (Cliente cliente : cliente) {
            System.out.println(cliente.toString());
        }
    }
}
