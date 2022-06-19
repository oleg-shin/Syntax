package com.syntax.class20;

public class CountDublicates {
    public static void main(String[] args) {
        int[] arr = {20, 20, 40, 50, 30, 30, 30, 30};
        System.out.println(counter1(arr));
    }
    static  int counter1 (int[] a){
        int counter =0;
        for(int b=0; b<a.length;b++){
            for(int c=b+1;c<a.length;c++)
            if(a[b]==a[c]){
                counter++;
                break;
            }
        }
        return counter;
    }
}
