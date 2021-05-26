package com.company;

public class Main {

    public static void main(String[] args) {
        int [] fill=new int[100];
        fillArrays(fill);




//        int[] num = {0, 1, 0, 0, 0, 0};
//        showArray(num);

/*
        for (int i = 0; i < num.length; i++) {

            if (num[i] == 0) {
                num[i] = 1;
            } else {
                num[i] = 0;
            }
        }
        showArray(num);
    */}
    public static void fillArrays(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i]=i+1;
            System.out.println(array[i]);

        }

    }

    public static void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");

    }


}
