package com.dkit.gd2.adamhevey;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    private static Scanner keyboard = new Scanner(System.in);
    public static void main( String[] args )
    {

        int[] arr = getIntegers(5);



        printArray(arr);
        int[] sorted = sortArray(arr);
    }

    private static int[] getIntegers(int numberOfNumbers)
    {
        System.out.println("Please enter " + numberOfNumbers + " integer values");
        int[] values = new int[numberOfNumbers];

        for(int i=0; i < values.length; i++)
        {
            values[i] = keyboard.nextInt();
        }
        return values;

    }

    private static void printArray(int[] arr)
    {
        for(int number : arr)
        {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private static int[] sortArray(int[] arr)
    {
        for(int i=0; i < arr.length; i++)
        {
            if (arr[i] < arr[i+1]) {
                arr[i] = arr[i+1];
                arr[i+1] = arr[i];
            }
        }
        for(int number : arr)
        {
            System.out.print(number + " ");
        }
        System.out.println();


        return arr;
    }
}
