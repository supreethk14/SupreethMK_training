<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="springmvc.entity.Flight" %>
<!DOCTYPE html>
<html>
<head>
    <title>Flight Details</title>
</head>
<body>
    <h1>Flight Details</h1>
    <p>Flight Number: <%= ((Flight) request.getAttribute("flight")).getFlightNumber() %></p>
    <p>Departure: <%= ((Flight) request.getAttribute("flight")).getDeparture() %></p>
    <p>Destination: <%= ((Flight) request.getAttribute("flight")).getDestination() %></p>
    
   
    <a href="../">Back to List</a>
</body>
</html>