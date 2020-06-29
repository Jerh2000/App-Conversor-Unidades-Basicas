/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.modelo.DatosConversor;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jairo
 */
@WebServlet(name = "ServletConversor", urlPatterns = {"/ServletConversor"})
public class ServletConversor extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            DatosConversor dc = new DatosConversor();
            dc.setUnidad(request.getParameter("unidad"));
            dc.setCantidadConvertir(request.getParameter("cantidadConvertir"));
            dc.setUnidadInicial(request.getParameter("unidadInicial"));
            dc.setUnidadFinal(request.getParameter("unidadFinal"));

            if (dc.getUnidad().equals("Moneda")) {
                Moneda(dc);

            } else if (dc.getUnidad().equals("Longitud")) {

                Longitud(dc);

            } else if (dc.getUnidad().equals("Volumen")) {

                Volumen(dc);

            } else if (dc.getUnidad().equals("Masa")) {

                Masa(dc);

            } else if (dc.getUnidad().equals("Área")) {

                Area(dc);

            } else if (dc.getUnidad().equals("Velocidad")) {

                Velocidad(dc);

            }
            request.setAttribute("DatosConversor", dc);
            request.getRequestDispatcher("resultado.jsp").forward(request, response);
           

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void Moneda(DatosConversor dc) {
        if (dc.getUnidadInicial().equals("Libra(GBP)") && dc.getUnidadInicial().equals("Libra(GBP)")) {
            dc.setResultado(dc.getCantidadConvertir());
        }
        if (dc.getUnidadInicial().equals("Libra(GBP)") && dc.getUnidadFinal().equals("Euro(EUR)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = Math.round(can * 1.11);
            String cantif = canf + "";
            dc.setResultado(cantif);
        }
        if (dc.getUnidadInicial().equals("Libra(GBP)") && dc.getUnidadFinal().equals("Dolar USA(USD)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = Math.round(can * 1.23);
            String cantif = canf + "";
            dc.setResultado(cantif);
        }
        if (dc.getUnidadInicial().equals("Libra(GBP)") && dc.getUnidadFinal().equals("Peso colombiano(COP)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = Math.round(can * 4600.42);
            String cantif = canf + "";
            dc.setResultado(cantif);
        }
        ////////////////////////////////EURO/////////////////////////////////////////////////////////
        if (dc.getUnidadInicial().equals("Euro(EUR)") && dc.getUnidadInicial().equals("Euro(EUR)")) {
            dc.setResultado(dc.getCantidadConvertir());
        }
        if (dc.getUnidadInicial().equals("Euro(EUR)") && dc.getUnidadFinal().equals("Libra(GBP)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = Math.round(can * 0.90);
            String cantif = canf + "";
            dc.setResultado(cantif);
        }
        if (dc.getUnidadInicial().equals("Euro(EUR)") && dc.getUnidadFinal().equals("Dolar USA(USD)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = Math.round(can * 1.11);
            String cantif = canf + "";
            dc.setResultado(cantif);
        }
        if (dc.getUnidadInicial().equals("Euro(EUR)") && dc.getUnidadFinal().equals("Peso colombiano(COP)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = Math.round(can * 4139.22);
            String cantif = canf + "";
            dc.setResultado(cantif);
        }
        /////////////////////////////////DOLAR//////////////////////////////////////////////////////////
        if (dc.getUnidadInicial().equals("Dolar USA(USD)") && dc.getUnidadInicial().equals("Dolar USA(USD)")) {
            dc.setResultado(dc.getCantidadConvertir());
        }
        if (dc.getUnidadInicial().equals("Dolar USA(USD)") && dc.getUnidadFinal().equals("Libra(GBP)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = Math.round(can * 0.81);
            String cantif = canf + "";
            dc.setResultado(cantif);
        }
        if (dc.getUnidadInicial().equals("Dolar USA(USD)") && dc.getUnidadFinal().equals("Euro(EUR)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = Math.round(can * 0.90);
            String cantif = canf + "";
            dc.setResultado(cantif);
        }
        if (dc.getUnidadInicial().equals("Dolar USA(USD)") && dc.getUnidadFinal().equals("Peso colombiano(COP)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            long canf = Math.round(can * 3727);
            String cantif = canf + "";
            dc.setResultado(cantif);
        }
        //////////////////////////////////////////PESO////////////////////////////////////////////////
        if (dc.getUnidadInicial().equals("Peso colombiano(COP)") && dc.getUnidadInicial().equals("Peso colombiano(COP)")) {
            dc.setResultado(dc.getCantidadConvertir());
        }
        if (dc.getUnidadInicial().equals("Peso colombiano(COP)") && dc.getUnidadFinal().equals("Libra(GBP)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = Math.round(can * 0.000221);
            String cantif = canf + "";
            dc.setResultado(cantif);
        }
        if (dc.getUnidadInicial().equals("Peso colombiano(COP)") && dc.getUnidadFinal().equals("Euro(EUR)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = Math.round(can * 0.00024);
            String cantif = canf + "";
            dc.setResultado(cantif);
        }
        if (dc.getUnidadInicial().equals("Peso colombiano(COP)") && dc.getUnidadFinal().equals("Dolar USA(USD)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = Math.round(can * 0.00027);
            String cantif = canf + "";
            dc.setResultado(cantif);
        }
    }

    private void Longitud(DatosConversor dc) {
        if (dc.getUnidadInicial().equals("Kilometro(Km)") && dc.getUnidadInicial().equals("Kilometro(Km)")) {
            dc.setResultado(dc.getCantidadConvertir());
        }
        if (dc.getUnidadInicial().equals("Kilometro(Km)") && dc.getUnidadFinal().equals("Metro(m)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = Math.round(can * 1000);
            String cantif = canf + "";
            dc.setResultado(cantif);
        }
        if (dc.getUnidadInicial().equals("Kilometro(Km)") && dc.getUnidadFinal().equals("Centimetro(cm)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = Math.round(can * 100000);
            String cantif = canf + "";
            dc.setResultado(cantif);
        }
        if (dc.getUnidadInicial().equals("Kilometro(Km)") && dc.getUnidadFinal().equals("Milimetro(mm)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = Math.round(can * 1000000);
            String cantif = canf + "";
            dc.setResultado(cantif);
        }
        /////////////////////////////////////Metro//////////////////////////////////////////////////////////////////////
        if (dc.getUnidadInicial().equals("Metro(m)") && dc.getUnidadInicial().equals("Metro(m)")) {
            dc.setResultado(dc.getCantidadConvertir());
        }
        if (dc.getUnidadInicial().equals("Metro(m)") && dc.getUnidadFinal().equals("Kilometro(Km)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = Math.round(can * 0.001);
            String cantif = canf + "";
            dc.setResultado(cantif);
        }
        if (dc.getUnidadInicial().equals("Metro(m)") && dc.getUnidadFinal().equals("Centimetro(cm)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = Math.round(can * 100);
            String cantif = canf + "";
            dc.setResultado(cantif);
        }
        if (dc.getUnidadInicial().equals("Metro(m)") && dc.getUnidadFinal().equals("Milimetro(mm)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = Math.round(can * 1000);
            String cantif = canf + "";
            dc.setResultado(cantif);
        }
        /////////////////////////////////////Centimetro//////////////////////////////////////////////////////////////////////
        if (dc.getUnidadInicial().equals("Centimetro(cm)") && dc.getUnidadInicial().equals("Centimetro(cm)")) {
            dc.setResultado(dc.getCantidadConvertir());
        }
        if (dc.getUnidadInicial().equals("Centimetro(cm)") && dc.getUnidadFinal().equals("Kilometro(Km)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = Math.round(can * 0.00001);
            String cantif = canf + "";
            dc.setResultado(cantif);
        }
        if (dc.getUnidadInicial().equals("Centimetro(cm)") && dc.getUnidadFinal().equals("Metro(m)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = Math.round(can * 0.001);
            String cantif = canf + "";
            dc.setResultado(cantif);
        }
        if (dc.getUnidadInicial().equals("Centimetro(cm)") && dc.getUnidadFinal().equals("Milimetro(mm)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = Math.round(can * 10);
            String cantif = canf + "";
            dc.setResultado(cantif);
        }
        /////////////////////////////////////Milimetro//////////////////////////////////////////////////////////////////////
        if (dc.getUnidadInicial().equals("Milimetro(mm)") && dc.getUnidadInicial().equals("Milimetro(mm)")) {
            dc.setResultado(dc.getCantidadConvertir());
        }
        if (dc.getUnidadInicial().equals("Milimetro(mm)") && dc.getUnidadFinal().equals("Kilometro(Km)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = Math.round(can * 0.000001);
            String cantif = canf + "";
            dc.setResultado(cantif);
        }
        if (dc.getUnidadInicial().equals("Milimetro(mm)") && dc.getUnidadFinal().equals("Metro(m)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = Math.round(can * 0.001);
            String cantif = canf + "";
            dc.setResultado(cantif);
        }
        if (dc.getUnidadInicial().equals("Milimetro(mm)") && dc.getUnidadFinal().equals("Centimetro(cm)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = Math.round(can * 0.1);
            String cantif = canf + "";
            dc.setResultado(cantif);
        }
    }

    private void Volumen(DatosConversor dc) {
        if (dc.getUnidadInicial().equals("Galon(gal)") && dc.getUnidadInicial().equals("Galon(gal)")) {
            dc.setResultado(dc.getCantidadConvertir());
        }
        if (dc.getUnidadInicial().equals("Galon(gal)") && dc.getUnidadFinal().equals("Litro(l)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = Math.round(can * 3.78541);
            String cantif = canf + "";
            dc.setResultado(cantif);
        }
        if (dc.getUnidadInicial().equals("Galon(gal)") && dc.getUnidadFinal().equals("Mililitro(ml)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = Math.round(can * 3785.41);
            String cantif = canf + "";
            dc.setResultado(cantif);
        }
        /////////////////////////////////////////////////////////////////////////////////////////////////////////
        if (dc.getUnidadInicial().equals("Litro(l)") && dc.getUnidadInicial().equals("Litro(l)")) {
            dc.setResultado(dc.getCantidadConvertir());
        }
        if (dc.getUnidadInicial().equals("Litro(l)") && dc.getUnidadFinal().equals("Galon(gal)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = Math.round(can * 0.264172);
            String cantif = canf + "";
            dc.setResultado(cantif);
        }
        if (dc.getUnidadInicial().equals("Litro(l)") && dc.getUnidadFinal().equals("Mililitro(ml)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = Math.round(can * 1000);
            String cantif = canf + "";
            dc.setResultado(cantif);
        }
    }

    private void Masa(DatosConversor dc) {
        if (dc.getUnidadInicial().equals("Kilogramo(Kg)") && dc.getUnidadInicial().equals("Kilogramo(Kg)")) {
            dc.setResultado(dc.getCantidadConvertir() + "Kg");
        }
        if (dc.getUnidadInicial().equals("Kilogramo(Kg)") && dc.getUnidadFinal().equals("Gramo(g)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = can * 1000;
            String cantif = canf + "g";
            dc.setResultado(cantif);
        }
        if (dc.getUnidadInicial().equals("Kilogramo(Kg)") && dc.getUnidadFinal().equals("Miligramo(mg)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = can * 1000000;
            String cantif = canf + "mg";
            dc.setResultado(cantif);
        }
        if (dc.getUnidadInicial().equals("Kilogramo(Kg)") && dc.getUnidadFinal().equals("Tonelada(t)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = can * 0.001;
            String cantif = canf + "t";
            dc.setResultado(cantif);
        }
        /////////////////////////////////////////Gramo////////////////////////////////////////////////////////////////////
        if (dc.getUnidadInicial().equals("Gramo(g)") && dc.getUnidadInicial().equals("Gramo(g)")) {
            dc.setResultado(dc.getCantidadConvertir() + "g");
        }
        if (dc.getUnidadInicial().equals("Gramo(g)") && dc.getUnidadFinal().equals("Kilogramo(Kg)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = can * 0.001;
            String cantif = canf + "Kg";
            dc.setResultado(cantif);
        }
        if (dc.getUnidadInicial().equals("Gramo(g)") && dc.getUnidadFinal().equals("Miligramo(mg)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = can * 1000;
            String cantif = canf + "mg";
            dc.setResultado(cantif);
        }
        if (dc.getUnidadInicial().equals("Gramo(g)") && dc.getUnidadFinal().equals("Tonelada(t)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = can * 0.000001;
            String cantif = canf + "t";
            dc.setResultado(cantif);
        }
        /////////////////////////////////////////Miligramo////////////////////////////////////////////////////////////////////
        if (dc.getUnidadInicial().equals("Miligramo(mg)") && dc.getUnidadInicial().equals("Miligramo(mg)")) {
            dc.setResultado(dc.getCantidadConvertir() + "mg");
        }
        if (dc.getUnidadInicial().equals("Miligramo(mg)") && dc.getUnidadFinal().equals("Kilogramo(Kg)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = can * 0.000001;
            String cantif = canf + "Kg";
            dc.setResultado(cantif);
        }
        if (dc.getUnidadInicial().equals("Miligramo(mg)") && dc.getUnidadFinal().equals("Gramo(g)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = can * 0.001;
            String cantif = canf + "g";
            dc.setResultado(cantif);
        }
        if (dc.getUnidadInicial().equals("Miligramo(mg)") && dc.getUnidadFinal().equals("Tonelada(t)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = can * 0.000000001;
            String cantif = canf + "t";
            dc.setResultado(cantif);
        }
    }

    private void Area(DatosConversor dc) {
        if (dc.getUnidadInicial().equals("Kilometro cuadrado(Km²)") && dc.getUnidadInicial().equals("Kilometro cuadrado(Km²)")) {
            dc.setResultado(dc.getCantidadConvertir() + "Km²");
        }
        if (dc.getUnidadInicial().equals("Kilometro cuadrado(Km²)") && dc.getUnidadFinal().equals("Hectaria(ha)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = can * 100;
            String cantif = canf + "ha";
            dc.setResultado(cantif);
        }
        if (dc.getUnidadInicial().equals("Kilometro cuadrado(Km²)") && dc.getUnidadFinal().equals("Metro cuadrado(m²)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = can * 1000000;
            String cantif = canf + "m²";
            dc.setResultado(cantif);
        }
        
        /////////////////////////////////////////Hectaria////////////////////////////////////////////////////////////////////
        if (dc.getUnidadInicial().equals("Hectaria(ha)") && dc.getUnidadInicial().equals("Hectaria(ha)")) {
            dc.setResultado(dc.getCantidadConvertir() + "g");
        }
        if (dc.getUnidadInicial().equals("Hectaria(ha)") && dc.getUnidadFinal().equals("Kilometro cuadrado(Km²)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = can * 0.01;
            String cantif = canf + "Km²";
            dc.setResultado(cantif);
        }
        if (dc.getUnidadInicial().equals("Hectaria(ha)") && dc.getUnidadFinal().equals("Metro cuadrado(m²)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = can * 10000;
            String cantif = canf + "m²";
            dc.setResultado(cantif);
        }
        /////////////////////////////////////////Metro cuadrado////////////////////////////////////////////////////////////////////
        if (dc.getUnidadInicial().equals("Metro cuadrado(m²)") && dc.getUnidadInicial().equals("Metro cuadrado(m²)")) {
            dc.setResultado(dc.getCantidadConvertir() + "m²");
        }
        if (dc.getUnidadInicial().equals("Metro cuadrado(m²)") && dc.getUnidadFinal().equals("Kilometro cuadrado(Km²)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = can * 0.000001;
            String cantif = canf + "Km²";
            dc.setResultado(cantif);
        }
        if (dc.getUnidadInicial().equals("Metro cuadrado(m²)") && dc.getUnidadFinal().equals("Hectaria(ha)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = can * 0.0001;
            String cantif = canf + "ha";
            dc.setResultado(cantif);
        }
    }
    
    private void Velocidad(DatosConversor dc){
        if (dc.getUnidadInicial().equals("Kilometros por hora(Km/h)") && dc.getUnidadInicial().equals("Kilometros por hora(Km/h)")) {
            dc.setResultado(dc.getCantidadConvertir() + "Km/h");
        }
        if (dc.getUnidadInicial().equals("Kilometros por hora(Km/h)") && dc.getUnidadFinal().equals("Metros por segundo(m/s)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = can / 3.6;
            String cantif = canf + "m/s";
            dc.setResultado(cantif);
        }
        if (dc.getUnidadInicial().equals("Kilometros por hora(Km/h)") && dc.getUnidadFinal().equals("Kilometros por segundo(Km/s)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = can / 3600;
            String cantif = canf + "Km/s";
            dc.setResultado(cantif);
        }
        if (dc.getUnidadInicial().equals("Kilometros por hora(Km/h)") && dc.getUnidadFinal().equals("Metros por minuto(m/min)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = can * 16.6667;
            String cantif = canf + "m/min";
            dc.setResultado(cantif);
        }
        ////////////////////////////////////////////////////////m/s///////////////////////////////////////////////////////////////////
        if (dc.getUnidadInicial().equals("Metros por segundo(m/s)") && dc.getUnidadInicial().equals("Metros por segundo(m/s)")) {
            dc.setResultado(dc.getCantidadConvertir() + "m/s");
        }
        if (dc.getUnidadInicial().equals("Metros por segundo(m/s)") && dc.getUnidadFinal().equals("Kilometros por hora(Km/h)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = can * 3.6;
            String cantif = canf + "Km/h";
            dc.setResultado(cantif);
        }
        if (dc.getUnidadInicial().equals("Metros por segundo(m/s)") && dc.getUnidadFinal().equals("Kilometros por segundo(Km/s)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = can * 0.001;
            String cantif = canf + "Km/s";
            dc.setResultado(cantif);
        }
        if (dc.getUnidadInicial().equals("Metros por segundo(m/s)") && dc.getUnidadFinal().equals("Metros por minuto(m/min)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = can * 60;
            String cantif = canf + "m/min";
            dc.setResultado(cantif);
        }
        ///////////////////////////////////////////////////////////7Km/s////////////////////////////////////////////////////
        if (dc.getUnidadInicial().equals("Kilometros por segundo(Km/s)") && dc.getUnidadInicial().equals("Kilometros por segundo(Km/s)")) {
            dc.setResultado(dc.getCantidadConvertir() + "Km/s");
        }
        if (dc.getUnidadInicial().equals("Kilometros por segundo(Km/s)") && dc.getUnidadFinal().equals("Metros por segundo(m/s)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = can * 1000;
            String cantif = canf + "m/s";
            dc.setResultado(cantif);
        }
        if (dc.getUnidadInicial().equals("Kilometros por segundo(Km/s)") && dc.getUnidadFinal().equals("Kilometros por hora(Km/h)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = can * 3600;
            String cantif = canf + "Km/h";
            dc.setResultado(cantif);
        }
        if (dc.getUnidadInicial().equals("Kilometros por segundo(Km/s)") && dc.getUnidadFinal().equals("Metros por minuto(m/min)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = can * 60000;
            String cantif = canf + "m/min";
            dc.setResultado(cantif);
        }
        ///////////////////////////////////////////////////////////m/min////////////////////////////////////////////////////
        if (dc.getUnidadInicial().equals("Metros por minuto(m/min)") && dc.getUnidadInicial().equals("Metros por minuto(m/min)")) {
            dc.setResultado(dc.getCantidadConvertir() + "m/min");
        }
        if (dc.getUnidadInicial().equals("Metros por minuto(m/min)") && dc.getUnidadFinal().equals("Metros por segundo(m/s)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = can / 60;
            String cantif = canf + "m/s";
            dc.setResultado(cantif);
        }
        if (dc.getUnidadInicial().equals("Metros por minuto(m/min)") && dc.getUnidadFinal().equals("Kilometros por hora(Km/h)")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = can * 0.06;
            String cantif = canf + "Km/h";
            dc.setResultado(cantif);
        }
        if (dc.getUnidadInicial().equals("Metros por minuto(m/min)") && dc.getUnidadFinal().equals("Kilometros por segundo(Km/s))")) {
            int can = Integer.parseInt(dc.getCantidadConvertir());
            double canf = can / 60;
            String cantif = canf + "Km/s";
            dc.setResultado(cantif);
        }
    }
}
