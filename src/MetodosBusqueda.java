public class MetodosBusqueda {
    public static int busquedaSecuencial(int[] arreglo, int valorBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Comparacion "+ (i+1) + " se compara " + valorBuscado +" con " +arreglo[i] + " posicion "+i);
            if (arreglo[i] == valorBuscado) {
                System.out.println("Comparaciones: " +(i+1));
                return i;
            }
        }
        return -1;
    }

    public static int busquedaBinaria(int[] arr, int valorBuscar){

        int inicio = 0;
        int fin = arr.length - 1;
        int i = 0;

        while(inicio<=fin) {

            i++;

            int mitad = inicio + (fin-inicio) /2;

            System.out.println("Comparacion " + (i) + " : " + valorBuscar + " comparado con " + arr[mitad] + "  /  " + "posicion: " + mitad) ;

            if(arr[mitad] == valorBuscar) {
                System.out.println();
                System.out.println("Se necesitaron " + i + " Comparaciones");
                System.out.println();
                return mitad;
            } else if (arr[mitad] < valorBuscar) {
                inicio = mitad +1;
            }else {
                fin = mitad -1;
            }


        }
        System.out.println("No se ah encontrado el valor buscado...");
        return -1;


    }

    public void imprimirArreglo(int[] hola) {
        for (int i : hola) {
            System.out.print(i + " ");
            
        }
        System.out.println();

    }
}