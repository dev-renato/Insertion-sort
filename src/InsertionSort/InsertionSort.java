
package InsertionSort;

import java.util.Arrays;

public class InsertionSort {
    
    public static void main(String[] args) {
        int []v = {1, 2, 23, 512, 1024, 12, 0, -1, 12, 33, 56, 98, 54,
        65, 87, 87, 32, 1, 333, 6565};
        
        insertionSort(v);
        System.out.println(Arrays.toString(v));
    }

    private static void insertionSort(int[] v) {
        int x, j;
        for (int i = 1; i < v.length; i++){
            x = v[i];
            j = i - 1;
            while ((j >= 0) && v[j] > x){
                v[j + 1] = v[j];
                j = j - 1;
            }
            v[j + 1] = x;
        }
    }   
}
