
package Modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class ClienteDAO {
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
   //Operaciones CRUD
    public List listar(){
        String sql="select * from cliente";
        List<Cliente>lista=new ArrayList();
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Cliente cli=new Cliente();
                cli.setIdC(rs.getInt(1));
                cli.setDniC(rs.getString(2));
                cli.setNombresC(rs.getString(3));
                cli.setDireccionC(rs.getString(4));
                cli.setEstadoC(rs.getString(5));
                lista.add(cli);
                
                
            }
            
            
            
            
        } catch (Exception e) {
        }
        return lista;
        
    }
    
    public int agregar(Cliente cli){
        String sql="insert into cliente(Dni,Nombres ,Direccion, Estado)values(?,?,?,?)";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, cli.getDniC());
            ps.setString(2, cli.getNombresC());
            ps.setString(3, cli.getDireccionC());
            ps.setString(4, cli.getEstadoC());
            ps.executeUpdate();
            
        } catch (Exception e) {
            
        }
        
        return r;
        
        
    }
    public Cliente listarId(int id){
        Cliente clie=new Cliente();
        String sql="select * from Cliente where IdCliente="+id;
        
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                clie.setDniC(rs.getString(2));
                clie.setNombresC(rs.getString(3));   
                clie.setDireccionC(rs.getString(4));   
                clie.setEstadoC(rs.getString(5));   
                
            }
            
        } catch (Exception e) {
        }
        return clie;
    }
    
    
    public int actualizar(Cliente cli){
        String sql=sql="update cliente set Dni=?,Nombres=? ,Direccion=? , Estado=? where IdCliente=?";     
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, cli.getDniC());
            ps.setString(2, cli.getNombresC());
            ps.setString(3, cli.getDireccionC());
            ps.setString(4, cli.getEstadoC());
            ps.setInt(5, cli.getIdC());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
    
    public void delete(int id){
        String sql="delete from cliente where IdCliente="+id;
        
        try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            
        } catch(Exception e){
            
        }
        
    }
    
    
    
    
}
