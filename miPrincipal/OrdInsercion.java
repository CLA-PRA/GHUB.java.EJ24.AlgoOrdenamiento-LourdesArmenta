package miPrincipal;
import java.util.Comparator;

public class OrdInsercion<T extends Comparable<T>>{
	private final Comparator<T> criterio;
	public OrdInsercion(){
		this.criterio = null;
	}
	public OrdInsercion(Comparator<T> criterio){
		this.criterio = criterio;
	}
    public  T[] ordenar(T []a) {
		int i,j;
		T aux;
		for (i=1;i<a.length;i++) {
			/* indice j es para explorar la sublista a[i-1]...a[0]
			 * buscando la posición correcta del elemento destino */
			j=i;
			aux = a[i];
			//se localiza el punto de inserción explorando hacia abajo
			while (j>0 && compare(a[j-1], aux) > 0) {
                
				//desplazar elementos hacia arriba para hacer espacio
				a[j]=a[j-1];
				j--;
			}
			a[j]=aux;
		}
        return a;
	}
	
		
	private int compare(T a, T b) {
			return (criterio == null) ? a.compareTo(b) : criterio.compare(a, b);
	}
}

    

    

    
