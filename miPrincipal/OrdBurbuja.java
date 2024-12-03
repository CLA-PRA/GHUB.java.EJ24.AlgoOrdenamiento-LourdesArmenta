package miPrincipal;
import java.util.Comparator;

public class OrdBurbuja <T extends Comparable<T>>{
	private final Comparator<T> criterio;
	public OrdBurbuja(){
		this.criterio = null;
	}
	public OrdBurbuja(Comparator<T> criterio){
		this.criterio = criterio;
	}

	public T[] ordenar(T[] array) {
		for (int i=array.length-1;i>0;i--){
			for (int j=0;j<i;j++) {
				if (compare(array[j],array[j+1])>0){
				
					intercambiar(array,j,j+1);
				}
				
			}
		
		}

		return array;
	}
		
	private void intercambiar(T[] array,int a,int b) {
		T value = array[b];
		array[b]=array[a];
		array[a]=value;
	}

	private int compare(T a, T b) {
		return (criterio == null) ? a.compareTo(b) : criterio.compare(a, b);
    } 
	

		
}