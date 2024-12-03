package miPrincipal;
import java.lang.reflect.*;
import java.util.Random;

public class OrdUtil<T extends Comparable<T>>{
    public T[] generarArray(Class<T> type, int n) {
        @SuppressWarnings("unchecked")
        T[] array = (T[]) Array.newInstance(type, n);
		int k = calcularLongitud(calcularCantidadDeDigitos(n));
		System.out.println("cantidad de digitos: "+k);
	
		System.out.println("Generando array de tipo: " + type.getName());
        for (int i = 0; i < array.length; i++) {
			
			if(type == Integer.class){
            	array[i] = type.cast(generateRandomInteger(k));
                //System.out.print(array[i] + " ");
			}
			else if(type == Contacto.class){
				array[i] = type.cast(generateRandomContacto(k));
				//System.out.print(array[i] + " ");
			}
        }
        System.out.println();
        return array;
	}

    public static Integer generateRandomInteger(int k) {
        Random random = new Random();
        return random.nextInt(k)+1;
    }
	public static Contacto generateRandomContacto(int k) {
		Random random = new Random();
		return new Contacto("Nombre"+random.nextInt(k)+1, "Apellido"+random.nextInt(k)+1);
		
	}
	public  void imprimirArray(T[] arreglo) {
		for(int i=0;i<arreglo.length;i++) {
			
			System.out.print(arreglo[i]+" ");
		}
		System.out.println();
	}
	public void primeros(T[] arreglo, int n) {
		for(int i=0;i<n;i++) {
			
			System.out.print(arreglo[i]+" ");
		}
		System.out.print("...");
		
	}
	public void ultimos(T[] arreglo, int n) {
		
		for(int i=arreglo.length-n;i<arreglo.length;i++) {
			
			System.out.print(arreglo[i]+" ");
		}
		System.out.println();
	}
	//calcula cantidad de digitos que tiene un número
	public int calcularCantidadDeDigitos(int numero) {
		if (numero == 0) {
			return 1;
		} else {
			return (int) (Math.log10(Math.abs(numero)) + 1);
		}
	}
	//calcula el número máximo que se puede formar con n digitos
	public int calcularLongitud(int digitos) {
		return (int) Math.pow(10, digitos) - 1;
	}


}