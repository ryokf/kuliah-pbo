package org.example;

public class SinggleArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

    //with for
        System.out.println("dengan for");
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
    //with for each
        System.out.println("dengan for each");
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
