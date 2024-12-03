package miPrincipal;
import java.util.Comparator;

public class OrdShellSort<T extends Comparable<T>> {
	private final Comparator<T> criterio;
	public OrdShellSort(){
		this.criterio = null;
	}
	public OrdShellSort(Comparator<T> criterio){
		this.criterio = criterio;
	}
    
    public T[] ordenar(T[] arreglo) {
        int Tamaño = arreglo.length;
        int brecha = (Tamaño/2);
		while(brecha>0)
		{
			for(int recorrido=brecha;recorrido<Tamaño;recorrido++)
			{
				T buffer = arreglo[recorrido];
				int indice = recorrido;

				while(indice >= brecha && compare(arreglo[indice - brecha], buffer) > 0)
				{
					arreglo[indice]=arreglo[indice-brecha];
					indice -=brecha;
				}
				arreglo[indice]=buffer;
			}
			brecha = brecha/2;
		}
        return arreglo;
    }
	private int compare(T a, T b) {
		return (criterio == null) ? a.compareTo(b) : criterio.compare(a, b);
    }
}