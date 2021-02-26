<%-- 
    Document   : Tabla
    Created on : 26/02/2021, 11:56:46 AM
    Author     : Maya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Tabla de Amortizacion</h1>
        <%
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
        
    %>
    <br>
    <br>
    <center>
        <table>
            <tr>
                <td> <font FACE="Arial" size="6" Color="red">MONTO:</font> </td>
                <td> <input type="text" name="txtmonto" /> </td>
            </tr>
            <tr>
                <td> <font FACE="Arial" size="6" Color="BLACK">PLAZO:</font> </td>
                <td> <input type="text" name="plazo" /> </td>
            </tr>
            <tr>
                <td> <font FACE="Arial" size="6" Color="BLACK">INTERES:</font> </td>
                <td> <input type="text" name="txtinteres" /> </td>
            </tr>
            <tr>
                <td> <input type="submit" name="Calcular" value="Calcular" /> </td>
                <td> <input type="text" name="txtresultado" value= "<%=resultado%>" /> </td>
            </tr>
        </table>
        <center>
            <br>
            <br>
            <table>
                <tr>
                    <td> <font FACE="Arial" size="6" Color="BLACK">MONTO U OTROS:</font> </td>
                    <td> <input type="text" name="txtmuo" value="<%=monto%>" /> </td>
                </tr>
                <tr>
                    <td> <font FACE="Arial" size="6" Color="BLACK">CAPITAL TOTAL:</font> </td>
                    <td> <input type="text" name="txtct" value="<%=capTotal%>" /> </td>
                </tr>
                <tr>
                    <td> <font FACE="Arial" size="6" Color="BLACK">INTERES GENERADO:</font> </td>
                    <td> <input type="text" name="txtig" value="<%=intGenerado%>" /> </td>
                </tr>
                <tr>
                    <td> <font FACE="Arial" size="6" Color="BLACK">CUOTA FIJA:</font> </td>
                    <td> <input type="text" name="txtcf" value="<%=resultado%>" /> </td>
                </tr>
                <tr>
                    <td> <font FACE="Arial" size="6" Color="BLACK">SALDO CREDITO:</font> </td>
                    <td> <input type="text" name="txtsc" value="<%=saldoCredito%>"/> </td>
                </tr>
            </table>

        </center>
    </center>
    


</body>
</html>
