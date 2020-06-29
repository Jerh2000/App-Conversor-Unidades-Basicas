/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelo;

import javax.ejb.Stateless;

/**
 *
 * @author Jairo
 */
@Stateless
public class DatosValoracion {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    private String nombre;
    private String apellidos;
    private String telefono;
    private String email;
    private String valoracion[];
    private String sugerencia;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String[] getValoracion() {
        return valoracion;
    }

    public void setValoracion(String[] valoracion) {
        this.valoracion = valoracion;
    }

    public String getSugerencia() {
        return sugerencia;
    }

    public void setSugerencia(String sugerencia) {
        this.sugerencia = sugerencia;
    }
    
    
    
            
}
