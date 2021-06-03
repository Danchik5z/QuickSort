package com.company;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        int[] input = {56, -21, 3, 4, 139, -1342, 43, 0, 12, -233, -32};
        int low = 0;
        int high = input.length - 1;
        System.out.println("Заданный массив");
        System.out.println(Arrays.toString(input));
        quickSortRandom(input, low, high);
        System.out.println("Отсортированный массив");
        System.out.println(Arrays.toString(input));
        quickSortMax(input, low, high);
        System.out.println("Отсортированный массив");
        System.out.println(Arrays.toString(input));
        quickSortMin(input, low, high);
        System.out.println("Отсортированный массив");
        System.out.println(Arrays.toString(input));
        quickSortMedian(input, low, high);
        System.out.println("Отсортированный массив");
        System.out.println(Arrays.toString(input));
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void quickSortRandom(int[] input, int low, int high) {
        if (input.length == 0)
            if (low >= high)
                return;

        int mid = (int) (low + Math.random()*(high-low));
        int reference = input[mid];
        int i = low, j = high;
        while (i <= j) {
            while (input[i] < reference) {
                i++;
            }
            while (input[j] > reference) {
                j--;
            }
            if (i <= j) {
                swap(input, i, j);
                i++;
                j--;
            }
        }
        if (low < j)
            quickSortRandom(input, low, j);

        if (high > i)
            quickSortRandom(input, i, high);
    }
    public static void quickSortMin(int[] input, int low, int high) {
        if (input.length == 0)
            if (low >= high)
                return;
        int mid = low;
        int reference = input[mid];
        int i = low, j = high;
        while (i <= j) {
            while (input[i] < reference) {
                i++;
            }
            while (input[j] > reference) {
                j--;
            }
            if (i <= j) {
                swap(input, i, j);
                i++;
                j--;
            }
        }
        if (low < j)
            quickSortMin(input, low, j);

        if (high > i)
            quickSortMin(input, i, high);
    }
    public static void quickSortMax(int[] input, int low, int high) {
        if (input.length == 0)
            if (low >= high)
                return;
        int mid = high;
        int reference = input[mid];
        int i = low, j = high;
        while (i <= j) {
            while (input[i] < reference) {
                i++;
            }
            while (input[j] > reference) {
                j--;
            }
            if (i <= j) {
                swap(input, i, j);
                i++;
                j--;
            }
        }
        if (low < j)
            quickSortMax(input, low, j);
        if (high > i)
            quickSortMax(input, i, high);
    }
    public static void quickSortMedian(int[] input, int low, int high) {
        if (input.length == 0)
            if (low >= high)
                return;

        int middle = low + (high - low) / 2;
        int reference = input[middle];
        int i = low, j = high;
        while (i <= j) {
            while (input[i] < reference) {
                i++;
            }
            while (input[j] > reference) {
                j--;
            }
            if (i <= j) {
                swap(input, i, j);
                i++;
                j--;
            }
        }
        if (low < j)
            quickSortMedian(input, low, j);
        if (high > i)
            quickSortMedian(input, i, high);
    }
}
