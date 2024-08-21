<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ page import="java.util.List" %>
<%@ page import="springmvc.entity.Flight" %>
<!DOCTYPE html>
<html>
<head>
    <title>Flight List</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
    <h1>Flight List</h1>
    <a href="add">Add New Flight</a>
    <table>
        <thead>
            <tr>
                <th>Flight Number</th>
                <th>Destination</th>
                <th>Origin</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <%
            List<Flight> flights = (List<Flight>) request.getAttribute("flights");
            for (Flight flight : flights) {
            %>
                <tr>
                    <td><%= flight.getFlightNumber() %></td>
                    <td><%= flight.getDestination() %></td>
                    <td><%= flight.getDeparture() %></td>
                    <td>
                        <a href="edit/<%= flight.getFlightId() %>">Edit</a> |
                        <a href="flights/delete/<%= flight.getFlightId() %>">Delete</a> |
                        <a href="details/<%= flight.getFlightId() %>">View</a>
                    </td>
                </tr>
            <% } %>
        </tbody>
    </table>
</body>
</html>
