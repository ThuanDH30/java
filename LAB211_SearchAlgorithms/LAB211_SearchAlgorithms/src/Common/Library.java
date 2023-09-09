/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Common;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author HI
 */
public class Library {
    public int[] getRandomArray(int arraySize, int minValue, int maxValue) {
        int[] array = new int[arraySize];
        Random random = new Random();
        for (int i = 0; i < arraySize; i++) {
            array[i] = random.nextInt(minValue, maxValue);
        }
        return array;
    }
    
    public void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("");
//System.out.println(Arrays.toString(array));
    }
    
    public int getIntData(String mes, int minValue, int maxValue) {
        int data = 0;
        Scanner sc = new Scanner(System.in);
        if (minValue > maxValue) {
            int temp = minValue;
            minValue = maxValue;
            maxValue = temp;
        }

        while (true) {
            try {
                System.out.print(mes);
                data = sc.nextInt();
                if (data >= minValue && data <= maxValue) {
                    break;
                } else {
                    System.out.println("An error happens because the value < " + minValue + " or > " + maxValue + "\n");
                }
            } catch (Exception e) {
                System.out.println("An error happens because  the integer number format is invalid\n");
                sc.nextLine();
            }
        }
        sc.nextLine();
        return data;
    }
}
