package algoritmosOrdenamiento;


public class Insercion {
    static int compa=0,interca=0;
    public static void main(String[] args) {
        int A[] = {8,5,9,7,2};
        mostrarArreglo(A);
        long inicio = System.nanoTime();
        ordenarPorInsercion(A);
        long fin = System.nanoTime();
        double dif = (double)(fin - inicio)*1.0e-9;
        mostrarArreglo(A);
        System.out.println("Time: "+dif);
        System.out.println("Comp:"+compa);
        System.out.println("Interc: "+interca);
    }
    
    public static void ordenarPorInsercion(int a[]){
        int temp, i, N = a.length;
        for(int j=1;j<N;j++){
            temp = a[j];
            i = j-1;
            compa++;
            while(i >= 0 && a[i] > temp){
                interca++;
                a[i+1] = a[i];
                i--;
            }
            a[i+1] = temp;
        }
    }
    
    public static void mostrarArreglo(int a[]){
        for(int i=1;i<=a.length;i++){
            System.out.println(a[i-1]+"");
        }
        System.out.println("\n");
    }
}
