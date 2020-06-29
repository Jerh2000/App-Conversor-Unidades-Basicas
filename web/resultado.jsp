<%-- 
    Document   : salida
    Created on : 29/05/2020, 06:35:04 PM
    Author     : Jairo
--%>

<%@page contentType="text/html" pageEncoding="latin1"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <title>Resultado</title>
    </head>
    <body>
        <div class="container text-center">
            <h1 class="display-4">Su resultado de conversion es:</h1>
            <div class="d-flex justify-content-center">
                <div class="card text-white bg-primary mb-3" style="max-width: 80rem;">
                    <div class="card-header">Resultado</div>
                    <div class="card-body">
                        <h1 for="unidad">Usted convirtió:</h1>
                        <p class="lead" for="unidad"><jsp:getProperty name="DatosConversor" property="cantidadConvertir"/> <jsp:getProperty name="DatosConversor" property="unidadInicial"/>  </p>
                        <p class="lead"><b>A:</b></p>
                        <p class="lead"><jsp:getProperty name="DatosConversor" property="unidadFinal"/></p>
                        <h1>El resultado es:</h1>
                        <h1 class="display-4"><jsp:getProperty name="DatosConversor" property="resultado"/> <jsp:getProperty name="DatosConversor" property="unidadFinal"/> </h1>
                        <a href="index.jsp" class="lead btn btn-danger"> Volver Atrás</a>
                    </div>

                </div>
            </div>

        </div>


    </body>
</html>
