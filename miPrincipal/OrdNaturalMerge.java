package miPrincipal;
import java.lang.reflect.Array;
import java.util.Comparator;
public class OrdNaturalMerge<T extends Comparable<T>> {
	private final Comparator<T> criterio;
	public OrdNaturalMerge(){
		this.criterio = null;
	}
	public OrdNaturalMerge(Comparator<T> criterio){
		this.criterio = criterio;
	}
    public T[] mezclaNatural(T array[])
	{
		int izquierda=0,izq=0,derecha=array.length-1,der=derecha;
		boolean ordenado=false;
		do{
			ordenado=true;
			izquierda=0;
			while(izquierda<derecha)
			{
				izq=izquierda;
				while(izq<derecha && compare(array[izq], array[izq+1])<=0)
				{
					izq++;
				}
				der=izq+1;
				while(der==derecha-1 || der<derecha && compare(array[der],array[der+1])<=0)
				{
					der++;
				}
				if (der<=derecha)
				{
					mezclaDirecta(array);
					ordenado=false;
				}
				izquierda=izq;
			}
		}while (!ordenado);
		return array;
		
	}

	public T [] mezclaDirecta (T array[])
	{
		int i,j,k;
		if (array.length>1)
		{
			int nElementosIzq=array.length/2;
			int nElementosDer=array.length-nElementosIzq;
			//T arregloIzq[]=new T [nElementosIzq];
			//T arregloDer[]=new T [nElementosDer];

			T[] arregloIzq = (T[]) java.lang.reflect.Array.newInstance(array.getClass().getComponentType(), nElementosIzq);
			T[] arregloDer = (T[]) java.lang.reflect.Array.newInstance(array.getClass().getComponentType(), nElementosDer);
			//copiando los elementos de parte primera al arregloIzq
			for (i=0;i<nElementosIzq;i++)
			{
				arregloIzq[i]=array[i];
			}
			//copiando los elementos de parte segunda a arregloDer
			for (i=nElementosIzq;i<nElementosIzq+nElementosDer;i++)
			{
				arregloDer[i-nElementosIzq]=array[i];
			}
			arregloIzq = mezclaDirecta(arregloIzq);
			arregloDer = mezclaDirecta(arregloDer);
			i=0;
			j=0;
			k=0;
			while(arregloIzq.length != j && arregloDer.length!=k)
			{
		
				if(compare(arregloIzq[j],arregloDer[k])<0)
				{
					array[i]=arregloIzq[j];
					i++;
					j++;
				}
				else
				{
					array[i]=arregloDer[k];
					i++;
					k++;
				}
			}
			while (arregloIzq.length != j)
			{
				array[i] = arregloIzq[j];
				i++;
				j++;
			}
			while (arregloDer.length != k)
			{
				array[i]=arregloDer[k];
				i++;
				k++;
			}
		}//fin if
		return array;
	}
	private int compare(T a, T b) {
		return (criterio == null) ? a.compareTo(b) : criterio.compare(a, b);
    }
}