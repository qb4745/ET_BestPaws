/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.RegistroAtencion;
import controlador.RegistroCliente;
import controlador.RegistroMascota;
import controlador.RegistroMedico;
import modelo.Atencion;
import modelo.Cliente;
import modelo.Gato;
import modelo.Mascota;
import modelo.Medico;
import modelo.Perro;

/**
 *
 * @author vina
 */
public class Main {
    public static void main(String[] args) {
        
        //creando Clientes
        Cliente cliente1 = new Cliente("13912058-2", "Jaime Vicencio Rubilar", "ovalle 1121", "Macul", 945081197, "jai@chile.cl", "P" );
        Cliente cliente2 = new Cliente("201234567-2", "Carlos Cortes Gonzales", "penuelas 2131", "quilpue", 123456789, "carlos@chile.cl", "E" );
        
        RegistroCliente rc = new RegistroCliente();
        rc.agregarCliente(cliente1);
        rc.agregarCliente(cliente2);
               
        //listar clientes
        rc.listarCliente();
        System.out.println("");
        System.out.println("");
        
        //creando Mascotas con herencia
        Gato mascota1 = new Gato(123, "Leito", cliente1, "07-12-2020", "Gato", "Moteado", "Blanco con Gris", 52);
        Perro mascota2 = new Perro(456, "Laky", cliente2, "09-07-2019", "Perro", "Quilerry", "Tamanno Mediano, color amarrillento");
        
        //agregando mascostas ArrayList
        RegistroMascota rm = new RegistroMascota();
        rm.agregarMascota(mascota1);
        rm.agregarMascota(mascota2);
        
        //listar mascotas
        rm.listarMascota();
        System.out.println("");
        
        //creando medicos
        
        Medico medico1 = new Medico("987654321-5", "Camilo Perez Pereira", "animales pequeños", "General caro 1254", "camilo@chile.cl");
        Medico medico2 = new Medico("852741963-0", "Maria Vergara Tapia", "cirugia animales", "Cobadonga 84", "mariavergara@chile.cl");
        Medico medico3 = new Medico("963258741-5", "Carla Zanetta Tapia", "cirugia animales", "valparaiso 87", "Carla@chile.cl");
        Medico medico4 = new Medico("963258741-5", "Isabell Gonzales Tapia", "cirugia animales", "las torres 4115", "isabell@chile.cl");
        
        //agregando medicos a ArrayList
        RegistroMedico rmedico = new RegistroMedico();
        rmedico.agregarMedico(medico1);
        rmedico.agregarMedico(medico2);
        
        //listar medicos
        rmedico.listarMedico();
        System.out.println("");
        System.out.println("");
        
        //creando atenciones
        Atencion atencion1 = new Atencion("11-12-2022", medico1, mascota1, "Desparacitacion", "Se da de alta sin inconvenientes", 20000);
        Atencion atencion2 = new Atencion("12-12-2022", medico2, mascota2, "Vacunas", "Se cita para el proximo viernes", 15000);
        Atencion atencion3 = new Atencion("13-12-2022", medico2, mascota1, "Castracion", "Se deja en obervaciones", 50000);
        
        
        //agregando atenciones a ArrayList
        RegistroAtencion rAtencion = new RegistroAtencion();
        rAtencion.agregarAtencion(atencion1);
        rAtencion.agregarAtencion(atencion2);
        rAtencion.agregarAtencion(atencion3);
        
        //listar atenciones
        rAtencion.listarAtencion();
        System.out.println("");
        System.out.println("");
        
        //INFORMES
        
        //atenciones por medico
        rAtencion.atencionesPorMedico();
        System.out.println("");
        
        //Cantidad de Especies por Mascotas
        rAtencion.obtenerCantidadPorEspecie();
        System.out.println("");
        
        //cantidad atenciones diarias
        rAtencion.cantAtencionesDiarias();
        System.out.println("");
        
        //cantidad atenciones mensuales
        rAtencion.cantAtencionesMensuales();
        System.out.println("");
        
        //cantidad valor recaudado diario
        rAtencion.valorRecaudadoDiario();
        System.out.println("");
        
        //cantidad valor recaudado mensual
        rAtencion.valorRecaudadoMensual();
        System.out.println("");
    }   
}
