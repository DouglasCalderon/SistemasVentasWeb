package Modelo;

public class Producto {

    int IdProducto;
    String Nombres;
    double Precio;
    int Stock;
    String Estado;

    public Producto() {
    }

    public Producto(int IdProducto, String Nombres, double Precio, int Stock, String Estado) {
        this.IdProducto = IdProducto;
        this.Nombres = Nombres;
        this.Precio = Precio;
        this.Stock = Stock;
        this.Estado = Estado;
    }

    public int getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(int IdProducto) {
        this.IdProducto = IdProducto;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

}
