<%-- 

*********************************************************
*    Documento   : Profile
*    Creado el   : 10/05/2018 10:32:21 AM
*    Autor:      : Rodrigo R. Rubio Haro
*     //Unidad de Desarrollo de Sistemas, Bicéfala.\\   
*    //Grupo Águila Bicéfala de Transportes SA de CV\\  
*********************************************************
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Roy Profile</title>
        <link href="Profile.css"/>
    </head>
    <body>
        <h1>Name: Rodrigo R. Rubio Haro</h1>
        <h1>Age: 18 años</h1>
        <h1>Ocupation: Java developer</h1>
        <h1>User id: ${UserId}</h1>
        <h1>Hash password: ${HashPassword}</h1>
        <hr/>
        <a href="home.htm"><button>Regresar al landing</button></a>
    </body>
</html>
