package algoritmosOrdenamiento;


public class burbujaSimple {
    int interc,comp;
    public static void main(String[] args) {
        int vector[] = {8, 5, 9, 7, 2};
        //long inicio = System.nanoTime();
        burbujaSimple m = new burbujaSimple();
        //long fin = System.nanoTime();
        //double dif = (double)(fin - inicio)*1.0e-9;
        m.ordenarBurbujaSimple(vector);
        m.mostrarvector(vector);
        //System.out.println("Time: "+dif);
        System.out.println("comp: "+m.comp);
        System.out.println("Interc: "+m.interc);
    }

    public burbujaSimple() {
        this.interc = 0;
        this.comp = 0;
    }

    void ordenarBurbujaSimple(int v[]) {
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length - 1; j++) {
                comp++;
                if (v[j] > v[j + 1]) {
                    interc++;
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
                System.out.println(i + "  " + mostrarvector(v) + "\n");
            }
            System.out.println("*****************************");
        }
    }

    String mostrarvector(int v[]) {
        String cad = "";
        for (int i = 0; i < v.length; i++) {
            cad += " " + v[i];
        }
        return cad;
    }
}
