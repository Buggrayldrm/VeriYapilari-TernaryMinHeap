package heap;

public class MinHeapMi {

    public static boolean isTripleMinHeap(int[] array) {
        // Dizinin uzunluğunun 2/3'ünden küçük olan tüm düğümlerin, çocuklarından daha küçük veya eşit olup olmadıklarını kontrol edilir.
        for (int i = 0; i < array.length * 2 / 3; i++) {

            int ilkcocuk = 3 * i + 1;

            int ikincicocuk = 3 * i + 2;

            int ucuncucocuk = 3 * i + 3;

            if (ilkcocuk < array.length && array[i] > array[ilkcocuk]) {
                System.out.println("Evet Min Heapdir.");
                return false;
            }
            if (ikincicocuk < array.length && array[i] > array[ikincicocuk]) {
                System.out.println("Min Heap Değildir.");
                return false;
            }

            if (ucuncucocuk < array.length && array[i] > array[ucuncucocuk]) {
                System.out.println("Min Heap Değildir.");
                return false;

            }
        }
        // Tüm düğümlerin çocuklarından daha küçük veya eşit olduğu için, dizi bir triple min heap'tir
        System.out.println("Evet Min Heapdir.");
        return true;

    }
}
