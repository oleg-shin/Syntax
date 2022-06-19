package com.syntax.class20;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 10, 40, 40};
        System.out.println(Arrays.toString(removeDuplicates(array)));
    }

    static int[] removeDuplicates(int[] arr) {
        int[] dubl = new int[arr.length];
        int counter=0;
        for (int a = 0; a < arr.length; a++) {
            for (int b=a+1;b<arr.length;b++) {
                if(arr[a]==arr[b]){
                dubl[a] = arr[a];
                counter ++;
                }
            }
        }
    int [] arr2 = new int[arr.length-counter];
    int counter2=0;
    for(int e:arr){
        if (!isPresent(e, dubl)) {
            arr2[counter2++]=e;
        }
    }



    return arr2;

    }

    static boolean isPresent(int element, int[] arr){
        for(int e:arr){
            if(element==e){
                return true;
            }
        }
        return false;
    }
}