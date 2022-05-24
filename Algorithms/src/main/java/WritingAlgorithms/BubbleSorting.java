package WritingAlgorithms;

import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args){
        int N = 5;
        int arr[] = {4, 1, 3, 9, 7};
        bubblesort(arr,N);
        System.out.println(Arrays.toString(arr));
    }
    static void bubblesort(int arr[], int N){
        int i, j;
        for(i=0;i<N-1;i++){
            for(j=0;j<N-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
