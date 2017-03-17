<%-- 
    Document   : form
    Created on : Mar 16, 2017, 8:21:40 PM
    Author     : Sunny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Signing up for heaven match</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1>Beer selection page</h1>
        <form method="POST" action="SelectBeer.do">
            <h3>Select Beer Characteristics</h3>
            <p>Color :</p>
            <select name="color" size="1">
                <option>light</option>
                <option>amber</option>
                <option>brown</option>
                <option>dark</option>
            </select>
            <br>
            <center>
                <input type="SUBMIT">
            </center>
        </form>
    </body>
</html>