package algoritmosOrdenamiento;


public class seleccion {
    static int cont1=0,cont2=0,interc=0;
    public static void main(String[] args){
        int lista[] = {8,5,9,7,2,6,4,1,3};
        System.out.print("Lista desordenada: \n");
        imprimirLista(lista);
        long inicio = System.nanoTime();
        ordenar(lista);
        long fin = System.nanoTime();
        double dif = (double)(fin - inicio)*1.0e-9;
        System.out.print("Lista ordenada: \n");
        imprimirLista(lista);
        System.out.println("Time: "+dif);
        System.out.println("Comp1: "+cont1);
        System.out.println("Comp1: "+cont2);
        System.out.println("Interc: "+interc);
    }
    
    public static void ordenar(int[] arreglo){
    for (int k = 0; k < arreglo.length - 1; k++){
        int min = k;
        for (int j = k + 1; j < arreglo.length; j++){
            interc++;
            if (arreglo[j] < arreglo[min]){
                cont1++;
                min = j;
            }
        }
        if (k != min){
            cont2++;
            int aux = arreglo[k];
            arreglo[k] = arreglo[min];
            arreglo[min] = aux;
        }else
            System.out.println("-->");
    }
}
    
    public static void imprimirLista(int[] arreglo){
        for(int i = 0; i < arreglo.length;i++){
            System.out.print(arreglo[i]+"\n");
        }
    System.out.println();
    }
}

