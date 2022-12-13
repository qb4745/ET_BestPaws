/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Atencion;

/**
 *
 * @author vina
 */
public class RegistroAtencion {
    ArrayList<Atencion> atencion;
    
    public RegistroAtencion(){
        atencion = new ArrayList<Atencion>();
    }
    
    public void agregarAtencion(Atencion newAtencion){
        atencion.add(newAtencion);
        
    }      
               
    public void listarAtencion(){
        for (Atencion atencion : atencion) {
            System.out.println(atencion.toString());
        }
    }
    
    

    public void atencionesPorMedico(){
        int medico1 = 0;
        int medico2 = 0;
        int medico3 = 0;
        int medico4 = 0;
                
        for (Atencion atencion : atencion) {
            if (atencion.getMedico().getNombre().contains("Camilo")) {
                medico1++;
            } else if (atencion.getMedico().getNombre().contains("Maria")) {
                medico2++;
            } else if (atencion.getMedico().getNombre().contains("Carla")) {
                medico3++;
            } else if (atencion.getMedico().getNombre().contains("Isabell")) {
                medico4++;
            }
            
            
        }
        System.out.println("");
        System.out.println("Informe Atenciones por Medico");
        System.out.println("");
        System.out.println("Camilo Perez Pereira:   " + medico1);
        System.out.println("Maria Vergara Tapia:   " + medico2);
        System.out.println("Carla Zanetta Tapia:   " + medico3);
        System.out.println("Isabell Gonzales Tapia:   " + medico4);
        
    }
    
    public void obtenerCantidadPorEspecie(){
        int perro = 0;
        int gato = 0;
        for (Atencion atencion : atencion) {
            if (atencion.getMascota().obtenerEspecie().equals("Perro")) {
                perro++;                
            } else {
                gato++;
            }            
        }
        System.out.println("");        
        System.out.println("Informe Cantidad de mascotas por especie.");
        System.out.println("Cantidad de Mascota Especie 'Perro': " + perro);
        System.out.println("Cantidad de Mascota Especie 'Gato': " + gato);
    }
    
    public void cantAtencionesDiarias(){
        int dia11 = 0;
        int dia12 = 0;
        int dia13 = 0;
        for (Atencion atencion : atencion) {
            if (atencion.getFecha().equals("11-12-2022")) {
                dia11++;
            }  else if (atencion.getFecha().equals("12-12-2022")) {
                dia12++;
            }  else if (atencion.getFecha().equals("13-12-2022")) {
                dia13++;
            }
        }
        System.out.println("");        
        System.out.println("Informe Cantidad de atenciones diarias.");
        System.out.println("11-12-2022: " + dia11);
        System.out.println("12-12-2022: " + dia12);
        System.out.println("13-12-2022: " + dia13);
    }
    
    public void cantAtencionesMensuales(){
        int atencionesMensuales = 0;
        
        for (Atencion atencion : atencion) {
            atencionesMensuales++;
        }
        System.out.println("");        
        System.out.println("Informe Cantidad de atenciones Mensuales.");
        System.out.println("");
        System.out.println("Cantidad de atenciones Mensuales: " + atencionesMensuales);
    }
        
    public void valorRecaudadoDiario(){
        int dia11 = 0;        
        int dia12 = 0;
        int dia13 = 0;
        for (Atencion atencion : atencion) {
            if (atencion.getFecha().equals("11-12-2022")) {
                dia11 = dia11 + atencion.getValor();
            }  else if (atencion.getFecha().equals("12-12-2022")) {
                dia12 = dia12 + atencion.getValor();
            }  else if (atencion.getFecha().equals("13-12-2022")) {
                dia13 = dia13 + atencion.getValor();
            }
        }
        System.out.println("");        
        System.out.println("Informe Valor Recaudado diario.");
        System.out.println("11-12-2022 se recaudo: $" + dia11);
        System.out.println("12-12-2022 se recaudo: $" + dia12);
        System.out.println("13-12-2022 se recaudo: $" + dia13);
    }
    
        public void valorRecaudadoMensual(){
        int recaudadoMensual = 0;        

        for (Atencion atencion : atencion) {
            recaudadoMensual = recaudadoMensual + atencion.getValor();
        }
        System.out.println("");        
        System.out.println("Informe Valor Recaudado Mensual.");
        System.out.println("En el mes de diciembre se han recausado: $" + recaudadoMensual);

    }
        
        
}
    
    

