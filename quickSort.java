package algoritmosOrdenamiento;

public class quickSort {
    
    public static void main(String[] args) {
        
    }
    
    public void quickSort(int arr[], int inicio, int fin) {
        if (inicio < fin) {
            int partitionIndex = partition(arr, inicio, fin);
 
        quickSort(arr, inicio, partitionIndex-1);
        quickSort(arr, partitionIndex+1, fin);
        }
    }
    
    public int partition(int arr[], int inicio, int fin) {
    int pivot = arr[fin];
    int i = (inicio-1);
 
    for (int j = inicio; j < fin; j++) {
        if (arr[j] <= pivot) {
            i++;
 
            int swapTemp = arr[i];
            arr[i] = arr[j];
            arr[j] = swapTemp;
        }
    }
 
    int swapTemp = arr[i+1];
    arr[i+1] = arr[fin];
    arr[fin] = swapTemp;
 
    return i+1;
    }
}
