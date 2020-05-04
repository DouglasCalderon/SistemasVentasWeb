<%-- 
    Document   : Producto
    Created on : 27-abr-2020, 22:02:35
    Author     : DOUGLAS
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
            <div class="d-flex">
           

            <div class="card col-sm-5">
                <div class="card-body">
                    <form action="Controlador?menu=Producto" method="POST" >
                        
                        <div class="form-group">
                            <label>Nombres</label>
                            <input type="text" value="${producto.getNombres()}" name="txtNombres" class="form-control">
                        </div>  
                        <div class="form-group">
                            <label>Precio</label>
                            <input type="text" value="${producto.getPrecio()}" name="txtPrecio" class="form-control">

                        </div>  
                         <div class="form-group">
                            <label>Stock</label>
                            <input type="text" value="${producto.getStock()}" name="txtStock" class="form-control">

                        </div>  
                        <div class="form-group">
                            <label>Estado</label>
                            <input type="text" value="${producto.getEstado()}" name="txtEstado" class="form-control">

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
                            <th>NOMBRES</th>
                            <th>PRECIO</th>
                            <th>STOCK</th>
                            <th>ESTADO</th>
                            <th>ACCIONES</th>
                        </tr> 
                    </thead>   
                    <tbody>
                        <c:forEach var="pro" items="${productos}">
                        <tr>
                            <td>${pro.getIdProducto()}</td> 
                            <td>${pro.getNombres()}</td>   
                            <td>${pro.getPrecio()}</td>   
                            <td>${pro.getStock()}</td>   
                            <td>${pro.getEstado()}</td>   
                            <td>
                                <a class="btn btn-warning" href="Controlador?menu=Producto&accion=Editar&id=${pro.getIdProducto()}">Editar</a>
                                <a class="btn btn-danger" href="Controlador?menu=Producto&accion=Delete&id=${pro.getIdProducto()}" >Eliminar</a>
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
