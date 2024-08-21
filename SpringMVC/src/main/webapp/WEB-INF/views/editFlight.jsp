<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="springmvc.entity.Flight" %>
<!DOCTYPE html>
<html>
<head>
    <title>Edit Flight</title>
</head>
<body>
    <h1>Edit Flight</h1>
    <form action="../edit/<%= ((Flight) request.getAttribute("flight")).getFlightId() %>" method="post">
        <input type="hidden" name="flightId" value="<%= ((Flight) request.getAttribute("flight")).getFlightId() %>">
        
        <label>Flight Number:</label>
        <input type="text" name="flightNumber" value="<%= ((Flight) request.getAttribute("flight")).getFlightNumber() %>"><br>

        <label>Departure:</label>
        <input type="text" name="departure" value="<%= ((Flight) request.getAttribute("flight")).getDeparture() %>"><br>

        <label>Destination:</label>
        <input type="text" name="destination" value="<%= ((Flight) request.getAttribute("flight")).getDestination() %>"><br>

 

        <button type="submit">Update Flight</button>
    </form>
</body>
</html>
    