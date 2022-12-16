package Heapp;
public class TernaryMinHeap {
    public static void Heapify(int[] arr) {

        for (int i = arr.length * 2 / 3 - 1; i >= 0; i--) {
            int anlik = i;
            int ilkcocuk = 3 * i + 1;
            if (ilkcocuk < arr.length && arr[anlik] > arr[ilkcocuk]) {
                int temp = arr[anlik];
                arr[anlik] = arr[ilkcocuk];
                arr[ilkcocuk] = temp;

                anlik = ilkcocuk;
            }
            int secondChild = 3 * i + 2;

            if (secondChild < arr.length && arr[anlik] > arr[secondChild]) {
                int temp = arr[anlik];
                arr[anlik] = arr[secondChild];
                arr[secondChild] = temp;

                anlik = secondChild;
            }
            int thirdChild = 3 * i + 3;

            if (thirdChild < arr.length && arr[anlik] > arr[thirdChild]) {
                int temp = arr[anlik];
                arr[anlik] = arr[thirdChild];
                arr[thirdChild] = temp;
            }
        }

    }

}