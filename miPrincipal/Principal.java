package miPrincipal;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) throws Exception {
        Scanner consola = new Scanner(System.in);
        int opc =0;
        final int n = 10;

        OrdUtil<Integer> entero;
        OrdUtil<Contacto> contacto;

        OrdInsercion<Integer> oEnteroIns;
        OrdInsercion<Contacto> oContactoIns;

        OrdSeleccion<Integer> oEnteroSel;
        OrdSeleccion<Contacto> oContactoSel;

        OrdBurbuja<Integer> oEnteroBur;
        OrdBurbuja<Contacto> oContactoBur;

        OrdQuickSort<Integer> oEnteroQui;
        OrdQuickSort<Contacto> oContactoQui;

        OrdShellSort<Integer> oEnteroShe;
        OrdShellSort<Contacto> oContactoShe;

        OrdRadixSort oEnteroRad;

        OrdMergeSort<Integer> oEnteroMer;
        OrdMergeSort<Contacto> oContactoMer;

        OrdNaturalMerge<Integer> oEnteroNat;
        OrdNaturalMerge<Contacto> oContactoNat;

        OrdHeapSort<Integer> oEnteroHeap;
        OrdHeapSort<Contacto> oContactoHeap;

        Integer[] arregloDesordenadoEnteros;
        Contacto[] arregloDesordenadoContactos;
        Contacto[] copiaContactos;
        Contacto[] copiaContactosC;
         Contacto[] copiaContactosD;

        do{
            System.out.println("*************************+*******");
            System.out.println("          ORDENAMIENTO           ");
            System.out.println("*********************************");
            System.out.println(" 1) Inserción                    ");
            System.out.println(" 2) Selección                    ");
            System.out.println(" 3) Burbuja (Intercambio)        ");  
            System.out.println(" 4) QuickSort                    ");
            System.out.println(" 5) ShellSort                    ");
            System.out.println(" 6) RadixSort (Solo Enteros)     ");   
            System.out.println(" 7) MergeSort (Intercalación)    ");
            System.out.println(" 8) Mezcla Directa               ");
            System.out.println(" 9) NaturalSort (Mezcla Natural) ");
            System.out.println("10) HeapSort  (Monticulos)       ");
            System.out.println("11) Comparación de algoritmos    ");
            System.out.println("                                 ");
            System.out.println("0) SALIR                         ");
            System.out.print("Selecciona opción:");
            opc=consola.nextInt();

            switch (opc){
            case 1:
               //Ordenamiento por Inserción de forma natural
               oEnteroIns = new OrdInsercion<Integer>();
               entero = new OrdUtil<Integer>();
               arregloDesordenadoEnteros= entero.generarArray(Integer.class, n);
               entero.imprimirArray(oEnteroIns.ordenar(arregloDesordenadoEnteros));
              
               //Ordenamiento por Inserción con criterio de comparación Natural por Nombre
               oContactoIns = new OrdInsercion<Contacto>();
               contacto = new OrdUtil<Contacto>();
               arregloDesordenadoContactos=contacto.generarArray(Contacto.class, n);
               copiaContactos = arregloDesordenadoContactos.clone();
               contacto.imprimirArray(oContactoIns.ordenar(arregloDesordenadoContactos));

               //Ordenamiento por Inserción con criterio de comparación Personalizado por Apellido
               oContactoIns = new OrdInsercion<Contacto>(new CriterioContactoApellido());
               contacto.imprimirArray(oContactoIns.ordenar(copiaContactos));
               
               break;
            case 2:
               //Ordenamiento por Selección de forma natural
               oEnteroSel = new OrdSeleccion<Integer>();
               entero = new OrdUtil<Integer>();
               arregloDesordenadoEnteros= entero.generarArray(Integer.class, n);
               entero.imprimirArray(oEnteroSel.ordenar(arregloDesordenadoEnteros));

               //Ordenamiento por Selección con criterio de comparación Natural por Nombre
               oContactoSel = new OrdSeleccion<Contacto>();
               contacto = new OrdUtil<Contacto>();
               arregloDesordenadoContactos=contacto.generarArray(Contacto.class, n);
               copiaContactos = arregloDesordenadoContactos.clone();
               contacto.imprimirArray(oContactoSel.ordenar(arregloDesordenadoContactos) ) ;

               //Ordenamiento por Selección con criterio de comparación Personalizado por Apellido
               oContactoSel = new OrdSeleccion<Contacto>(new CriterioContactoApellido());
               contacto.imprimirArray(oContactoSel.ordenar(copiaContactos));
               
               break;
            case 3:
               //Ordenamiento por Burbuja de forma natural
               oEnteroBur = new OrdBurbuja<Integer>();
               entero = new OrdUtil<Integer>();
               arregloDesordenadoEnteros=entero.generarArray(Integer.class, n);
               entero.imprimirArray(oEnteroBur.ordenar(arregloDesordenadoEnteros));

               //Ordenamiento por Burbuja con criterio de comparación Natural por Nombre
               oContactoBur = new OrdBurbuja<Contacto>();
               contacto = new OrdUtil<Contacto>();
               arregloDesordenadoContactos=contacto.generarArray(Contacto.class, n);
               copiaContactos = arregloDesordenadoContactos.clone();
               contacto.imprimirArray(oContactoBur.ordenar(arregloDesordenadoContactos));

               //Ordenamiento por Burbuja con criterio de comparación Personalizado por Apellido
               oContactoBur = new OrdBurbuja<Contacto>(new CriterioContactoApellido());
               contacto.imprimirArray(oContactoBur.ordenar(copiaContactos));
              
               break;
            case 4:
               //Ordenamiento por QuickSort de forma natural
               oEnteroQui = new OrdQuickSort<Integer>();
               entero = new OrdUtil<Integer>();
               arregloDesordenadoEnteros=entero.generarArray(Integer.class, n);
               entero.imprimirArray(oEnteroQui.ordenar(arregloDesordenadoEnteros));

               //Ordenamiento por QuickSort con criterio de comparación Natural por Nombre
               oContactoQui = new OrdQuickSort<Contacto>();  
               contacto = new OrdUtil<Contacto>();
               arregloDesordenadoContactos=contacto.generarArray(Contacto.class, n);
               copiaContactos = arregloDesordenadoContactos.clone();
               contacto.imprimirArray(oContactoQui.ordenar(arregloDesordenadoContactos));

               //Ordenamiento por QuickSort con criterio de comparación Personalizado por Apellido
               oContactoQui = new OrdQuickSort<Contacto>(new CriterioContactoApellido());
               contacto.imprimirArray(oContactoQui.ordenar(copiaContactos));
               break;
           
            case 5:
               oEnteroShe = new OrdShellSort<Integer>();
               entero = new OrdUtil<Integer>();
               arregloDesordenadoEnteros=entero.generarArray(Integer.class, n);
               entero.imprimirArray(oEnteroShe.ordenar(arregloDesordenadoEnteros));

               oContactoShe = new OrdShellSort<Contacto>();
               contacto = new OrdUtil<Contacto>();
               arregloDesordenadoContactos=contacto.generarArray(Contacto.class, n);
               copiaContactos = arregloDesordenadoContactos.clone();
               contacto.imprimirArray(oContactoShe.ordenar(arregloDesordenadoContactos));

               oContactoShe = new OrdShellSort<Contacto>(new CriterioContactoApellido());
               contacto.imprimirArray(oContactoShe.ordenar(copiaContactos));
               break;
            case 6:
               oEnteroRad = new OrdRadixSort();
               entero = new OrdUtil<Integer>();
               entero.generarArray(Integer.class, n);
               entero.imprimirArray(oEnteroRad.ordenar(entero.generarArray(Integer.class, n)));
               break;
            case 7:
               //Ordenamiento por MergeSort de forma natural
               oEnteroQui = new OrdQuickSort<Integer>();
               entero = new OrdUtil<Integer>();
               Integer [] a =oEnteroQui.ordenar(entero.generarArray(Integer.class, 5));
               Integer [] b =oEnteroQui.ordenar(entero.generarArray(Integer.class, 5));
               entero.imprimirArray(a);
               entero.imprimirArray(b);
               oEnteroMer = new OrdMergeSort<Integer>();
               entero = new OrdUtil<Integer>();
               entero.imprimirArray(oEnteroMer.ordenar(a,b));

               //Ordenamiento por MergeSort con criterio de comparación Natural por Nombre
               oContactoQui = new OrdQuickSort<Contacto>();
               contacto = new OrdUtil<Contacto>();
               Contacto [] c =oContactoQui.ordenar(contacto.generarArray(Contacto.class, 5));
               Contacto [] d =oContactoQui.ordenar(contacto.generarArray(Contacto.class, 5));
               copiaContactosC= c.clone();
               copiaContactosD= d.clone();
               contacto.imprimirArray(c);
               contacto.imprimirArray(d);

               oContactoMer = new OrdMergeSort<Contacto>();
               contacto = new OrdUtil<Contacto>();
               contacto.imprimirArray(oContactoMer.ordenar(c,d));

               //Ordenamiento por MergeSort con criterio de comparación Personalizado por Apellido
               oContactoQui = new OrdQuickSort<Contacto>(new CriterioContactoApellido());
               contacto.imprimirArray(oContactoQui.ordenar(copiaContactosC));
               contacto.imprimirArray(oContactoQui.ordenar(copiaContactosD));

               oContactoMer = new OrdMergeSort<Contacto>(new CriterioContactoApellido());
               contacto = new OrdUtil<Contacto>();
               contacto.imprimirArray(oContactoMer.ordenar(copiaContactosC,copiaContactosD));
   
               break;
            case 8:
               //Ordenamiento por Mezcla Directa de forma natural
               oEnteroNat = new OrdNaturalMerge<Integer>();
               entero = new OrdUtil<Integer>();
               arregloDesordenadoEnteros=entero.generarArray(Integer.class, n);
               entero.imprimirArray(oEnteroNat.mezclaDirecta(arregloDesordenadoEnteros));

               //Ordenamiento por Mezcla Directa con criterio de comparación Natural por Nombre
               oContactoNat = new OrdNaturalMerge<Contacto>();
               contacto = new OrdUtil<Contacto>();
               arregloDesordenadoContactos=contacto.generarArray(Contacto.class, n);
               copiaContactos = arregloDesordenadoContactos.clone();
               contacto.imprimirArray(oContactoNat.mezclaDirecta(arregloDesordenadoContactos));

               //ordenamiento por Mezcla Directa con criterio de comparación Personalizado por Apellido
               oContactoNat = new OrdNaturalMerge<Contacto>(new CriterioContactoApellido());
               contacto.imprimirArray(oContactoNat.mezclaDirecta(copiaContactos));
    
               break;
            case 9:
               //Ordenamiento por Mezcla Natural de forma natural
               oEnteroNat = new OrdNaturalMerge<Integer>();
               entero = new OrdUtil<Integer>();
               arregloDesordenadoEnteros=entero.generarArray(Integer.class, n);
               entero.imprimirArray(oEnteroNat.mezclaNatural(arregloDesordenadoEnteros));

               //Ordenamiento por Mezcla Natural con criterio de comparación Natural por Nombre
               oContactoNat = new OrdNaturalMerge<Contacto>();
               contacto = new OrdUtil<Contacto>();
               arregloDesordenadoContactos=contacto.generarArray(Contacto.class, n);
               copiaContactos = arregloDesordenadoContactos.clone();
               contacto.imprimirArray(oContactoNat.mezclaNatural(arregloDesordenadoContactos));

               //Ordenamiento por Mezcla Natural con criterio de comparación Personalizado por Apellido
               oContactoNat = new OrdNaturalMerge<Contacto>(new CriterioContactoApellido());
               contacto.imprimirArray(oContactoNat.mezclaNatural(copiaContactos));
               break;
            
            case 10:
               //Ordenamiento por HeapSort de forma natural
               oEnteroHeap = new OrdHeapSort<Integer>();
               entero = new OrdUtil<Integer>();
               arregloDesordenadoEnteros=entero.generarArray(Integer.class, n);
               entero.imprimirArray(oEnteroHeap.ordenar(arregloDesordenadoEnteros));

               //Ordenamiento por HeapSort con criterio de comparación Natural por Nombre
               oContactoHeap = new OrdHeapSort<Contacto>();
               contacto = new OrdUtil<Contacto>();
               arregloDesordenadoContactos=contacto.generarArray(Contacto.class, n);
               copiaContactos = arregloDesordenadoContactos.clone();
               contacto.imprimirArray(oContactoHeap.ordenar(arregloDesordenadoContactos));

               //Ordenamiento por HeapSort con criterio de comparación Personalizado por Apellido
               oContactoHeap = new OrdHeapSort<Contacto>(new CriterioContactoApellido());
               contacto.imprimirArray(oContactoHeap.ordenar(copiaContactos));

               break;

            case 11:
               AppComparacion.menu();
               break;


         

            
            case 0:
               System.out.println("ADIOS!");
               consola.close();
               break;
            default:
               System.out.println("Valor incorrecto, intente de nuevo!");
        }
       
    }while (opc != 0);
		
   }
}