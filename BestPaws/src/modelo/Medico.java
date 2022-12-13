/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author vina
 */
public class Medico {
    
    private String rut;
    private String nombre;
    private String especialidaD;
    private String direccion;
    private String correoElectronico;

    public Medico() {
    }

    public Medico(String rut, String nombre, String especialidaD, String direccion, String correoElectronico) {
        this.rut = rut;
        this.nombre = nombre;
        this.especialidaD = especialidaD;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidaD() {
        return especialidaD;
    }

    public void setEspecialidaD(String especialidaD) {
        this.especialidaD = especialidaD;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return "Medico{" + "rut=" + rut + ", nombre=" + nombre + ", especialidaD=" + especialidaD + ", direccion=" + direccion + ", correoElectronico=" + correoElectronico + '}';
    }
    
    


    
}
