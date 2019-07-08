
package CapaInstanciaDatos;


public class ProveedorI {
    
private String cod_prov;
private String nom_prov;
private String contacto;

    public ProveedorI() {
    }

    public ProveedorI(String cod_prov, String nom_prov, String contacto) {
        this.cod_prov = cod_prov;
        this.nom_prov = nom_prov;
        this.contacto = contacto;
    }

    public String getCod_prov() {
        return cod_prov;
    }

    public void setCod_prov(String cod_prov) {
        this.cod_prov = cod_prov;
    }

    public String getNom_prov() {
        return nom_prov;
    }

    public void setNom_prov(String nom_prov) {
        this.nom_prov = nom_prov;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    @Override
    public String toString() {
        return "ProveedorI{" + "cod_prov=" + cod_prov + ", nom_prov=" + nom_prov + ", contacto=" + contacto + '}';
    }


}
