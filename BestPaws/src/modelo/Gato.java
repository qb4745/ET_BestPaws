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
public class Gato extends Mascota{
    private String especie;
    private String raza;
    private String descripcion;
    private int altura;



    public Gato(int codigoMicrochip, String nombre, Cliente cliente, String fechaNac, String especie, String raza, String descripcion, int altura) {
        super(codigoMicrochip, nombre, cliente, fechaNac);
        this.especie = especie;
        this.raza = raza;
        this.descripcion = descripcion;
        this.altura = altura;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return super.toString() + " Gato{" + "especie=" + especie + ", raza=" + raza + ", descripcion=" + descripcion + ", altura=" + altura + '}';
    }
    
    
    //implementacion metodo de interface
    @Override
    public String obtenerEspecie() {
        return this.especie;
       
    }
    
    
    
}
