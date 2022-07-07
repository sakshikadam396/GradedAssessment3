<%@ page launguage ="java" content type="text/html;charset=ISO-8859-1"
    page encoding="ISO-8859-1"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
   <!DOCTYPE html>
   <html>
   <head>
   <meta charset="ISO-8859-1">
   <title>CustomerManagement</title>
   </head>
   <body>
   <table><tr><td><a href="customers/addcustomer">add new customer</a></td>/table
   <table border="1">
   <tr>
   <th>firstname</th><th>lastname</th><th>email</th>
   <tr>
   <c:forEach items="$(customers)" var="b">
   <tr>
   <td>$.(c.firstname)</td><td>$.(c.lastname)</td><td>$.(c.email)</td><td>Action</td><td>< href="addcustomer?customerid=(b.id)">update<></td><td>"
   </table>
   </form>
   <body>
   <html>
