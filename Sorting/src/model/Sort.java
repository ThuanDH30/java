/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Random;

/**
 *
 * @author Bravo
 */
public class Sort {
    private int []arr;

    public Sort(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
    
    public void ramDomArray(int n){
        arr = new int[n];
        Random rand= new Random();
        for(int i=0;i<n;i++){
            arr[i]=rand.nextInt(100);
        }
    }
    public void Bubble_Sort(){
        int n=arr.length;
        boolean swap;
        do {
            swap = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swap = true;
                }
            }
        } while (swap);
    }
    public void Quick_Sort(int left,int right){
        if(left<right){
            int index=wall(left,right);
            Quick_Sort(left,index-1);
            Quick_Sort(index+1,right);
        }
    }
    private int wall(int left, int right) {
        int pivot = arr[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;

        return i + 1;
    }
}
    
