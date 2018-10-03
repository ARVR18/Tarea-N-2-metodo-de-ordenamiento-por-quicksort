


package metquicksort;

/**
 *
 * @author Alex
 */
public class Algoritmoclaseordenado {
 
int i, j;

    public Algoritmoclaseordenado() {
        this.i = 0;
        this.j = 0;
       
    }

    public void quick(int[] arreglo, int primero, int ultimo) {

        int i, j, pivoteord, auxiliar;
        i = primero;
        j = ultimo;
       
        pivoteord = arreglo[(primero + ultimo) / 2];
       
        System.out.println("El Pivote del Odn es " + pivoteord);
        do {
            while (arreglo[i] < pivoteord) {
                i++;
            }
            while (arreglo[j] > pivoteord) {
                j--;

            }
            if (i <= j) {
                auxiliar = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = auxiliar;
                i++;
                j--;
            }
        } 
        
        while (i <= j);
        if
                (primero < j) {
            quick(arreglo, primero, j);

        }
        if 
                (i < ultimo) {
            quick(arreglo, i, ultimo);
        }
        mostrarArreglo(arreglo);
    }

    public void mostrarArreglo(int[] arreglo) {
        int a;
        for (a = 0;a < arreglo.length;a++)
        {
            //impresion del arreglo
            System.out.print("[" + arreglo[a] + "]");

        }
        
        
        System.out.println();
    }

}
    
    