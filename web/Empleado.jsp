<%-- 
    Document   : Empleado
    Created on : 27-abr-2020, 22:03:01
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
                    <form action="Controlador?menu=Empleado" method="POST" >
                        <div class="form-group">
                             <h1>Empleados</h1>
                            <label>Dni</label>
                            <input type="text" value="${empleado.getDni()}" name="txtDni" class="form-control">
                        </div>  
                        <div class="form-group">
                            <label>Nombres</label>
                            <input type="text" value="${empleado.getNom()}" name="txtNombres" class="form-control">
                        </div>  
                        <div class="form-group">
                            <label>Telefono</label>
                            <input type="text" value="${empleado.getTel()}" name="txtTel" class="form-control">

                        </div>  
                        <div class="form-group">
                            <label>Estado</label>
                            <input type="text" value="${empleado.getEstado()}" name="txtEstado" class="form-control">

                        </div>  
                        <div class="form-group">
                            <label>Usuario</label>
                            <input type="text" value="${empleado.getUser()}" name="txtusuario" class="form-control">
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
                            <th>TELEFONO</th>
                            <th>ESTADO</th>
                            <th>USUARIOS</th>
                            <th>ACCIONES</th>
                        </tr> 
                    </thead>   
                    <tbody>
                        <c:forEach var="em" items="${empleados}">
                        <tr>
                            <td>${em.getId()}</td>   
                            <td>${em.getDni()}</td>   
                            <td>${em.getNom()}</td>   
                            <td>${em.getTel()}</td>   
                            <td>${em.getEstado()}</td>   
                            <td>${em.getUser()}</td> 
                            <td>
                                <a class="btn btn-warning" href="Controlador?menu=Empleado&accion=Editar&id=${em.getId()}">Editar</a>
                                <a class="btn btn-danger" href="Controlador?menu=Empleado&accion=Delete&id=${em.getId()}" >Eliminar</a>
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
