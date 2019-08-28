package algoritmosOrdenamiento;



class metodo3{
    int inter,comp,inter1,comp1;
    int nroIntercambio;
    public metodo3(){
        nroIntercambio=0;
    }

void ordenarBurbujaOptimizado(int v[]){
        int buffer;
        
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < i; j++) {
                comp1++;
                if(v[i] < v[j]){
                    inter1++;
                    nroIntercambio++;
                    buffer=v[j];
                    v[j]=v[i];
                    v[i]=buffer;
                }
                System.out.println(i+" "+mostrarVector(v));
                
            }
            System.out.println(" ");
            
        }
    }  

  void ordenarBurbujaSimple(int v[]){
      
        for (int i = 1; i < v.length; i++) {
            for (int j = 0; j < v.length-1; j++) {
                comp++;
                if(v[j] > v[j+1]){
                    inter++;
                    nroIntercambio++;
                    int temp=v[j];
                    v[j]=v[j+1];
                    v[j+1]=temp;
                }
                System.out.println(i+" "+mostrarVector(v)); 
            }
            System.out.println(" ");
        }
    }
 
    String mostrarVector(int v[]){
        String cad=" ";
        for (int i = 0; i < v.length; i++) {
            cad+=" "+v[i];
        }
        return cad;
    }  
}

public class ejemplo02 {
    
    public static void main(String[] args) {
        int vector[]={6,8,2,4,7,5};
        metodo3 met=new metodo3();
        
        System.out.println("Método simple");
        long inicio2=System.nanoTime();
        met.ordenarBurbujaSimple(vector);
        long final2=System.nanoTime();
        double dif2=(double)(final2-inicio2)*1.0e-9;
        System.out.println("El tiempo final es: "+dif2);
        System.out.println("interc: "+met.inter);
        System.out.println("compar: "+met.comp);
        
        System.out.println("Método mejorado");
        long inicio1=System.nanoTime();
        met.ordenarBurbujaOptimizado(vector);
        long final1=System.nanoTime();
        double dif=(double)(final1-inicio1)*1.0e-9;
        System.out.println("El tiempo final es: "+dif);
        System.out.println("interc: "+met.inter1);
        System.out.println("compar: "+met.comp1);
        //System.out.println("Intercambios: "+met.nroIntercambio);

    }
    
}