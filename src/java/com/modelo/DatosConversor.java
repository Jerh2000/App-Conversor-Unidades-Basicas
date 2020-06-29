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
public class DatosConversor {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    private String unidad;
    private String unidadInicial;
    private String unidadFinal;
    private String cantidadConvertir;
    private String resultado;

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getUnidadInicial() {
        return unidadInicial;
    }

    public void setUnidadInicial(String unidadInicial) {
        this.unidadInicial = unidadInicial;
    }

    public String getUnidadFinal() {
        return unidadFinal;
    }

    public void setUnidadFinal(String unidadFinal) {
        this.unidadFinal = unidadFinal;
    }

    public String getCantidadConvertir() {
        return cantidadConvertir;
    }

    public void setCantidadConvertir(String cantidadConvertir) {
        this.cantidadConvertir = cantidadConvertir;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    
    
}
