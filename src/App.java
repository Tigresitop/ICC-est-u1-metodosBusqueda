public class App {
    public static void main(String[] args) throws Exception {
        Busquedas metodosBusquedas = new Busquedas();
        
        int[] arregloCienMil = new int[100000];

        for (int i=0; i<100000; i++) {
            arregloCienMil[i] = i;
        }
        
        

        int mb = 650;

        System.out.println();

        System.out.println("BUSQUEDA SECUENCIAL");
        System.out.println();

        long startTimeSecuencial = System.nanoTime();
        int posicion = MetodosBusqueda.busquedaSecuencial(arregloCienMil, mb);
        long endTimeSecuencial = System.nanoTime();

        if(posicion == -1){
            System.out.println("Valor no encontrado");
        }else {
            System.out.println("El numero " + mb + " se encuentra en la posicion " + posicion);

        }

        System.out.println();
        System.out.println("BUSQUEDA BINARIA    ");
        System.out.println();

        long startTimeBinario = System.nanoTime();
        int posicionxd = MetodosBusqueda.busquedaBinaria(arregloCienMil, mb);
        long endTimeBinario = System.nanoTime();

        if(posicion == -1){
            System.out.println("Valor no encontrado");
        }else {
            System.out.println("El numero " + mb + " se encuentra en la posicion " + posicionxd);

        }
        System.out.println();


        System.out.println("Duracion de BUSQUEDA SECUENCIAL en nanosegundos: " + (endTimeSecuencial - startTimeSecuencial));
        System.out.println();
        System.out.println("Duracion de BUSQUEDA BINARIO en nanosegundos: " + (endTimeBinario - startTimeBinario));

    
    }
}
