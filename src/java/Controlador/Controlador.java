/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import Modelo.ClienteDAO;
import Modelo.Empleado;
import Modelo.EmpleadoDAO;
import Modelo.Producto;
import Modelo.ProductoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DOUGLAS
 */
public class Controlador extends HttpServlet {

    Empleado em = new Empleado();
    EmpleadoDAO edao = new EmpleadoDAO();
    int ide;
    int idc;
    int idp;
    Cliente cli = new Cliente();
    ClienteDAO cdao = new ClienteDAO();

    Producto pro = new Producto();
    ProductoDAO pdao = new ProductoDAO();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String menu = request.getParameter("menu");
        String accion = request.getParameter("accion");
        if (menu.equals("Principal")) {
            request.getRequestDispatcher("Principal.jsp").forward(request, response);
        }
        if (menu.equals("Empleado")) {

            switch (accion) {
                case "Listar":
                    List lista = edao.listar();
                    request.setAttribute("empleados", lista);
                    break;
                case "Agregar":
                    String dni = request.getParameter("txtDni");
                    String nom = request.getParameter("txtNombres");
                    String tel = request.getParameter("txtTel");
                    String est = request.getParameter("txtEstado");
                    String user = request.getParameter("txtusuario");
                    em.setDni(dni);
                    em.setNom(nom);
                    em.setTel(tel);
                    em.setEstado(est);
                    em.setUser(user);

                    edao.agregar(em);
                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                    break;
                case "Editar":
                    ide = Integer.parseInt(request.getParameter("id"));
                    Empleado e = edao.listarId(ide);
                    request.setAttribute("empleado", e);
                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);

                    break;

                case "Actualizar":
                    String dni1 = request.getParameter("txtDni");
                    String nom1 = request.getParameter("txtNombres");
                    String tel1 = request.getParameter("txtTel");
                    String est1 = request.getParameter("txtEstado");
                    String user1 = request.getParameter("txtusuario");
                    em.setDni(dni1);
                    em.setNom(nom1);
                    em.setTel(tel1);
                    em.setEstado(est1);
                    em.setUser(user1);
                    em.setId(ide);

                    edao.actualizar(em);

                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);

                    break;

                case "Delete":
                    ide = Integer.parseInt(request.getParameter("id"));
                    edao.delete(ide);
                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                    break;

                default:
                    throw new AssertionError();

            }

            request.getRequestDispatcher("Empleado.jsp").forward(request, response);
        }
        if (menu.equals("Clientes")) {

            switch (accion) {
                case "Listar":
                    List lista = cdao.listar();
                    request.setAttribute("clientes", lista);

                    break;

                case "Agregar":
                    // en las clases para mostrar (get) o modificar (set) 
                    String dni = request.getParameter("txtDni");
                    String nom = request.getParameter("txtNombres");
                    String direc = request.getParameter("txtDirec");
                    String esta = request.getParameter("txtEstado");
                    cli.setDniC(dni);
                    cli.setNombresC(nom);
                    cli.setDireccionC(direc);
                    cli.setEstadoC(esta);
                    cdao.agregar(cli);
                    request.getRequestDispatcher("Controlador?menu=Clientes&accion=Listar").forward(request, response);
                    break;

                case "Editar":
                    idc = Integer.parseInt(request.getParameter("id"));
                    Cliente cl = cdao.listarId(idc);
                    request.setAttribute("cliente", cl);
                    request.getRequestDispatcher("Controlador?menu=Clientes&accion=Listar").forward(request, response);
                    break;
                case "Actualizar":
                    // en las clases para mostrar (get) o modificar (set) 
                    String dniC = request.getParameter("txtDni");
                    String nomC = request.getParameter("txtNombres");
                    String direcC = request.getParameter("txtDirec");
                    String estaC = request.getParameter("txtEstado");
                    cli.setDniC(dniC);
                    cli.setNombresC(nomC);
                    cli.setDireccionC(direcC);
                    cli.setEstadoC(estaC);
                    cli.setIdC(idc);
                    cdao.actualizar(cli);

                    request.getRequestDispatcher("Controlador?menu=Clientes&accion=Listar").forward(request, response);
                    break;
                case "Delete":
                    idc = Integer.parseInt(request.getParameter("id"));
                    cdao.delete(idc);
                    request.getRequestDispatcher("Controlador?menu=Clientes&accion=Listar").forward(request, response);

                    break;
                default:
                    throw new AssertionError();
            }
            request.getRequestDispatcher("Clientes.jsp").forward(request, response);

        }

        if (menu.equals("Producto")) {

            switch (accion) {
                case "Listar":
                    List lista = pdao.listar();
                    request.setAttribute("productos", lista);

                    break;

                case "Agregar":
                    String nombre = request.getParameter("txtNombres");
                    double precio = Double.parseDouble(request.getParameter("txtPrecio"));
                    int stock = Integer.parseInt(request.getParameter("txtStock"));
                    String estado = request.getParameter("txtEstado");
                    // en las clases para mostrar (get) o modificar (set)
                    pro.setNombres(nombre);
                    pro.setPrecio(precio);
                    pro.setStock(stock);
                    pro.setEstado(estado);

                    pdao.agregar(pro);
                    request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);
                    break;

                case "Editar":
                    idp = Integer.parseInt(request.getParameter("id"));
                    Producto pr = pdao.listarId(idp);
                    request.setAttribute("producto", pr);

                    request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);
                    break;
                case "Actualizar":
                    String nombrep = request.getParameter("txtNombres");
                    double preciop = Double.parseDouble(request.getParameter("txtPrecio"));
                    int stockp = Integer.parseInt(request.getParameter("txtStock"));
                    String estadop = request.getParameter("txtEstado");
                    // en las clases para mostrar (get) o modificar (set)
                    pro.setNombres(nombrep);
                    pro.setPrecio(preciop);
                    pro.setStock(stockp);
                    pro.setEstado(estadop);
                    pro.setIdProducto(idp);
                    pdao.actualizar(pro);

                    request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);

                    break;

                case "Delete":
                    
                    idp=Integer.parseInt(request.getParameter("id"));
                    pdao.delete(idp);
                    
                    request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);

                    break;
                default:
                    request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);
            }
            request.getRequestDispatcher("Producto.jsp").forward(request, response);
        }
        if (menu.equals("NuevaVenta")) {
            request.getRequestDispatcher("RegistrarVenta.jsp").forward(request, response);
        }

        /*   switch(accion){
        case "Principal":
            request.getRequestDispatcher("Principal.jsp").forward(request, response);
        break;
         case "Producto":
             request.getRequestDispatcher("Producto.jsp").forward(request, response);
          break;
        
        case "Clientes":
             request.getRequestDispatcher("Clientes.jsp").forward(request, response);
            break;
            
        case "Empleado":
             request.getRequestDispatcher("Empleado.jsp").forward(request, response);
            break;
            
        case "NuevaVenta":
             request.getRequestDispatcher("RegistrarVenta.jsp").forward(request, response);
            break;
        
        
        
        
        
    } */
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
