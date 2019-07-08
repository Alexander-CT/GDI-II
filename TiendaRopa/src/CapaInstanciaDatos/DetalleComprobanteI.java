
package CapaInstanciaDatos;

public class DetalleComprobanteI {
    
    
    private String cod_comprobante;
private String cod_pro;
private Double precio;
private int cant;

    public DetalleComprobanteI() {
    }

    public DetalleComprobanteI(String cod_comprobante, String cod_pro, Double precio, int cant) {
        this.cod_comprobante = cod_comprobante;
        this.cod_pro = cod_pro;
        this.precio = precio;
        this.cant = cant;
    }

    public String getCod_comprobante() {
        return cod_comprobante;
    }

    public void setCod_comprobante(String cod_comprobante) {
        this.cod_comprobante = cod_comprobante;
    }

    public String getCod_pro() {
        return cod_pro;
    }

    public void setCod_pro(String cod_pro) {
        this.cod_pro = cod_pro;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    @Override
    public String toString() {
        return "DetalleComprobanteI{" + "cod_comprobante=" + cod_comprobante + ", cod_pro=" + cod_pro + ", precio=" + precio + ", cant=" + cant + '}';
    }


}
