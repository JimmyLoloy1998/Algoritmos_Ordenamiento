package algoritmosOrdenamiento;

public class BurbujaMejorada {
    static int cont=0,interc=0;
    
    public static void mostrarVector(int[] A){
        for(int i=1;i<=A.length;i++){
            System.out.println(A[i-1]);
        }
    }
    
    public static void main(String[] args) {
        int A[] = {6,8,2,4,7,5}; 
        long inicio = System.nanoTime();
        bubble_sort(A); 
        long fin = System.nanoTime();
        double dif = (double)(fin - inicio)*1.0e-9;
        System.out.println("Time: "+dif);
        System.out.println("Comp:"+cont);
        System.out.println("Interc: "+interc);
    }
    
    public static void bubble_sort(int[] A){
        int i, j, aux;
        //long inicio = System.nanoTime();
        for (i = 0; i < A.length - 1; i++) {
            System.out.println("\ni: "+i);
            for (j = 0; j < A.length -i - 1; j++) {
                System.out.println("\tj: "+j);
                cont++;
                if (A[j] >  A[j + 1]) {
                    interc++;
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
                //System.out.println("" + A[j] + " ");
            }
        }
    }
}
