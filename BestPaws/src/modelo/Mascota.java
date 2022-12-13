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
public abstract class Mascota implements controlador.Interface {
    
    private int codigoMicrochip;
    private String nombre;
    Cliente cliente;
    private String fechaNac;

    public Mascota() {
    }

    public Mascota(int codigoMicrochip, String nombre, Cliente cliente, String fechaNac) {
        this.codigoMicrochip = codigoMicrochip;
        this.nombre = nombre;
        this.cliente = cliente;
        this.fechaNac = fechaNac;
    }

    public int getCodigoMicrochip() {
        return codigoMicrochip;
    }

    public void setCodigoMicrochip(int codigoMicrochip) {
        this.codigoMicrochip = codigoMicrochip;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "Mascota{" + "codigoMicrochip=" + codigoMicrochip + ", nombre=" + nombre + ", cliente=" + cliente + ", fechaNac=" + fechaNac + '}';
    }

    @Override
    public String obtenerEspecie() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
