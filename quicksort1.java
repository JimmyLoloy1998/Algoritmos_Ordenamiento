package algoritmosOrdenamiento;


public class quicksort1 {
    int interca,compa;
    public static void main(String[] args) {
        int vector[] = {6,8,2,4,7,5};
        quicksort1 qs = new quicksort1();
       
        qs.quicksort(vector);
        qs.mostrarVector(vector);
        System.out.println("compa: " + qs.compa);
        System.out.println("interc: " + qs.interca);
    }
    
    public quicksort1(){
        this.interca = 0;
        this.compa = 0;
    }
    
    void quicksort(int a[]){
        int primero = 0, ultimo = 0;
        int i, j, central;
        int pivote;
        central = (primero + ultimo)/2;
        pivote = a[central];
        i = primero;
        j = ultimo;
        do{
           compa++;
        while (a[i] < pivote) i++;
        while (a[j] > pivote) j--;
            //System.out.println("pivot: "+pivote);
            if (i<=j){
                interca++;
                int tmp;
                tmp = a[i];
                a[i] = a[j];
                a[j] = tmp; /* intercambia a[i] con a[j] */
                i++;
                j--;
            }
            System.out.println(i + "  " + mostrarVector(a) + "\n");
        }while (i <= j);
        System.out.println("--> ");
            if (primero < j){
                System.out.println(j + "  " + mostrarVector(a) + "\n");
                //quicksort(a, primero, j);/* mismo proceso con sublista izqda */
                if (ultimo < i){
                    System.out.println(i + "  " + mostrarVector(a) + "\n");
                    //quicksort(a, i, ultimo); /* mismo proceso con sublista drcha */
                }
            }
        }      
    
        String mostrarVector(int a[]){
            String cad = ""; 
            for (int i = 0; i < a.length; i++){
                cad += " " + a[i];
            }
        return cad;
        }
}

