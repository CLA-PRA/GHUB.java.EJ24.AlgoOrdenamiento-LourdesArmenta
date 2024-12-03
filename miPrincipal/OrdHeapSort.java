package miPrincipal;
import java.util.Comparator;

public class OrdHeapSort<T extends Comparable<T>> {
    private final Comparator<T> criterio;
	public OrdHeapSort(){
		this.criterio = null;
	}
	public OrdHeapSort(Comparator<T> criterio){
		this.criterio = criterio;
	}
    public T[] ordenar(T[] arreglo) {
        int tamaño = arreglo.length;
        for (int i = tamaño / 2 - 1; i >= 0; i--)
            convertirEnHeap(arreglo, tamaño, i);
        for (int i = tamaño - 1; i >= 0; i--) {
            T temp = arreglo[0];
            arreglo[0] = arreglo[i];
            arreglo[i] = temp;
            convertirEnHeap(arreglo, i, 0);
        }
        return arreglo;
    }

    void convertirEnHeap(T[] arreglo, int tamaño, int i) {
        int mayor = i;
        int izq = 2 * i + 1;
        int der = 2 * i + 2;
        if (izq < tamaño && compare(arreglo[izq], arreglo[mayor]) > 0)
            mayor = izq;
        if(der < tamaño && compare(arreglo[der], arreglo[mayor]) > 0)
            mayor = der;
        if (mayor != i) {   
            T swap = arreglo[i];
            arreglo[i] = arreglo[mayor];
            arreglo[mayor] = swap;
            convertirEnHeap(arreglo, tamaño, mayor);
        }
    }
    private int compare(T a, T b) {
        return (criterio == null) ? a.compareTo(b) : criterio.compare(a, b);
    }

}