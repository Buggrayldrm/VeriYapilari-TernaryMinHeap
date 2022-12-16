package Heapp;

public class MinHeapKontrol {

    public static boolean isTripleMinHeap(int[] array) {

        for (int i = 0; i < array.length * 2 / 3; i++) {

            int firstChild = 3 * i + 1;

            int secondChild = 3 * i + 2;

            int thirdChild = 3 * i + 3;


            if (firstChild < array.length && array[i] > array[firstChild]) {
                return false;
            }

            if (secondChild < array.length && array[i] > array[secondChild]) {
                return false;
            }

            if (thirdChild < array.length && array[i] > array[thirdChild]) {
                return false;
            }
        }
        return true;
    }


}
