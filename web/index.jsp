<%-- 
    Document   : index
    Created on : 29/05/2020, 11:53:21 AM
    Author     : Jairo
--%>

<%@page contentType="text/html" pageEncoding="latin1"%>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <title>Conversor de unidades</title>

    </head>

    <body>
        <div class="container">
            <h3 class="display-4 text-center">Conversor de unidades</h3>
            <div class="row">
                <div class="col-6">
                    <div class="container py-3">
                        <div class="card text-white bg-primary mb-3" style="max-width: 30rem;">
                            <div class="card-header">Conversor</div>
                            <div class="card-body">
                                <form name="conversor" method="post" action="ServletConversor">
                                    <!--Selector de unidades-->
                                    <div class="form-group">
                                        <label for="unidad">Unidad:</label>
                                        <select name="unidad" id="unidad" class="form-control" onchange='Cambio()'>
                                            <option disabled="true">Seleccione una unidad</option>
                                            <option value="Moneda" selected="true">Moneda</option>
                                            <option value="Longitud">Longitud</option>
                                            <option value="Volumen">Volumen</option>
                                            <option value="Masa">Masa</option>
                                            <option value="Área">Área</option>
                                            <option value="Velocidad">Velocidad</option>
                                        </select>
                                    </div>
                                    <!--Selector de unidades-->
                                    <!--Campo de ingreso de valor de la unidad-->
                                    <div class="form-group" id="dato">
                                        <label for="inputCity">Quiero convertir:</label>
                                        <input type="number" class="form-control" name="cantidadConvertir" placeholder="Escriba el valor aquí.." required="true">
                                    </div>
                                    <!--Campo de ingreso de valor de la unidad-->
                                    <!--Unidad incio-->
                                    <div class="form-group" id="uni1">
                                        <select class="form-control">
                                            <option disabled="true" selected="true">Seleccione una unidad</option>
                                        </select>
                                    </div>
                                    <!--Unidad incio-->
                                    <div class="form-group">
                                        <label for="inputCity">A:</label>
                                    </div>
                                    <!--Unidad final-->
                                    <div class="form-group" id="uni2">
                                        <select class="form-control">
                                            <option disabled="true" selected="true">Seleccione una unidad</option>
                                        </select>
                                    </div>
                                    <!--Unidad final-->
                                    <div class="form-group">
                                        <input type="submit" class="btn btn-danger w-100" value="Convertir">
                                    </div>
                                    <div class="form-group">
                                        <div class="container">
                                            <button class="btn text-white" id="BC1" type="button" style="background-color: white;height: 40px; width: 40px" onmouseover="this.style.backgroundColor = '#F30C0C'" onmouseout="this.style.backgroundColor = 'white'"></button>
                                            <button class="btn text-white" id="BC2" type="button" style="background-color: white;height: 40px; width: 40px" onmouseover="this.style.backgroundColor = '#F35D0C'" onmouseout="this.style.backgroundColor = 'white'"></button>
                                            <button class="btn text-white" id="BC3" type="button" style="background-color: white;height: 40px; width: 40px" onmouseover="this.style.backgroundColor = '#F3D00C'" onmouseout="this.style.backgroundColor = 'white'"></button>
                                            <button class="btn text-white" id="BC4" type="button" style="background-color: white;height: 40px; width: 40px" onmouseover="this.style.backgroundColor = '#75F30C'" onmouseout="this.style.backgroundColor = 'white'"></button>
                                            <button class="btn text-white" id="BC5" type="button" style="background-color: white;height: 40px; width: 40px" onmouseover="this.style.backgroundColor = '#0CF30C'" onmouseout="this.style.backgroundColor = 'white'"></button>
                                            <button class="btn text-white" id="BC6" type="button" style="background-color: white;height: 40px; width: 40px" onmouseover="this.style.backgroundColor = '#0CF3A9'" onmouseout="this.style.backgroundColor = 'white'"></button>
                                            <button class="btn text-white" id="BC7" type="button" style="background-color: white;height: 40px; width: 40px" onmouseover="this.style.backgroundColor = '#0C8AF3'" onmouseout="this.style.backgroundColor = 'white'"></button>
                                            <button class="btn text-white" id="BC8" type="button" style="background-color: white;height: 40px; width: 40px" onmouseover="this.style.backgroundColor = '#0C2FF3'" onmouseout="this.style.backgroundColor = 'white'"></button>
                                            <button class="btn text-white" id="BC9" type="button" style="background-color: white;height: 40px; width: 40px" onmouseover="this.style.backgroundColor = '#950CF3'" onmouseout="this.style.backgroundColor = 'white'"></button>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
                <!--Valoracion-->
                <div class="col-6">
                    <div class="container py-3">
                        <div class="card text-white bg-primary mb-3" style="max-width: 30rem;">
                            <div class="card-header">Valoración</div>
                            <div class="card-body">
                                <form name="valoracion" method="post" action="ServletValoracion">
                                    <!---->
                                    <div class="form-row">
                                        <div class="form-group col-6">
                                            <label for="nombre">Nombre:</label>
                                            <input type="text" class="form-control" name="nombre" placeholder="Escriba su nombre..." required>
                                        </div>
                                        <div class="form-group col-6">
                                            <label for="apellido">Apellidos:</label>
                                            <input type="text" class="form-control" name="apellidos" placeholder="Escriba sus apellidos..." required>
                                        </div>
                                    </div>
                                    <!---->
                                    <div class="form-row">
                                        <div class="form-group col-6">
                                            <label for="telefono">Telefono:</label>
                                            <input type="number" class="form-control" name="telefono" placeholder="Escriba su telefono..." required="true">
                                        </div>
                                        <div class="form-group col-6">
                                            <label for="apellido">E-mail:</label>
                                            <input type="email" class="form-control" name="email" placeholder="Escriba su E-mail..." required>
                                        </div>
                                    </div>
                                    <!---->
                                    <div class="form-row">
                                        <label for='valoracion' class="col-12">¿Que tal le parecio el conversor?:</label>
                                        <div class="form-group col-3">
                                            <input type="radio" name='valoracion' value="Excelente">
                                            <label for="telefono">Excelente:</label>
                                        </div>
                                        <div class="form-group col-3">
                                            <input type="radio" name='valoracion' value="Bueno">
                                            <label for="telefono">Bueno:</label>
                                        </div>
                                        <div class="form-group col-3">
                                            <input type="radio" name='valoracion' value="Aceptable">
                                            <label for="telefono">Aceptable:</label>
                                        </div>
                                        <div class="form-group col-3">
                                            <input type="radio" name='valoracion' value="Malo">
                                            <label for="telefono">Malo:</label>
                                        </div>
                                    </div>
                                    <!---->
                                    <div class="form-group">
                                        <label for="exampleFormControlTextarea1">Danos una sugerencia:</label>
                                        <textarea class="form-control" name='sugerencia' rows="3" placeholder="Escriba aquí una sugerencia"></textarea>
                                    </div>
                                    <!---->
                                    <div class="form-group">
                                        <input type="submit" class="btn btn-danger w-100" value="Enviar">
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
















        <script>
                    array = ["Libra(GBP)", "Euro(EUR)", "Dolar USA(USD)", "Peso colombiano(COP)"];
                    var elementos = "";
                    var elementos2 = "";
                    for (let i = 0; i < array.length; i++) {
            elementos = elementos + "<option>" + array[i] + "</option>";
                    elementos2 = elementos2 + "<option>" + array[i] + "</option>";
            }
            elementos = "<select name='unidadInicial' id='moneda' class='form-control' required>" + elementos + "</select>";
                    elementos2 = "<select name='unidadFinal' id='moneda' class='form-control' required>" + elementos2 + "</select>";
                    document.getElementById('uni1').innerHTML = elementos;
                    document.getElementById('uni2').innerHTML = elementos2;</script>
        <script>
                    function Cambio() {
                    var unidad = document.getElementById("unidad").value;
                            var array = [];
                            //Los condicionales para establecer que unidad de medidad es
                            if (unidad == "Moneda") {
                    array = ["Libra(GBP)", "Euro(EUR)", "Dolar USA(USD)", "Peso colombiano(COP)"
                    ];
                    }
                    if (unidad == "Longitud") {
                    array = ["Kilometro(Km)", "Metro(m)", "Centimetro(cm)", "Milimetro(mm)" ];
                    }
                    if (unidad == "Volumen") {
                    array = ["Galon(gal)", "Litro(l)", "Mililitro(ml)"];
                    }
                    if (unidad == "Masa") {
                    array = ["Kilogramo(Kg)", "Gramo(g)", "Miligramo(mg)", "Tonelada(t)"];
                    }
                    if (unidad == "Área") {
                    array = ["Kilometro cuadrado(Km²)", "Hectaria(ha)", "Metro cuadrado(m²)"];
                    }
                    if (unidad == "Velocidad") {
                    array = ["Kilometros por hora(Km/h)", "Metros por segundo(m/s)", "Kilometros por segundo(Km/s)", "Metros por minuto(m/min)"];
                    }
                    //Los condicionales para establecer que unidad de medidad es


                    var elementos = "";
                            var elementos2 = "";
                            for (let i = 0; i < array.length; i++) {
                    elementos = elementos + "<option>" + array[i] + "</option>"
                            elementos2 = elementos2 + "<option>" + array[i] + "</option>"
                    }
                    elementos = "<select name='unidadInicial' id='moneda' class='form-control' required>" + elementos + "</select>"
                            elementos2 = "<select name='unidadFinal' id='moneda' class='form-control' required>" + elementos2 + "</select>"
                            document.getElementById('uni1').innerHTML = elementos;
                            document.getElementById('uni2').innerHTML = elementos2;
                    }
        </script>
        <!--Scripts de Bootstrap 4-->
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous">
        </script>
    </body>

</html>