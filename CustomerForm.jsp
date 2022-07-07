<%@ page launguage ="java" content type="text/html;charset=ISO-8859-1"
    page encoding="ISO-8859-1"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
   <!DOCTYPE html>
   <html>
   <head>
   <meta charset="ISO-8859-1">
   <title>CustomerManagement</title>
   </head>
   <body>
   <form action="customer/save"method="post">
   <table>
   <tr>
   <td>firstname</td><td><input type="text"value="${customer.firstname}" name="customer firstname"/> </tr>tr>
   <tr>
      <td>lastname</td><td><input type="text"value="${customer.lastname}" name="lastname"/></tr>tr>
   </tr>
   <tr>
      <td>email</td><td><input type="text"value="${customer.email}" name="email"/> </tr>tr>
   </tr>
   <tr>
   <td colspan="2"><input type="submit"/></td></tr
   </table>
   </form>
   <body>
   <html>