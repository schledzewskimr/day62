package Sorting;

import java.util.Arrays;

public class MainProgram {
    public static void main(String[] args){
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }
    public static int smallest(int[] array){
        int littleist = array[0];
        for(int i = 0; i<array.length; i++){
            if(littleist>array[i]){
                littleist=array[i];
            }
        }
        return littleist;
    }
    public static int indexOfSmallest(int[] array){
        int index = 0;
        int min = array[index];
        for(int i = 0; i<array.length; i++){
            if(array[i]<=min){
                min = array[i];
                index = i;
            }
        }
        return index;
    }
    public static int indexOfSmallestFrom(int[] table, int startIndex){
        int index = startIndex;
        int min = table[index];
        for(int i = index; i<table.length; i++){
            if(table[i]<=min){
                min = table[i];
                index = i;
            }
        }
        return index;
    }
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }
    public static void sort(int[] array) {
        int smallestIndex = 0;
        System.out.println(Arrays.toString((array)));
        for(int i = 0; i< array.length-2; i++){
            smallestIndex = indexOfSmallestFrom(array,i);
            swap(array, smallestIndex, i);
            System.out.println(Arrays.toString(array));
        }
    }
}
