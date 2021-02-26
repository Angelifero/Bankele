package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Tabla_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Tabla de Amortizacion</h1>\n");
      out.write("        ");

        double monto = 0;
        double interes = 0;
        double resultado;
        
        
        if(request.getParameter("Calcular")!=null){
            monto=Integer.parseInt(request.getParameter("txtmonto"));
            interes=Integer.parseInt(request.getParameter("txtinteres"));
        }
        resultado = monto * (interes) / 100;
        
        double cuota = 0;
        double capTotal = 0;
        double intGenerado = 0;
        double saldoCredito = 0;
        
        capTotal=resultado-((monto*(interes)/100)*30)/360;
        intGenerado=((monto*(interes)/100)*30)/360;
        //intGenerado=resultado-capTotal;
        saldoCredito=monto-capTotal;
        
    
      out.write("\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <center>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td> <font FACE=\"Arial\" size=\"6\" Color=\"red\">MONTO:</font> </td>\n");
      out.write("                <td> <input type=\"text\" name=\"txtmonto\" /> </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td> <font FACE=\"Arial\" size=\"6\" Color=\"BLACK\">PLAZO:</font> </td>\n");
      out.write("                <td> <input type=\"text\" name=\"plazo\" /> </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td> <font FACE=\"Arial\" size=\"6\" Color=\"BLACK\">INTERES:</font> </td>\n");
      out.write("                <td> <input type=\"text\" name=\"txtinteres\" /> </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td> <input type=\"submit\" name=\"Calcular\" value=\"Calcular\" /> </td>\n");
      out.write("                <td> <input type=\"text\" name=\"txtresultado\" value= \"");
      out.print(resultado);
      out.write("\" /> </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <center>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td> <font FACE=\"Arial\" size=\"6\" Color=\"BLACK\">MONTO U OTROS:</font> </td>\n");
      out.write("                    <td> <input type=\"text\" name=\"txtmuo\" value=\"");
      out.print(monto);
      out.write("\" /> </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> <font FACE=\"Arial\" size=\"6\" Color=\"BLACK\">CAPITAL TOTAL:</font> </td>\n");
      out.write("                    <td> <input type=\"text\" name=\"txtct\" value=\"");
      out.print(capTotal);
      out.write("\" /> </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> <font FACE=\"Arial\" size=\"6\" Color=\"BLACK\">INTERES GENERADO:</font> </td>\n");
      out.write("                    <td> <input type=\"text\" name=\"txtig\" value=\"");
      out.print(intGenerado);
      out.write("\" /> </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> <font FACE=\"Arial\" size=\"6\" Color=\"BLACK\">CUOTA FIJA:</font> </td>\n");
      out.write("                    <td> <input type=\"text\" name=\"txtcf\" value=\"");
      out.print(resultado);
      out.write("\" /> </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> <font FACE=\"Arial\" size=\"6\" Color=\"BLACK\">SALDO CREDITO:</font> </td>\n");
      out.write("                    <td> <input type=\"text\" name=\"txtsc\" value=\"");
      out.print(saldoCredito);
      out.write("\"/> </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("        </center>\n");
      out.write("    </center>\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
