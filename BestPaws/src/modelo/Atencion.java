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
public class Atencion {
    private String fecha;
    Medico medico;
    Mascota mascota;
    private String procedimientoRealizado;
    private String observaciones;
    private int valor;

    public Atencion() {
    }

    public Atencion(String fecha, Medico medico, Mascota mascota, String procedimientoRealizado, String observaciones, int valor) {
        this.fecha = fecha;
        this.medico = medico;
        this.mascota = mascota;
        this.procedimientoRealizado = procedimientoRealizado;
        this.observaciones = observaciones;
        this.valor = valor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public String getProcedimientoRealizado() {
        return procedimientoRealizado;
    }

    public void setProcedimientoRealizado(String procedimientoRealizado) {
        this.procedimientoRealizado = procedimientoRealizado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Atencion{" + "fecha=" + fecha + ", medico=" + medico + ", mascota=" + mascota + ", procedimientoRealizado=" + procedimientoRealizado + ", observaciones=" + observaciones + ", valor=" + valor + '}';
    }
    
    
    
    
    
}
