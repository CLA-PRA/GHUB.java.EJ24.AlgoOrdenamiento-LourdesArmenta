package miPrincipal;
import java.util.Arrays;
import java.util.Scanner;
public class AppComparacion {
    public static void menu(){
        OrdUtil<Integer> ordUtil = new OrdUtil<>();

        Performance performance = new Performance();
        int n;
       
        OrdInsercion<Integer> ordInsercion = new OrdInsercion<Integer>();
        OrdSeleccion<Integer> ordSeleccion = new OrdSeleccion<Integer>();
        OrdBurbuja<Integer> ordBurbuja = new OrdBurbuja<Integer>();

        OrdQuickSort<Integer> ordQuickSort = new OrdQuickSort<Integer>();

        OrdShellSort<Integer> ordShellSort = new OrdShellSort<Integer>();

        OrdRadixSort ordRadixSort = new OrdRadixSort();
        
        OrdMergeSort<Integer> ordMergeSort = new OrdMergeSort<Integer>();
        OrdNaturalMerge<Integer> ordNaturalMerge = new OrdNaturalMerge<Integer>();
        OrdHeapSort<Integer> ordHeapSort = new OrdHeapSort<Integer>();

        String []nombreAlgoritmos={"Insercion","Seleccion","Burbuja","QuickSort","ShellSort","RadixSort","MergeSort","NaturalMerge","MezclaDirecta","HeapSort"};
        long tiempoEjecucion[]=new long[nombreAlgoritmos.length];

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Proporciona cantidad de elementos a Ordenar");
            while (!sc.hasNextInt()) {
                System.out.println("Eso no es un número entero. Inténtalo de nuevo.");
                sc.next(); // descarta la entrada incorrecta
            }
            n = sc.nextInt();
        } while (n <= 0);

        Integer[] arregloDesordenado = ordUtil.generarArray(Integer.class,n);
        int k= (n<10?n:10);
        Integer[] arregloOrdenado;

        
        Integer[] copia1ArregloDesordenado = Arrays.copyOf(arregloDesordenado, arregloDesordenado.length);
        imprimirPimerosUltimos(copia1ArregloDesordenado,k);
        performance.start();
        arregloOrdenado= ordInsercion.ordenar(arregloDesordenado);
        performance.stop();
        System.out.print(nombreAlgoritmos[0]+": ");
        System.out.println(performance);
        tiempoEjecucion[0]=performance.getMillis();
        imprimirPimerosUltimos(arregloOrdenado,k);
        System.out.println();

        Integer[] copia2ArregloDesordenado = Arrays.copyOf(copia1ArregloDesordenado, copia1ArregloDesordenado.length);
        imprimirPimerosUltimos(copia2ArregloDesordenado,k);
        performance.start();
        arregloOrdenado= ordSeleccion.ordenar(copia1ArregloDesordenado);
        performance.stop();
        System.out.print(nombreAlgoritmos[1]+": ");
        System.out.println(performance);
        tiempoEjecucion[1]=performance.getMillis();
        imprimirPimerosUltimos(arregloOrdenado,k);
        System.out.println();

        Integer[] copia3ArregloDesordenado = Arrays.copyOf(copia2ArregloDesordenado, copia2ArregloDesordenado.length);
        imprimirPimerosUltimos(copia3ArregloDesordenado,k);
        performance.start();
        arregloOrdenado= ordBurbuja.ordenar(copia2ArregloDesordenado);
        performance.stop();
        System.out.print(nombreAlgoritmos[2]+": ");
        System.out.println(performance);
        tiempoEjecucion[2]=performance.getMillis();
        imprimirPimerosUltimos(arregloOrdenado,k);
        System.out.println();

        Integer[] copia4ArregloDesordenado = Arrays.copyOf(copia3ArregloDesordenado, copia3ArregloDesordenado.length);
        imprimirPimerosUltimos(copia4ArregloDesordenado,k);
        performance.start();
        arregloOrdenado= ordQuickSort.ordenar(copia3ArregloDesordenado);
        performance.stop();
        System.out.print(nombreAlgoritmos[3]+": ");
        System.out.println(performance);
        tiempoEjecucion[3]=performance.getMillis();
        imprimirPimerosUltimos(arregloOrdenado,k);
        System.out.println();

        Integer[] copia5ArregloDesordenado = Arrays.copyOf(copia4ArregloDesordenado, copia4ArregloDesordenado.length);
        imprimirPimerosUltimos(copia4ArregloDesordenado,k);
        performance.start();
        arregloOrdenado= ordShellSort.ordenar(copia4ArregloDesordenado);
        performance.stop();
        System.out.print(nombreAlgoritmos[4]+": ");
        System.out.println(performance);
        tiempoEjecucion[4]=performance.getMillis();
        imprimirPimerosUltimos(arregloOrdenado,k);
        System.out.println();

        Integer[] copia6ArregloDesordenado = Arrays.copyOf(copia5ArregloDesordenado, copia5ArregloDesordenado.length);
        imprimirPimerosUltimos(copia5ArregloDesordenado,k);
        performance.start();
        arregloOrdenado= ordRadixSort.ordenar(copia5ArregloDesordenado);
        performance.stop();
        System.out.print(nombreAlgoritmos[5]+": ");
        System.out.println(performance);
        tiempoEjecucion[5]=performance.getMillis();
        imprimirPimerosUltimos(arregloOrdenado,k);
        System.out.println();


        Integer[] copia7ArregloDesordenado = Arrays.copyOf(copia6ArregloDesordenado, copia6ArregloDesordenado.length);
        imprimirPimerosUltimos(copia6ArregloDesordenado,k);
        Integer[] primeraMitad = Arrays.copyOfRange(copia7ArregloDesordenado, 0, n/2);
        Integer[] segundaMitad = Arrays.copyOfRange(copia7ArregloDesordenado, n/2, n);
        //se deben ordenar primero y luego solo mezcclar
        //lo ordene con quicksort
        performance.start();
        primeraMitad = ordQuickSort.ordenar(primeraMitad);
        segundaMitad = ordQuickSort.ordenar(segundaMitad);

        arregloOrdenado= ordMergeSort.ordenar(primeraMitad, segundaMitad);
        performance.stop();
        System.out.print(nombreAlgoritmos[6]+": ");
        System.out.println(performance);
        tiempoEjecucion[6]=performance.getMillis();
        imprimirPimerosUltimos(arregloOrdenado,k);
        System.out.println();

        Integer[] copia9ArregloDesordenado = Arrays.copyOf(copia6ArregloDesordenado, copia6ArregloDesordenado.length);
        imprimirPimerosUltimos(copia6ArregloDesordenado,k);
        performance.start();
        arregloOrdenado= ordNaturalMerge.mezclaNatural(copia6ArregloDesordenado);
        performance.stop();
        System.out.print(nombreAlgoritmos[7]+": ");
        System.out.println(performance);
        tiempoEjecucion[7]=performance.getMillis();
        imprimirPimerosUltimos(arregloOrdenado,k);
        System.err.println();

        Integer[] copia10ArregloDesordenado = Arrays.copyOf(copia9ArregloDesordenado, copia9ArregloDesordenado.length);
        imprimirPimerosUltimos(copia9ArregloDesordenado,k);
        performance.start();
        arregloOrdenado= ordNaturalMerge.mezclaDirecta(copia9ArregloDesordenado);
        performance.stop();
        System.out.print(nombreAlgoritmos[8]+": ");
        System.out.println(performance);
        tiempoEjecucion[8]=performance.getMillis();
        imprimirPimerosUltimos(arregloOrdenado,k);
        System.err.println();

        Integer[] copia11ArregloDesordenado = Arrays.copyOf(copia10ArregloDesordenado, copia10ArregloDesordenado.length);
        imprimirPimerosUltimos(copia10ArregloDesordenado,k);
        performance.start();
        arregloOrdenado= ordHeapSort.ordenar(copia10ArregloDesordenado);
        performance.stop();
        System.out.print(nombreAlgoritmos[9]+": ");
        System.out.println(performance);
        tiempoEjecucion[9]=performance.getMillis();
        imprimirPimerosUltimos(arregloOrdenado,k);
        System.err.println();

        System.out.println("******************** RESUMEN ********+++*************");
        System.out.println("Tiempo de ejecución de los algoritmos de ordenamiento");
        System.out.println("para una n="+n+" elementos");
        for (int i = 0; i < nombreAlgoritmos.length; i++) {
            //System.out.print(nombreAlgoritmos[i]+": "+tiempoEjecucion[i]+" milisegundos");
            System.out.printf("%s:\t%5d milisegundos%n", nombreAlgoritmos[i], tiempoEjecucion[i]);
        }
    }
    public  static <T extends Comparable<T>> void imprimirPimerosUltimos(T[] arreglo, int n){
        OrdUtil<T> ordUtil = new OrdUtil<T>();


        System.out.println("Primeros y Últimos 10 elementos: ");
        ordUtil.primeros(arreglo,n);
       
        ordUtil.ultimos(arreglo,n);

    }
}