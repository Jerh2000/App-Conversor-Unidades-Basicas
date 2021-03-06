package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=latin1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\" integrity=\"sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk\" crossorigin=\"anonymous\">\n");
      out.write("        <title>Conversor de unidades</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h3 class=\"display-4 text-center\">Conversor de unidades</h3>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-6\">\n");
      out.write("                    <div class=\"container py-3\">\n");
      out.write("                        <div class=\"card text-white bg-primary mb-3\" style=\"max-width: 30rem;\">\n");
      out.write("                            <div class=\"card-header\">Conversor</div>\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <form name=\"conversor\" method=\"post\" action=\"ServletConversor\">\n");
      out.write("                                    <!--Selector de unidades-->\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"unidad\">Unidad:</label>\n");
      out.write("                                        <select name=\"unidad\" id=\"unidad\" class=\"form-control\" onchange='Cambio()'>\n");
      out.write("                                            <option disabled=\"true\">Seleccione una unidad</option>\n");
      out.write("                                            <option value=\"Moneda\" selected=\"true\">Moneda</option>\n");
      out.write("                                            <option value=\"Longitud\">Longitud</option>\n");
      out.write("                                            <option value=\"Volumen\">Volumen</option>\n");
      out.write("                                            <option value=\"Masa\">Masa</option>\n");
      out.write("                                            <option value=\"Área\">Área</option>\n");
      out.write("                                            <option value=\"Velocidad\">Velocidad</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!--Selector de unidades-->\n");
      out.write("                                    <!--Campo de ingreso de valor de la unidad-->\n");
      out.write("                                    <div class=\"form-group\" id=\"dato\">\n");
      out.write("                                        <label for=\"inputCity\">Quiero convertir:</label>\n");
      out.write("                                        <input type=\"number\" class=\"form-control\" name=\"cantidadConvertir\" placeholder=\"Escriba el valor aquí..\" required=\"true\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <!--Campo de ingreso de valor de la unidad-->\n");
      out.write("                                    <!--Unidad incio-->\n");
      out.write("                                    <div class=\"form-group\" id=\"uni1\">\n");
      out.write("                                        <select class=\"form-control\">\n");
      out.write("                                            <option disabled=\"true\" selected=\"true\">Seleccione una unidad</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!--Unidad incio-->\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"inputCity\">A:</label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!--Unidad final-->\n");
      out.write("                                    <div class=\"form-group\" id=\"uni2\">\n");
      out.write("                                        <select class=\"form-control\">\n");
      out.write("                                            <option disabled=\"true\" selected=\"true\">Seleccione una unidad</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!--Unidad final-->\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input type=\"submit\" class=\"btn btn-danger w-100\" value=\"Convertir\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <div class=\"container\">\n");
      out.write("                                            <button class=\"btn text-white\" id=\"BC1\" type=\"button\" style=\"background-color: white;height: 40px; width: 40px\" onmouseover=\"this.style.backgroundColor = '#F30C0C'\" onmouseout=\"this.style.backgroundColor = 'white'\"></button>\n");
      out.write("                                            <button class=\"btn text-white\" id=\"BC2\" type=\"button\" style=\"background-color: white;height: 40px; width: 40px\" onmouseover=\"this.style.backgroundColor = '#F35D0C'\" onmouseout=\"this.style.backgroundColor = 'white'\"></button>\n");
      out.write("                                            <button class=\"btn text-white\" id=\"BC3\" type=\"button\" style=\"background-color: white;height: 40px; width: 40px\" onmouseover=\"this.style.backgroundColor = '#F3D00C'\" onmouseout=\"this.style.backgroundColor = 'white'\"></button>\n");
      out.write("                                            <button class=\"btn text-white\" id=\"BC4\" type=\"button\" style=\"background-color: white;height: 40px; width: 40px\" onmouseover=\"this.style.backgroundColor = '#75F30C'\" onmouseout=\"this.style.backgroundColor = 'white'\"></button>\n");
      out.write("                                            <button class=\"btn text-white\" id=\"BC5\" type=\"button\" style=\"background-color: white;height: 40px; width: 40px\" onmouseover=\"this.style.backgroundColor = '#0CF30C'\" onmouseout=\"this.style.backgroundColor = 'white'\"></button>\n");
      out.write("                                            <button class=\"btn text-white\" id=\"BC6\" type=\"button\" style=\"background-color: white;height: 40px; width: 40px\" onmouseover=\"this.style.backgroundColor = '#0CF3A9'\" onmouseout=\"this.style.backgroundColor = 'white'\"></button>\n");
      out.write("                                            <button class=\"btn text-white\" id=\"BC7\" type=\"button\" style=\"background-color: white;height: 40px; width: 40px\" onmouseover=\"this.style.backgroundColor = '#0C8AF3'\" onmouseout=\"this.style.backgroundColor = 'white'\"></button>\n");
      out.write("                                            <button class=\"btn text-white\" id=\"BC8\" type=\"button\" style=\"background-color: white;height: 40px; width: 40px\" onmouseover=\"this.style.backgroundColor = '#0C2FF3'\" onmouseout=\"this.style.backgroundColor = 'white'\"></button>\n");
      out.write("                                            <button class=\"btn text-white\" id=\"BC9\" type=\"button\" style=\"background-color: white;height: 40px; width: 40px\" onmouseover=\"this.style.backgroundColor = '#950CF3'\" onmouseout=\"this.style.backgroundColor = 'white'\"></button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!--Valoracion-->\n");
      out.write("                <div class=\"col-6\">\n");
      out.write("                    <div class=\"container py-3\">\n");
      out.write("                        <div class=\"card text-white bg-primary mb-3\" style=\"max-width: 30rem;\">\n");
      out.write("                            <div class=\"card-header\">Valoración</div>\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <form name=\"valoracion\" method=\"post\" action=\"ServletValoracion\">\n");
      out.write("                                    <!---->\n");
      out.write("                                    <div class=\"form-row\">\n");
      out.write("                                        <div class=\"form-group col-6\">\n");
      out.write("                                            <label for=\"nombre\">Nombre:</label>\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" name=\"nombre\" placeholder=\"Escriba su nombre...\" required>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group col-6\">\n");
      out.write("                                            <label for=\"apellido\">Apellidos:</label>\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" name=\"apellidos\" placeholder=\"Escriba sus apellidos...\" required>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!---->\n");
      out.write("                                    <div class=\"form-row\">\n");
      out.write("                                        <div class=\"form-group col-6\">\n");
      out.write("                                            <label for=\"telefono\">Telefono:</label>\n");
      out.write("                                            <input type=\"number\" class=\"form-control\" name=\"telefono\" placeholder=\"Escriba su telefono...\" required=\"true\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group col-6\">\n");
      out.write("                                            <label for=\"apellido\">E-mail:</label>\n");
      out.write("                                            <input type=\"email\" class=\"form-control\" name=\"email\" placeholder=\"Escriba su E-mail...\" required>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!---->\n");
      out.write("                                    <div class=\"form-row\">\n");
      out.write("                                        <label for='valoracion' class=\"col-12\">¿Que tal le parecio el conversor?:</label>\n");
      out.write("                                        <div class=\"form-group col-3\">\n");
      out.write("                                            <input type=\"radio\" name='valoracion' value=\"Excelente\">\n");
      out.write("                                            <label for=\"telefono\">Excelente:</label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group col-3\">\n");
      out.write("                                            <input type=\"radio\" name='valoracion' value=\"Bueno\">\n");
      out.write("                                            <label for=\"telefono\">Bueno:</label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group col-3\">\n");
      out.write("                                            <input type=\"radio\" name='valoracion' value=\"Aceptable\">\n");
      out.write("                                            <label for=\"telefono\">Aceptable:</label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group col-3\">\n");
      out.write("                                            <input type=\"radio\" name='valoracion' value=\"Malo\">\n");
      out.write("                                            <label for=\"telefono\">Malo:</label>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!---->\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"exampleFormControlTextarea1\">Danos una sugerencia:</label>\n");
      out.write("                                        <textarea class=\"form-control\" name='sugerencia' rows=\"3\" placeholder=\"Escriba aquí una sugerencia\"></textarea>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!---->\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input type=\"submit\" class=\"btn btn-danger w-100\" value=\"Enviar\">\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("                    array = [\"Libra(GBP)\", \"Euro(EUR)\", \"Dolar USA(USD)\", \"Peso colombiano(COP)\"];\n");
      out.write("                    var elementos = \"\";\n");
      out.write("                    var elementos2 = \"\";\n");
      out.write("                    for (let i = 0; i < array.length; i++) {\n");
      out.write("            elementos = elementos + \"<option>\" + array[i] + \"</option>\";\n");
      out.write("                    elementos2 = elementos2 + \"<option>\" + array[i] + \"</option>\";\n");
      out.write("            }\n");
      out.write("            elementos = \"<select name='unidadInicial' id='moneda' class='form-control' required>\" + elementos + \"</select>\";\n");
      out.write("                    elementos2 = \"<select name='unidadFinal' id='moneda' class='form-control' required>\" + elementos2 + \"</select>\";\n");
      out.write("                    document.getElementById('uni1').innerHTML = elementos;\n");
      out.write("                    document.getElementById('uni2').innerHTML = elementos2;</script>\n");
      out.write("        <script>\n");
      out.write("                    function Cambio() {\n");
      out.write("                    var unidad = document.getElementById(\"unidad\").value;\n");
      out.write("                            var array = [];\n");
      out.write("                            //Los condicionales para establecer que unidad de medidad es\n");
      out.write("                            if (unidad == \"Moneda\") {\n");
      out.write("                    array = [\"Libra(GBP)\", \"Euro(EUR)\", \"Dolar USA(USD)\", \"Peso colombiano(COP)\"\n");
      out.write("                    ];\n");
      out.write("                    }\n");
      out.write("                    if (unidad == \"Longitud\") {\n");
      out.write("                    array = [\"Kilometro(Km)\", \"Metro(m)\", \"Centimetro(cm)\", \"Milimetro(mm)\" ];\n");
      out.write("                    }\n");
      out.write("                    if (unidad == \"Volumen\") {\n");
      out.write("                    array = [\"Galon(gal)\", \"Litro(l)\", \"Mililitro(ml)\"];\n");
      out.write("                    }\n");
      out.write("                    if (unidad == \"Masa\") {\n");
      out.write("                    array = [\"Kilogramo(Kg)\", \"Gramo(g)\", \"Miligramo(mg)\", \"Tonelada(t)\"];\n");
      out.write("                    }\n");
      out.write("                    if (unidad == \"Área\") {\n");
      out.write("                    array = [\"Kilometro cuadrado(Km²)\", \"Hectaria(ha)\", \"Metro cuadrado(m²)\"];\n");
      out.write("                    }\n");
      out.write("                    if (unidad == \"Velocidad\") {\n");
      out.write("                    array = [\"Kilometros por hora(Km/h)\", \"Metros por segundo(m/s)\", \"Kilometros por segundo(Km/s)\", \"Metros por minuto(m/min)\"];\n");
      out.write("                    }\n");
      out.write("                    //Los condicionales para establecer que unidad de medidad es\n");
      out.write("\n");
      out.write("\n");
      out.write("                    var elementos = \"\";\n");
      out.write("                            var elementos2 = \"\";\n");
      out.write("                            for (let i = 0; i < array.length; i++) {\n");
      out.write("                    elementos = elementos + \"<option>\" + array[i] + \"</option>\"\n");
      out.write("                            elementos2 = elementos2 + \"<option>\" + array[i] + \"</option>\"\n");
      out.write("                    }\n");
      out.write("                    elementos = \"<select name='unidadInicial' id='moneda' class='form-control' required>\" + elementos + \"</select>\"\n");
      out.write("                            elementos2 = \"<select name='unidadFinal' id='moneda' class='form-control' required>\" + elementos2 + \"</select>\"\n");
      out.write("                            document.getElementById('uni1').innerHTML = elementos;\n");
      out.write("                            document.getElementById('uni2').innerHTML = elementos2;\n");
      out.write("                    }\n");
      out.write("        </script>\n");
      out.write("        <!--Scripts de Bootstrap 4-->\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\" integrity=\"sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI\" crossorigin=\"anonymous\">\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
