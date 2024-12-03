package miPrincipal;
import java.util.Comparator;
public class OrdQuickSort<T extends Comparable<T>>{
    private final Comparator<T> criterio;
	public OrdQuickSort(){
		this.criterio = null;
	}
	public OrdQuickSort(Comparator<T> criterio){
		this.criterio = criterio;
	}
    public T[] ordenar(T[] array) {
        quickSort(array,0,array.length-1);
        return array;
    }
    private void quickSort(T[] array,int izq,int der) {
        T pivote=array[izq];
        int i=izq;
        int j=der;
        T aux;
        while(i<j) {
            while(compare(array[i],pivote)<=0 && i<j) i++;
            while(compare(array[j],pivote)>0) j--;
            if (i<j) {
                
                aux= array[i];
                array[i]=array[j];
                array[j]=aux;
            }
        }
        array[izq]=array[j];
        array[j]=pivote;
        if (izq<j-1)
            quickSort(array,izq,j-1);
        if (j+1<der)
            quickSort(array,j+1,der);
    }
    private int compare(T a, T b) {
        return (criterio == null) ? a.compareTo(b) : criterio.compare(a, b);
    }
   
}