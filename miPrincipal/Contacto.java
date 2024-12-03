package miPrincipal;
import java.util.Objects;
public class Contacto implements Comparable<Contacto> {
    //atributos
    private int id;
    private String nombres;
    private String apellidos;
    
    public Contacto(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
       
    }
    public Contacto(int id,String nombres, String apellidos) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
       
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    @Override
    public String toString() {
        return  nombres + ", " + apellidos +  "\n";
    }
    @Override
    public int compareTo(Contacto o) {
        return this.nombres.compareTo(o.nombres);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Contacto contacto = (Contacto) obj;
        return Objects.equals(nombres, contacto.getNombres()) &&
            Objects.equals(apellidos, contacto.getApellidos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombres, apellidos);
    }
   


}