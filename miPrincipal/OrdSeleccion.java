package miPrincipal;
import java.util.Comparator;
public class OrdSeleccion<T extends Comparable<T>>{
	private final Comparator<T> criterio;
	public OrdSeleccion(){
		this.criterio = null;
	}
	public OrdSeleccion(Comparator<T> criterio){
		this.criterio = criterio;
	}
    public T[] ordenar(T a[]) {
		int indiceMenor,i,j,n;
		n=a.length;
		for (i=0;i<n-1;i++) {
			//comienza la exploracion en índice i
			indiceMenor = i;
			//j explora la sublista a[i+1] ... a[n-1]
			for(j=i+1;j<n;j++)
				if(compare(a[j],a[indiceMenor])<0)
					indiceMenor=j;
			//situa el elemento mas pequeño en a[i]
			if (i !=indiceMenor)
				intercambiar(a,i,indiceMenor);
			
		}
        return a;
		
	}
	private void intercambiar(T []a,int i,int j) {
		T aux = a[i];
		a[i]=a[j];
		a[j]=aux;
	}
	private int compare(T a, T b) {
		return (criterio == null) ? a.compareTo(b) : criterio.compare(a, b);
}
	
}