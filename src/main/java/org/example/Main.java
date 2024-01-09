package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Напишите метод, который возвращает наиболее из двух целых чисел");

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int max = maxNumber(x, y);
        System.out.println(max);

       System.out.println("2. Напишите метод, который возвращает наиболее из двух дробных чисел");
       float a = scanner.nextFloat();
       float b = scanner.nextFloat();
       float maxFloat = maxFractionNumber(a, b);
        System.out.println(maxFloat);

        double a1 = scanner.nextFloat();
        double b1 = scanner.nextFloat();
        double maxDouble = maxDoubleNumber(a1, b1);
        System.out.println(maxDouble);

        System.out.println("3. Напишите метод, который возвращает самую длинную из трех строк \n");

        String strUno = scanner.nextLine();
        String strDos = scanner.nextLine();
        String strTres = scanner.nextLine();
        String maxStr = findMaxStr(strUno, strDos, strTres);
        System.out.println(maxStr);

         System.out.println("4. Из четырёх");
        System.out.println("5. Из пяти. Хочется как-то оптимизировать?:) это хорошо, сможем, когда изучим vararg");
        String strFirst= scanner.next();
        String strTwo  = scanner.next();
        String strFree = scanner.next();
        String strFore = scanner.next();
        String strFife = scanner.next();
        String strVarargs = strVarargsMax(strFirst, strTwo, strFree, strFore, strFife);
        System.out.println(strVarargs);

        System.out.println("6. Напишите метод, который возвращает входящую строку, делая ее ЗаБоРчИкОм");
        String str = "Удаленные программисты | Programming Store";
        String strResult = fenceStr(str);
        System.out.println(strResult);


        System.out.println("7. Напишите метод, который возвращает наибольший элемент массива\n");
         int[] numbers = new int[]{23, 34, 34, 67, 54, 23, 56, 98, 43, 8, 56, 94};
         int maxInt = intMaxNumbers(numbers);
          System.out.println("Наибольший элемент массива: " + maxInt);

       System.out.println("8. Напишите метод, который принимает три массива, а возвращает массив, сумма \n" +
                "элементов которого самая большая");
        int[] numbers1 = new int[]{27, 64, 24, 67, 54, 23, 58, 98, 33, 18, 56, 94};
        int[] numbers2 = new int[]{23, 38, 34, 87, 55, 28, 46, 96, 43, 83, 46, 95};
        int[] numbers3 = new int[]{63, 34, 35, 69, 44, 23, 56, 28, 83, 88, 57, 96};

        finMaxArray(numbers1, numbers2, numbers3);


          System.out.println("9. Напишите метод, который принимает массив чисел, а возвращает исходный \n" +
                "массив, но без отрицательных чисел");

        int[] number = new int[]{-27, 64, -24, 67, 54, -23, 58, 98, -33, 18, 56, -94};
        cleansingArray(number);

    }

    private static void cleansingArray(int[] number) {
        int[]resultNumbers = new int[number.length];
        for (int i = 0; i < number.length; i++) {
            if(number[i] > 0){
                resultNumbers[i] = number[i];
            }
        }
        int newResult[] = Arrays.stream(resultNumbers).filter(x -> x != 0).toArray();
        System.out.println(Arrays.toString(newResult));
    }


    private static void finMaxArray(int[] numbers1, int[] numbers2, int[] numbers3) {
        int sum1 = 0;
        for (int i = 0; i < numbers1.length; i++){
            sum1 += numbers1[i];

        }
        int sum2 = 0;
        for (int i = 0; i < numbers2.length; i++){
            sum2 += numbers2[i];

        }
        int sum3 = 0;
        for (int i = 0; i < numbers1.length; i++){
            sum3 += numbers3[i];

        }
        int[]maxSum = new int[]{sum1, sum2, sum3};
        int maxArray = 0;
        for (int i= 0; i < maxSum.length; i++){
            if(maxArray < maxSum[i]){
                maxArray = maxSum[i];
            }

        }
        System.out.println(maxArray);
    }

    private static int intMaxNumbers(int[] numbers) {
        int max = Arrays.stream(numbers).max().getAsInt();
        return max;
    }


    private static String fenceStr(String str) {
        char[] chars = str.toCharArray();
        int size = chars.length;
        for (int i = 0; i < size; i++)
            if (i % 2 == 0) {
                chars[i] = Character.toUpperCase(chars[i]);
            } else chars[i] = Character.toLowerCase(chars[i]);
         str = String.valueOf(chars);
        return str;
    }

    private static String strVarargsMax(String  ...strings) {
        String max = "";
        for (int i = 0; i < strings.length; i++){
            if (max.length() < strings[i].length()){
                max = strings[i];
            }
        } return max ;
    }

    private static String findMaxStr(String strUno, String strDos, String strTres) {
        String max = "";
        if (strUno.length() > strDos.length()) {
            if (strUno.length() > strTres.length()) {
                max = strUno;
            } else max = strTres;
        } else if (strDos.length() > strUno.length()) {
            if (strDos.length() > strTres.length()) {
                max = strDos;
            } else max = strTres;
           return max;
        }
        return max;
    }
    private static double maxDoubleNumber(double a, double b) {
        return Math.max(a, b);
    }

    private static float maxFractionNumber(float a, float b) {
        return Math.max(a, b);
    }

    private static int maxNumber(int x, int y) {
        return Math.max(x, y);
    }
}