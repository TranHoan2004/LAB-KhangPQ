package ui;

import bo.BubbleSort;
import utils.ArrayUtils;
import utils.NumberUtils;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author khang
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Wellcome to my demo project!");
        int arrLength = NumberUtils.inputInt("Input length of Array: ", 1, Integer.MAX_VALUE);
        int arr[] = ArrayUtils.randomIntArray(arrLength, 0, 500);
        BubbleSort b = new BubbleSort(arr);
        
        b.displayCompare();
        int number = NumberUtils.inputInt("Enter number wanna search: ", Integer.MIN_VALUE, Integer.MAX_VALUE);
        b.printFoundIndex(number);
        b.displayCompare();
        b.displayOr();
    }
}