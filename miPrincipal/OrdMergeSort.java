package miPrincipal;
import java.util.Comparator;;
public class OrdMergeSort<T extends Comparable<T>>{
	private final Comparator<T> criterio;
	public OrdMergeSort(){
		this.criterio = null;
	}
	public OrdMergeSort(Comparator<T> criterio){
		this.criterio = criterio;
	}
    public T[] ordenar(T[] ArregloA, T[] ArregloB) {
		
        
		int i, j, k;
        
		T[] ArregloC = (T[]) java.lang.reflect.Array.newInstance(ArregloA.getClass().getComponentType(), ArregloA.length + ArregloB.length);

		//repetir mientras los arreglos A y B tengan elementos que comparar
		for (i = j = k = 0; i < ArregloA.length && j < ArregloB.length; k++) {
			if(compare(ArregloA[i], ArregloB[j]) < 0){
                ArregloC[k] = ArregloA[i];
                i++;
			
			} else {
				ArregloC[k] = ArregloB[j];
				j++;
			}
		}
		//para aÒadir a arrelos c los elementos del arrglo A sobresaliente en caso de haberlos
		for (; i < ArregloA.length; i++, k++) {
			ArregloC[k] = ArregloA[i];
		}
		//para aÒadir a arrelos C los elementos del arrglo B sobresaliente en caso de haberlos
		for (; j < ArregloB.length; j++, k++) {
			ArregloC[k] = ArregloB[j];
		}
        return ArregloC;
	}
	private int compare(T a, T b) {
		return (criterio == null) ? a.compareTo(b) : criterio.compare(a, b);
    }
	
}