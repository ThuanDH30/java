/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Common.Library;
import Common.SearchAlgorithms;
import Model.Element;
import View.Menu;
import java.util.Scanner;

/**
 *
 * @author HI
 */
public class SearchingProgram extends Menu<String> {

    static String[] options = {"Linear Search", "Binary Search", "Exit"};

    protected Library library;
    protected SearchAlgorithms algorithm;
    protected int[] array;
    protected int size_array;
    Scanner sc = new Scanner(System.in);

    public SearchingProgram(Element element) {
        super("PROGRAMMING", options);
        library = new Library();
        algorithm = new SearchAlgorithms();
        size_array = element.getArraySize();
        array = element.getArray();
        //1. Enter a possitive number
        //size_array = library.getInt("Enter number of array", 1, 100);
        //2. Create array by generate random integer in range
        //array = library.createArray(size_array);
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Array");
                library.displayArray(array);
                System.out.print("The value you want to search is: ");
                int value1 = sc.nextInt();
                System.out.println("\nThe index of the value is: ");
                System.out.println(algorithm.LinearSearch(array, value1, 0, array.length));
                System.out.println("");
                break;
            case 2:
                System.out.println("Array");
                library.displayArray(array);
                System.out.print("The value you want to search is: ");
                int value2 = sc.nextInt();
                System.out.print("\nThe index of the value is: ");
                algorithm.binarySearch(array, value2, 0, array.length);
                System.out.println("");
                break;
            case 3:
                System.exit(0);
                break;
        }
    }
}
