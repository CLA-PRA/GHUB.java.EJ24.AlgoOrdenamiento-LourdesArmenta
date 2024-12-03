package miPrincipal;
import java.util.Arrays;


public class OrdRadixSort {
 
    public Integer[] ordenar(Integer[] arreglo) {
        int maximo = obtenerMaximo(arreglo);
    
        for (int exp = 1; maximo / exp > 0; exp *= 10)
            ordenarPorCuenta(arreglo, exp);
    
        return arreglo;
    }
    
    private int obtenerMaximo(Integer[] arreglo) {
        int maximo = arreglo[0];
        for (int i = 1; i < arreglo.length; i++)
            if (arreglo[i] > maximo)
                maximo = arreglo[i];
        return maximo;
    }
    
    private void ordenarPorCuenta(Integer[] arreglo, int exp) {
        int n = arreglo.length;
        Integer[] salida = new Integer[n];
        int[] cuenta = new int[10];
        Arrays.fill(cuenta, 0);
    
        for (int i = 0; i < n; i++)
            cuenta[(arreglo[i] / exp) % 10]++;
    
        for (int i = 1; i < 10; i++)
            cuenta[i] += cuenta[i - 1];
    
        for (int i = n - 1; i >= 0; i--) {
            salida[cuenta[(arreglo[i] / exp) % 10] - 1] = arreglo[i];
            cuenta[(arreglo[i] / exp) % 10]--;
        }
    
        System.arraycopy(salida, 0, arreglo, 0, n);
    }
   
        
}

