<%-- 
    Document   : arithmeticCalculator
    Created on : 26-Jan-2021, 2:17:19 PM
    Author     : sean0
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First: <input type="text" name="firstNum" value="${firstNumber}"><br>
            Second: <input type="text" name="secondNum" value="${secondNumber}"><br>
            <input type="submit" name="operation" value="+">
            <input type="submit" name="operation" value="-">
            <input type="submit" name="operation" value="*">
            <input type="submit" name="operation" value="/">
        </form>
        <br>
        <div>
            Result: ${message}
        </div>
        <a href="age">Age Calculator</a>
    </body>
</html>
