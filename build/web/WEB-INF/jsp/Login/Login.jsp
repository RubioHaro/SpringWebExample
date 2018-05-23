<%-- 

*********************************************************
*    Documento   : Login
*    Creado el   : 10/05/2018 11:06:28 AM
*    Autor:      : Rodrigo R. Rubio Haro
*     //Unidad de Desarrollo de Sistemas, Bicéfala.\\   
*    //Grupo Águila Bicéfala de Transportes SA de CV\\  
*********************************************************
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Recursos/css/GeneralCSS.css"/>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Recursos/css/bootstrap.min.css"/>
        <script type="text/javascript" src="${pageContext.request.contextPath}/Recursos/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/Recursos/js/popper.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/Recursos/js/jquery.min.js"></script>
    </head>
    <body>    
        <div class="container">
            <div class="row">
                <div class="col-md-4"></div>
                <div class="col-md-4">
                    <div class="card">
                        <div class="card-header">
                            <h1>Login</h1>
                        </div>
                        <div class="card-body ">
                            <form:form>
                                
                                <div class="form-group">
                                    <form:label path="Nombre">Ingresa tu usuario</form:label>
                                    <form:input cssClass="form-control" placeholder="Usuario"  title="Ingresa aqui tu nombre" path="Nombre"/>
                                    <!--<label for="User"></label>
                                    <input class="form-control" required id="User" name="User" type="text"/>-->
                                </div>
                                <div class="form-group">
                                    <label for="User">Ingresa tu password</label>
                                    <input class="form-control" required name="Password" placeholder="Contraseña" type="password"/>
                                </div>
                                <div class="form-group text-center">
                                    <button class="btn btn-dark" type="submit">Iniciar sesion</button>
                                </div>

                            </form:form>

                        </div>
                    </div>
                </div>
                <div class="col-md-4"></div>
            </div>

        </div>
    </body>
</html>
