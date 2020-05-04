
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
        <title>JSP Page</title>
    </head>
    <body>
   
        <div class="container mt-4 col-lg-4">

            <div class="card">

                <div class="card-body col-sm-10">
                    <form class="form-sing" action="Validar" method="POST">

                        <div class="form-group  text-center">  
                            <h3>Login</h3>
                            <img src="img/logo.JPG" alt="170" width="170"/>
                            <label>Bienvenidos al Sistema</label>
                        </div>
                        <div class="form-group">  
                            <label>Usuario:</label>
                            <input type="text" name="txtuser" class="form-control">
                        </div>
                        <div class="form-group">  
                            <label>Password:</label>
                            <input type="password" name="txtpass" class="form-control">
                        </div>
                        <input type="submit" name="accion" value="Ingresar" class="btn btn-primary btn-block">       



                    </form>

                </div>

            </div>

        </div>



        <script type="text/javascript" src="js/jquery-3.5.0.js"></script>
        <script type="text/javascript" src="js/bootstrap.js"></script>
    </body>
</html>
