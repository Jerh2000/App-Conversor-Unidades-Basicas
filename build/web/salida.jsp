<%-- 
    Document   : salida
    Created on : 2/06/2020, 07:29:02 PM
    Author     : Jairo
--%>

<%@page contentType="text/html" pageEncoding="latin1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
        <title>Valoración</title>
    </head>
    <body>
        <div class="container">

            <jsp:useBean id="DatosValoracion" scope="request" class="com.modelo.DatosValoracion"/>
            <h3 class="text-center display-4">Sr(a) <jsp:getProperty name="DatosValoracion" property="nombre" /> Usted a ha respondido a nuestra encuenta con los siguientes datos:</h3>
            <div class="d-flex justify-content-center">
                <div class="card text-white bg-info mb-3" style="max-width: 40rem;">
                    <div class="card-header">Valoración</div>
                    <div class="card-body">
                        <h2 class="display-4" style="font-size: 2rem">Nombre: <jsp:getProperty name="DatosValoracion" property="nombre" /></h2>
                        <h2 class="display-4" style="font-size: 2rem">Apellidos: <jsp:getProperty name="DatosValoracion" property="apellidos" /></h2>
                        <h2 class="display-4" style="font-size: 2rem">Telefono: <jsp:getProperty name="DatosValoracion" property="telefono" /></h2>
                        <h2 class="display-4" style="font-size: 2rem">E-mail: <jsp:getProperty name="DatosValoracion" property="email" /></h2>
                        <%
                            String valoracion[] = DatosValoracion.getValoracion();
                            if (valoracion != null) {
                                for (int i = 0; i < valoracion.length; i++) {

                        %>
                        <h2 class="display-4" style="font-size: 2rem"> Calificación del conversor: 
                           <%= valoracion[i]%>
                        </h2>
                        <%}
                            }
                        %>
                        <br>
                        <h2 class="lead text-justify" >Su sugerencia:<br><i> <jsp:getProperty name="DatosValoracion" property="sugerencia" /> </i></h2>
                        <br><br>
                        <a href="index.jsp" class="btn btn-danger w-100"> Volver Atrás</a>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
