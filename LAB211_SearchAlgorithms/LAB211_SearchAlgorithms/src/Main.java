
import Common.Library;
import Controller.SearchingProgram;
import Model.Element;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HI
 */
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Element element = new Element();
        //1. Enter a possitive number
        element.setArraySize(library.getIntData("Enter number of elements in the array: ", 1, 100));
        //2. Create array by generate random integer in range
        element.setArray(library.getRandomArray(element.getArraySize(), 0, 100));
        new SearchingProgram(element).run();
    }
}
