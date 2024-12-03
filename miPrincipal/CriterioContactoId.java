package miPrincipal;
import java.util.Comparator;

public class CriterioContactoId implements Comparator<Contacto>{
    @Override
    public int compare(Contacto contacto1, Contacto contacto2) {
        return contacto1.getId() - contacto2.getId();
    }
    
}
