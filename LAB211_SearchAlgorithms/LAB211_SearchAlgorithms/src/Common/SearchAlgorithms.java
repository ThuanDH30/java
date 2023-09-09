/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Common;

import java.util.Arrays;

/**
 *
 * @author HI
 */
public class SearchAlgorithms {

    public int LinearSearch(int[] array, int value, int left, int right) {
        for (int i = left; i < right; i++) {
            if (array[i] == value) {
                return i;
            }

        }
        return -1;
    }

    public void binarySearch(int[] array, int value, int first, int last) {
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
        int mid = (first + last) / 2;
        while (first <= last) {
            if (array[mid] < value) {
                first = mid + 1;
            } else if (array[mid] == value) {
                System.out.println("Element is found at index: " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Element is not found!");
        }
    }
    
    public void bubbleSort(int[] array){
        boolean swapped;

        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Hoán đổi arr[j] và arr[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // Nếu không có sự hoán đổi ở vòng lặp trong, mảng đã sắp xếp xong
            if (!swapped) {
                break;
            }
        }
    }

}
