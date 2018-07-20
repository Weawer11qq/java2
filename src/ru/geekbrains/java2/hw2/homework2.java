package ru.geekbrains.java2.hw2;

public class homework2 {
    public static void main(String[] args) {
        /* task1 */
        int[] arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print("BEFORE: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
        System.out.print("\nAFTER:  ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        /* task2 */
        System.out.println("");
        int j = -3;
        int[] arr1 = new int[8];
        for (int i = 0; i < arr1.length; i++) {
            j += 3;
            arr1[i] = j;
            System.out.println("arr1[" + i + "] = " + arr1[i]);
        }
        /* task3 */
        int[] arr2 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("BEFORE: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
            if (arr2[i] < 6) arr2[i] *=2;
        }
        System.out.print("\nAFTER:  ");
        for (int i : arr2) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        /* task 4 */
        int length = 5;
        int[][] arr3 = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int h = 0; h < length; h++) {
                if ((i == h) || (i == length - 1 - h)) {
                    arr3[i][h] = 1;
                }
                System.out.print(arr3[i][h] + " ");
            }
            System.out.println();
        }
    }
}


