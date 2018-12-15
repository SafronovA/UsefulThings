package bubble_sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] mas = {1, 2, 3, 4, 6, 8, 0, 3, 5, 7, 8};
        System.out.println(Arrays.toString(BubbleSort.bubbleSort(mas)));
    }

    static int[] bubbleSort(int[] mas){
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] < mas[i+1]) {
                    isSorted = false;
                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
        return mas;
    }
}

