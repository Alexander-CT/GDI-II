
package CapaInstanciaDatos;


public class ComprobanteI {
    private String cod_comprobante;
private String tipo;
private String cod_cli;
private String cod_emp;
private String fecha;
private double total;

    public ComprobanteI() {
    }

    public ComprobanteI(String cod_comprobante, String tipo, String cod_cli, String cod_emp, String fecha, double total) {
        this.cod_comprobante = cod_comprobante;
        this.tipo = tipo;
        this.cod_cli = cod_cli;
        this.cod_emp = cod_emp;
        this.fecha = fecha;
        this.total = total;
    }

    public String getCod_comprobante() {
        return cod_comprobante;
    }

    @Override
    public String toString() {
        return "ComprobanteI{" + "cod_comprobante=" + cod_comprobante + ", tipo=" + tipo + ", cod_cli=" + cod_cli + ", cod_emp=" + cod_emp + ", fecha=" + fecha + ", total=" + total + '}';
    }

    public void setCod_comprobante(String cod_comprobante) {
        this.cod_comprobante = cod_comprobante;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCod_cli() {
        return cod_cli;
    }

    public void setCod_cli(String cod_cli) {
        this.cod_cli = cod_cli;
    }

    public String getCod_emp() {
        return cod_emp;
    }

    public void setCod_emp(String cod_emp) {
        this.cod_emp = cod_emp;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }





}
