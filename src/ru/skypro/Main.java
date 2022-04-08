package ru.skypro;

public class Main {

    public static void main(String[] args) {

        //Задание 1
        int[] arrayInt = new int[3];
        arrayInt[0] = 1;
        arrayInt[1] = 2;
        arrayInt[2] = 3;

        double[] arrayDouble = {1.57, 7.654, 9.986};

        long[] arrayLong = {165_164_516_148L, 516_516_846_980L, 216_546_845_045L};


        //Задание 2
        for (int i =0; i < arrayInt.length; i++){
            if (i == arrayInt.length - 1){
                System.out.println(arrayInt[i]);
            } else{
                System.out.print(arrayInt[i]+", ");
            }
        }

        for (int i = 0; i < arrayDouble.length; i++){
            if (i == arrayDouble.length - 1){
                System.out.println(arrayDouble[i]);
            } else{
                System.out.print(arrayDouble[i]+", ");
            }
        }

        for (int i = 0; i < arrayLong.length; i++){
            if (i == arrayLong.length - 1){
                System.out.println(arrayLong[i]);
            } else{
                System.out.print(arrayLong[i]+", ");
            }
        }

        //Задание 3
        for (int i = arrayInt.length-1; i >= 0; i--){
            if (i == 0){
                System.out.println(arrayInt[i]);
            } else {
                System.out.print(arrayInt[i] + ", ");
            }
        }

            for (int i = arrayDouble.length - 1; i >=0; i--){
                if (i == 0){
                    System.out.println(arrayDouble[i]);
                } else {
                    System.out.print(arrayDouble[i] + ", ");
                }
            }

        for (int i = arrayLong.length - 1; i >=0; i--){
            if (i == 0){
                System.out.println(arrayLong[i]);
            } else {
                System.out.print(arrayLong[i] + ", ");
            }
        }

        //Задание 4
        for (int i = 0; i < arrayInt.length; i++){
            if (arrayInt[i] % 2 != 0){
                arrayInt[i]+= 1;
            }
            System.out.print(arrayInt[i] + " "); // Для наглядности демонстрация массива с четными элементами
        }




    }
}
