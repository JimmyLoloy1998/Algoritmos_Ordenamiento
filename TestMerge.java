package algoritmosOrdenamiento;

import java.util.Scanner;

public class TestMerge {
    public static void main(String[] args) {
        System.out.print("Digite la cantidad de elementos: ");
        Scanner sc = new Scanner(System.in);

        int cantidad = sc.nextInt();
        int[] arreglo = new int[cantidad];

        System.out.println("Digite los numeros que desea ordenar:");
        for(int i=0; i<cantidad; i++)
            arreglo[i] = sc.nextInt();

        mergeCall(arreglo);
        sc.close();
        for(int i:arreglo)
            System.out.println(i);
    }
	
    static void mergeCall(int[] arreglo){
        int size = arreglo.length;
        if(size> 1){
            if(size % 2 == 0){
                int[] izq = new int[size/2];
                int[] der = new int[size/2];
                depurador(arreglo, izq, 0, size/2);
                depurador(arreglo, der, size/2, size);
                mergeCall(izq);
                mergeCall(der);
                mezclador(arreglo, izq, der);
            }else {
                int[] izq = new int[size/2];
                int[] der = new int[(size/2) + 1];
                depurador(arreglo, izq, 0, size/2);
                depurador(arreglo, der, size/2 + 1, size);
                mergeCall(izq);
                mergeCall(der);
                mezclador(arreglo, izq, der);
            }
        }
    }
	
    static void depurador(int[] arreglo, int[] arreglo2, int inicio, int fin){
        int contador = 0;
        for(int i=inicio; i<fin; i++){
            arreglo2[contador] = arreglo[i];
            contador++;
        }	
    }
	
    static void mezclador(int[] arreglo, int[] izq, int[] der){
        int contadorIzq = 0;
        int contadorDer = 0;
        int contadorArr = 0;

        while(contadorArr < arreglo.length){
            if(contadorIzq >= izq.length){
                    arreglo[contadorArr] = der[contadorDer];
                    contadorDer++;
            }
            else if(contadorDer >= der.length){
                    arreglo[contadorArr] = izq[contadorIzq];
                    contadorIzq++;
            }
            else if(izq[contadorIzq] > der[contadorDer]){
                    arreglo[contadorArr] = der[contadorDer];
                    contadorDer++;
            }
            else{
                    arreglo[contadorArr] = izq[contadorIzq];
                    contadorIzq++;
            }
            contadorArr++;
        }
    }
}
