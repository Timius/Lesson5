import java.util.Arrays;
import java.util.Random;

import static oracle.jrockit.jfr.events.Bits.swap;

/**
 * Created by User on 19.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        //Задача 1
        int[] array1 = {23, 57, 34, 34, 57, 57, 34, 57, 2, 0};
        int c = 0;
        int max = array1[0];
        for (int i = 0; i < array1.length; i++)
            if (max < array1[i]) {
                max = array1[i];
                c = 1;
            } else if (max == array1[i])
                c = c + 1;
        System.out.println("Количество максимальных элементов - " + c);
        //Задача 2
        int[] array2;
        array2 = new int[10];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = 30 + 2 * i;
        }
        System.out.println(Arrays.toString(array2));
        for (int i = 0; i < array2.length; i++) {
            int j = array2[i];
            array2[i] = array2[(array2.length - 1) - i];
            array2[(array2.length - 1) - i] = j;
            if (i == (array2.length - 1) / 2) break;
        }
        System.out.println(Arrays.toString(array2));
        //Задача 3
        Random random = new Random();
        // System.out.println("j" + j);
        int[][] array3 = new int[3][];
        //array3[1] = new int[j];
        for (int i = 0; i < array3.length; i++)
        {
            int j = random.nextInt(7);
            //System.out.println("j" + j);
            array3[i] = new int[j];
            for (j = 0; j < array3[i].length; j++) {
                int k = random.nextInt(9);
                array3[i][j] = k;
            }
        }
        System.out.println(Arrays.deepToString(array3));
        //Задача 4
        int[] array4;
        array4 = new int[11];
        array4[0] = array4[1] = 1;
        for (int q = 2; q < array4.length; q++) {
            array4[q] = array4[q - 2] + array4[q - 1];
        }
        System.out.println(Arrays.toString(array4));
        //Задача 5
        int sum = 0;
        for(int i = 000001; i <= 999999; i++) {
            int n1 = i / 100000;
            int n2 = (i / 10000) % 10;
            int n3 = (i / 1000) % 10 % 10;
            int n4 = (i / 100) % 10 % 10 % 10;
            int n5 = (i / 10) % 10 % 10 % 10 % 10;
            int n6 = i % 10 % 10 % 10 % 10;
            if (n1 + n2 + n3 == n4 + n5 + n6) {
                sum++;
            }
        }
        System.out.println("Число счастливых билетиков = " + sum);
        //Задача 6 - Решили на уроке...
    }
}
//int[] array;
//        array = new int[25];
//        for(int i = 0; i < array.length; i++) {
//        array[i] = i*i;
//         }
//
//        for(int i = 0; i < array.length; i++) {
//        System.out.print(array[i] + ", ");
//        }
//
//        System.out.println();
//
//        for(int value : array) {
//        System.out.print(value + ", ");
//        }
//
//        System.out.println();
//        System.out.println(Arrays.toString(array));
//        //System.out.println(array);
//        }
//        }