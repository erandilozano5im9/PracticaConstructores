package javaapplication2;

/**
 *
 * @author Alumno
 */
public class telefonos {

    public telefonos() {
 
    }

    private String marca;
    private String color;
    private int precio;
    private int noSerie;
    private String modelo;
    private boolean funda;
    private String comprador;
    private String compañia;
    private String vendedor;
    private int pixel;
    private String camara;

    
    
    public telefonos(String marca, String color){
        this.marca = marca;
        this.color = color;
    }
    public telefonos(int Precio, int NoSerie){
        this.precio = Precio;
        this.noSerie = NoSerie;
    }
    public telefonos(String Modelo, boolean Funda){
        this.modelo = Modelo;
        this.funda = Funda;
    }
    public telefonos(String Comprador, String Compañia, String Vendedor){
        this.comprador = Comprador;
        this.compañia = Compañia;
        this.vendedor = Vendedor;
    }
    public telefonos(int Pixel, String Camara){
        this.pixel = Pixel;
        this.camara = Camara;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getNoSerie() {
        return noSerie;
    }

    public void setNoSerie(int noSerie) {
        this.noSerie = noSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isFunda() {
        return funda;
    }

    public void setFunda(boolean funda) {
        this.funda = funda;
    }

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public int getPixel() {
        return pixel;
    }

    public void setPixel(int pixel) {
        this.pixel = pixel;
    }

    public String getCamara() {
        return camara;
    }

    public void setCamara(String camara) {
        this.camara = camara;
    }
    
    @Override
    public String toString() {
        return "telefonos{" + "marca=" + marca + ", color=" + color + ", precio=" + precio + ", noSerie=" + noSerie + ", modelo=" + modelo + ", funda=" + funda + ", comprador=" + comprador + ", compa\u00f1ia=" + compañia + ", vendedor=" + vendedor + ", pixel=" + pixel + ", camara=" + camara + '}';
    }
}
