<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Add Flight</title>
   
</head>
<body>
    <h1>Add Flight</h1>
    <form action="add" method="post">
        <label for="flightNumber">flightNumber:</label>
        <input type="text" id="flightNumber" name="flightNumber" required><br>
        
        <label for="destination">Destination:</label>
        <input type="text" id="destination" name="destination" required><br>
        
        <label for="departure">departure:</label>
        <input type="text" id="departure" name="departure" required><br>
        
        <input type="submit" value="Add Flight">
    </form>
    <a href="./">Back to List</a>
</body>
</html>