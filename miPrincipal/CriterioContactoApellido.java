package miPrincipal;

import java.util.Comparator;

public class CriterioContactoApellido  implements Comparator<Contacto> {
    
    @Override
    public int compare(Contacto contacto1, Contacto contacto2) {
        return contacto1.getApellidos().compareTo(contacto2.getApellidos());
    }
}
    

