<%-- 
    Document   : Clientes
    Created on : 27-abr-2020, 22:03:34
    Author     : DOUGLAS
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
        <title>JSP Page</title>
    </head>
    <body>
       
           <div class="d-flex">
           

            <div class="card col-sm-5">
                <div class="card-body">
                    <form action="Controlador?menu=Clientes" method="POST" >
                        <div class="form-group">
                              <h1>Clientes</h1>
                            <label>Dni</label>
                            <input type="text" value="${cliente.getDniC()}" name="txtDni" class="form-control">
                        </div>  
                        <div class="form-group">
                            <label>Nombres</label>
                            <input type="text" value="${cliente.getNombresC()}" name="txtNombres" class="form-control">
                        </div>  
                        <div class="form-group">
                            <label>Direccion</label>
                            <input type="text" value="${cliente.getDireccionC()}" name="txtDirec" class="form-control">

                        </div>  
                        <div class="form-group">
                            <label>Estado</label>
                            <input type="text" value="${cliente.getEstadoC()}" name="txtEstado" class="form-control">

                        </div>  
                          

                        <input type="submit" name="accion" value="Agregar" class="btn btn-info">
                        <input type="submit" name="accion" value="Actualizar" class="btn btn-success">
                    </form>

                </div>
            </div>
            <div class="col-sm-7">
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>DNI</th>
                            <th>NOMBRES</th>
                            <th>DIRECCION</th>
                            <th>ESTADO</th>
                            <th>ACCIONES</th>
                        </tr> 
                    </thead>   
                    <tbody>
                        <c:forEach var="cli" items="${clientes}">
                        <tr>
                            <td>${cli.getIdC()}</td>   
                            <td>${cli.getDniC()}</td>   
                            <td>${cli.getNombresC()}</td>   
                            <td>${cli.getDireccionC()}</td>   
                            <td>${cli.getEstadoC()}</td>   
                            
                            <td>
                                <a class="btn btn-warning" href="Controlador?menu=Clientes&accion=Editar&id=${cli.getIdC()}">Editar</a>
                                <a class="btn btn-danger" href="Controlador?menu=Clientes&accion=Delete&id=${cli.getIdC()}" >Eliminar</a>
                            </td>

                        </tr>  
                        </c:forEach>
                    </tbody>   
                </table>



            </div>
        </div>
       <script type="text/javascript" src="js/jquery-3.5.0.js"></script>
       <script type="text/javascript" src="js/bootstrap.js"></script>
    </body>
</html>
