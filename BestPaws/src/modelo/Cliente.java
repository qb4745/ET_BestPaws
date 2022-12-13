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
public class Cliente {
    
    private String rut;
    private String nombre;
    private String direccion;
    private String comuna;
    private int telefono;
    private String correoElectronico;
    private String tipoCliente;

    public Cliente() {
    }

    public Cliente(String rut, String nombre, String direccion, String comuna, int telefono, String correoElectronico, String tipoCliente) {
        this.rut = rut;
        this.nombre = nombre;
        this.direccion = direccion;
        this.comuna = comuna;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.tipoCliente = tipoCliente;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "rut=" + rut + ", nombre=" + nombre + ", direccion=" + direccion + ", comuna=" + comuna + ", telefono=" + telefono + ", correoElectronico=" + correoElectronico + ", tipoCliente=" + tipoCliente + '}';
    }

    
            
    
}
