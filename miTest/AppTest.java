package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;

class AppTest {
    @Test
    public void testOrdenamientoInsercionEntero() {
        // Preparación
        Integer [] arrayDesordenado = {5, 2, 4, 6, 1, 3};
        Integer [] arrayOrdenado = {1, 2, 3, 4, 5, 6};
        OrdInsercion<Integer> insercionSort = new OrdInsercion<Integer>();

        // Ejecución
        Integer [] resultado = insercionSort.ordenar(arrayDesordenado);

        // Verificación
        Assert.assertArrayEquals(arrayOrdenado, resultado);
    }
    @Test
    public void testOrdenamientoInsercionContacto() {
        // Preparación
        Contacto[] arrayDesordenado = {
            new Contacto("Carlos", "Perez"),
            new Contacto("Ana", "Dominguez"),
            new Contacto("Beto", "Cuevas")
        };
        Contacto[] arrayOrdenado = {
            new Contacto("Ana", "Dominguez"),
            new Contacto("Beto", "Cuevas"),
            new Contacto("Carlos", "Perez")
        };
        OrdInsercion<Contacto> insercionSort = new OrdInsercion<Contacto>();

        // Ejecución
        Contacto[] resultado = insercionSort.ordenar(arrayDesordenado);

        // Verificación
        assertArrayEquals(arrayOrdenado, resultado);
    }

    @Test
    public void testOrdenamientoSeleccionEntero() {
        // Preparación
        Integer [] arrayDesordenado = {5, 2, 4, 6, 1, 3};
        Integer [] arrayOrdenado = {1, 2, 3, 4, 5, 6};
        OrdSeleccion<Integer> seleccionSort = new OrdSeleccion<Integer>();

        // Ejecución
        Integer [] resultado = seleccionSort.ordenar(arrayDesordenado);

        // Verificación
        Assert.assertArrayEquals(arrayOrdenado, resultado);
    }
    @Test
    public void testOrdenamientoSeleccionContacto() {
        // Preparación
        Contacto[] arrayDesordenado = {
            new Contacto("Carlos", "Perez"),
            new Contacto("Ana", "Dominguez"),
            new Contacto("Beto", "Cuevas")
        };
        Contacto[] arrayOrdenado = {
            new Contacto("Ana", "Dominguez"),
            new Contacto("Beto", "Cuevas"),
            new Contacto("Carlos", "Perez")
        };
        OrdSeleccion<Contacto> seleccionSort = new OrdSeleccion<Contacto>();

        // Ejecución
        Contacto[] resultado = seleccionSort.ordenar(arrayDesordenado);

        // Verificación
        assertArrayEquals(arrayOrdenado, resultado);
        
    }

    @Test
    public void testOrdenamientoBurbujaEntero() {
        // Preparación
        Integer [] arrayDesordenado = {5, 2, 4, 6, 1, 3};
        Integer [] arrayOrdenado = {1, 2, 3, 4, 5, 6};
        OrdBurbuja<Integer> burbujaSort = new OrdBurbuja<Integer>();

        // Ejecución
        Integer [] resultado = burbujaSort.ordenar(arrayDesordenado);

        // Verificación
        Assert.assertArrayEquals(arrayOrdenado, resultado);
    }
    @Test
    public void testOrdenamientoBurbujaContacto() {
        // Preparación
        Contacto[] arrayDesordenado = {
            new Contacto("Carlos", "Perez"),
            new Contacto("Ana", "Dominguez"),
            new Contacto("Beto", "Cuevas")
        };
        Contacto[] arrayOrdenado = {
            new Contacto("Ana", "Dominguez"),
            new Contacto("Beto", "Cuevas"),
            new Contacto("Carlos", "Perez")
        };
        OrdBurbuja<Contacto> burbujaSort = new OrdBurbuja<Contacto>();
        // Ejecución
        Contacto[] resultado = burbujaSort.ordenar(arrayDesordenado);

        // Verificación
        assertArrayEquals(arrayOrdenado, resultado);
        
    }

    @Test
    public void testOrdenamientoQuickEntero() {
        // Preparación
        Integer [] arrayDesordenado = {5, 2, 4, 6, 1, 3};
        Integer [] arrayOrdenado = {1, 2, 3, 4, 5, 6};
        OrdQuickSort<Integer> quickSort = new OrdQuickSort<Integer>();

        // Ejecución
        Integer [] resultado = quickSort.ordenar(arrayDesordenado);

        // Verificación
        Assert.assertArrayEquals(arrayOrdenado, resultado);
    }
    @Test
    public void testOrdenamientoQuickContacto() {
        // Preparación
        Contacto[] arrayDesordenado = {
            new Contacto("Carlos", "Perez"),
            new Contacto("Ana", "Dominguez"),
            new Contacto("Beto", "Cuevas")
        };
        Contacto[] arrayOrdenado = {
            new Contacto("Ana", "Dominguez"),
            new Contacto("Beto", "Cuevas"),
            new Contacto("Carlos", "Perez")
        };
        OrdQuickSort<Contacto> quickSort = new OrdQuickSort<Contacto>();
        // Ejecución
        Contacto[] resultado = quickSort.ordenar(arrayDesordenado);

        // Verificación
        assertArrayEquals(arrayOrdenado, resultado);
        
    }

    @Test
    public void testOrdenamientoShellEntero() {
        // Preparación
        Integer [] arrayDesordenado = {5, 2, 4, 6, 1, 3};
        Integer [] arrayOrdenado = {1, 2, 3, 4, 5, 6};
        OrdShellSort<Integer> shellSort = new OrdShellSort<Integer>();

        // Ejecución
        Integer [] resultado = shellSort.ordenar(arrayDesordenado);

        // Verificación
        Assert.assertArrayEquals(arrayOrdenado, resultado);
    }
    @Test
    public void testOrdenamientoShellContacto() {
        // Preparación
        Contacto[] arrayDesordenado = {
            new Contacto("Carlos", "Perez"),
            new Contacto("Ana", "Dominguez"),
            new Contacto("Beto", "Cuevas")
        };
        Contacto[] arrayOrdenado = {
            new Contacto("Ana", "Dominguez"),
            new Contacto("Beto", "Cuevas"),
            new Contacto("Carlos", "Perez")
        };
        OrdShellSort<Contacto> shellSort = new OrdShellSort<Contacto>();
        // Ejecución
        Contacto[] resultado = shellSort.ordenar(arrayDesordenado);

        // Verificación
        assertArrayEquals(arrayOrdenado, resultado);
        
    }

    @Test
    public void testOrdenamientoRadix() {
        // Preparación
        Integer [] arrayDesordenado = {5, 2, 4, 6, 1, 3};
        Integer [] arrayOrdenado = {1, 2, 3, 4, 5, 6};
        OrdRadixSort radixSort = new OrdRadixSort();

        // Ejecución
        Integer [] resultado = radixSort.ordenar(arrayDesordenado);

        // Verificación
        Assert.assertArrayEquals(arrayOrdenado, resultado);
    }

    @Test
    public void testOrdenamientoMergeEntero() {
         // Preparación
         Integer[] arrayA = {1, 3, 5};
         Integer[] arrayB = {2, 4, 6};
         Integer[] arrayEsperado = {1, 2, 3, 4, 5, 6};
         OrdMergeSort<Integer> ordMergeSort = new OrdMergeSort<>();
 
         // Ejecución
         Integer[] resultado = ordMergeSort.ordenar(arrayA, arrayB);
 
         // Verificación
         Assert.assertArrayEquals(arrayEsperado, resultado);
    }
    @Test
    public void testOrdenamientoMergeContacto() {
        // Preparación
        Contacto[] arrayDesordenadoA = {
            new Contacto("Ana", "Dominguez"),
            new Contacto("Beto", "Cuevas"),
            new Contacto("Carlos", "Perez")
        };
        Contacto[] arrayDesordenadoB = {
            new Contacto("Babe", "Lopez"),
            new Contacto("Dulce", "Caramelo"),
            new Contacto("Zulema", "Mendoza")
          
        };
        Contacto[] arrayOrdenado = {
            new Contacto("Ana", "Dominguez"),
            new Contacto("Babe", "Lopez"),
            new Contacto("Beto", "Cuevas"),
            new Contacto("Carlos", "Perez"),
            new Contacto("Dulce", "Caramelo"),
            new Contacto("Zulema", "Mendoza"),
        };
        OrdMergeSort<Contacto> mergeSort = new OrdMergeSort<Contacto>();
        // Ejecución
        Contacto[] resultado = mergeSort.ordenar(arrayDesordenadoA, arrayDesordenadoB);

        // Verificación
        assertArrayEquals(arrayOrdenado, resultado);  
    }

    @Test
    public void testMezclaNaturalEntero() {
        // Preparación
        Integer[] arrayDesordenado = {5, 2, 4, 6, 1, 3};
        Integer[] arrayOrdenado = {1, 2, 3, 4, 5, 6};
        OrdNaturalMerge<Integer> ordNaturalMerge = new OrdNaturalMerge<>();

        // Ejecución
        Integer[] resultado = ordNaturalMerge.mezclaNatural(arrayDesordenado);

        // Verificación
        Assert.assertArrayEquals(arrayOrdenado, resultado);
    }
    @Test
    public void testMezclaNaturalContacto() {
        // Preparación
        Contacto[] arrayDesordenado = {
            new Contacto("Carlos", "Perez"),
            new Contacto("Ana", "Dominguez"),
            new Contacto("Zulema", "Mendoza"),
            new Contacto("Beto", "Cuevas"),
            new Contacto("Dulce", "Caramelo"),
            new Contacto("Babe", "Lopez"),
        };
        Contacto[] arrayOrdenado = {
            new Contacto("Ana", "Dominguez"),
            new Contacto("Babe", "Lopez"),
            new Contacto("Beto", "Cuevas"),
            new Contacto("Carlos", "Perez"),
            new Contacto("Dulce", "Caramelo"),
            new Contacto("Zulema", "Mendoza"),
        };
        OrdNaturalMerge<Contacto> ordNaturalMerge = new OrdNaturalMerge<>();
        
        // Ejecución
        Contacto[] resultado = ordNaturalMerge.mezclaNatural(arrayDesordenado);

        // Verificación
        assertArrayEquals(arrayOrdenado, resultado);
        
    }

    @Test
    public void testMezclaDirectaEntero() {
        // Preparación
        Integer[] arrayDesordenado = {5, 2, 4, 6, 1, 3};
        Integer[] arrayOrdenado = {1, 2, 3, 4, 5, 6};
        OrdNaturalMerge<Integer> ordNaturalMerge = new OrdNaturalMerge<>();

        // Ejecución
        Integer[] resultado = ordNaturalMerge.mezclaDirecta(arrayDesordenado);

        // Verificación
        Assert.assertArrayEquals(arrayOrdenado, resultado);
    }
    @Test
    public void testMezclaDirectaContacto() {
        // Preparación
        Contacto[] arrayDesordenado = {
            new Contacto("Carlos", "Perez"),
            new Contacto("Ana", "Dominguez"),
            new Contacto("Zulema", "Mendoza"),
            new Contacto("Beto", "Cuevas"),
            new Contacto("Dulce", "Caramelo"),
            new Contacto("Babe", "Lopez"),
        };
        Contacto[] arrayOrdenado = {
            new Contacto("Ana", "Dominguez"),
            new Contacto("Babe", "Lopez"),
            new Contacto("Beto", "Cuevas"),
            new Contacto("Carlos", "Perez"),
            new Contacto("Dulce", "Caramelo"),
            new Contacto("Zulema", "Mendoza"),
        };
        OrdNaturalMerge<Contacto> ordNaturalMerge = new OrdNaturalMerge<>();
        
        // Ejecución
        Contacto[] resultado = ordNaturalMerge.mezclaDirecta(arrayDesordenado);

        // Verificación
        assertArrayEquals(arrayOrdenado, resultado);
        
    }

    @Test
    public void testHeapSortEntero() {
        // Preparación
        Integer[] arrayDesordenado = {5, 2, 4, 6, 1, 3};
        Integer[] arrayOrdenado = {1, 2, 3, 4, 5, 6};
        OrdHeapSort<Integer> heapSort = new OrdHeapSort<>();

        // Ejecución
        Integer[] resultado = heapSort.ordenar(arrayDesordenado);

        // Verificación
        assertArrayEquals(arrayOrdenado, resultado);
    }
    @Test
    public void testHeapSortContacto() {
        // Preparación
        Contacto[] arrayDesordenado = {
            new Contacto("Carlos", "Perez"),
            new Contacto("Ana", "Dominguez"),
            new Contacto("Zulema", "Mendoza"),
            new Contacto("Beto", "Cuevas"),
            new Contacto("Dulce", "Caramelo"),
            new Contacto("Babe", "Lopez"),
        };
        Contacto[] arrayOrdenado = {
            new Contacto("Ana", "Dominguez"),
            new Contacto("Babe", "Lopez"),
            new Contacto("Beto", "Cuevas"),
            new Contacto("Carlos", "Perez"),
            new Contacto("Dulce", "Caramelo"),
            new Contacto("Zulema", "Mendoza"),
        };
        OrdHeapSort<Contacto> ordHeapSort = new OrdHeapSort<Contacto>();
        
        // Ejecución
        Contacto[] resultado = ordHeapSort.ordenar(arrayDesordenado);

        // Verificación
        assertArrayEquals(arrayOrdenado, resultado);
        
    }





    
    

    
}