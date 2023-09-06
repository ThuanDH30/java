/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Scanner;
import model.Sort;
import view.SortView;

/**
 *
 * @author Bravo
 */
public class SortController {

    private Sort model;
    private SortView view;
    private Scanner scanner;

    public SortController() {
        model = new Sort(null);
        view = new SortView();
        scanner = new Scanner(System.in);
    }

    public void run() {
        view.message("nhap so phan tu cua mang: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            view.message("nhap lua chon tu 1-2");
            return;
        }

        model.ramDomArray(n);
        view.DisplayArr(model.getArr());

        int choice;
        do {
            view.message("\nchon thuat toan:");
            view.message("1. Bubble Sort");
            view.message("2. Quick Sort");
            view.message("0. Exit");
            view.message("Enter Your Choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    model.Bubble_Sort();
                    view.message("mang da sap xep Bubble Sort:");
                    view.DisplayArr(model.getArr());
                    break;
                case 2:
                    model.Quick_Sort(0, n-1);
                    view.message("mang da sap xep Quick Sort");
                    view.DisplayArr(model.getArr());
                    break;
                default:
                    view.message("khong hop le");
            }
        }while(choice!=2);
        }
}
