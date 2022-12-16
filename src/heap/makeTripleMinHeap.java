package heap;

public class makeTripleMinHeap {


    public static void tripleMinHeapify(int[] array) {
        // Dizinin uzunluğunun 2/3'ünden büyük olan tüm düğümler için, min heap yapısını koruyun
        for (int i = array.length * 2 / 3 - 1; i >= 0; i--) {
            // Düğümün indeksi
            int current = i;
            // Düğümün ilk çocuğunun indeksi
            int firstChild = 3 * i + 1;

            // Eğer ilk çocuk varsa ve düğümün değeri, ilk çocuktan daha büyükse, yerlerini değiştirin
            if (firstChild < array.length && array[current] > array[firstChild]) {
                int temp = array[current];
                array[current] = array[firstChild];
                array[firstChild] = temp;
                // İlk çocuğun indeksini, geçerli düğüm olarak atayın
                current = firstChild;
            }

            // Düğümün ikinci çocuğunun indeksi
            int secondChild = 3 * i + 2;
            // Eğer ikinci çocuk varsa ve düğümün değeri, ikinci çocuktan daha büyükse, yerlerini değiştirin
            if (secondChild < array.length && array[current] > array[secondChild]) {
                int temp = array[current];
                array[current] = array[secondChild];
                array[secondChild] = temp;
                // İkinci çocuğun indeksini, geçerli düğüm olarak atayın
                current = secondChild;
            }

            // Düğümün üçüncü çocuğunun indeksi
            int thirdChild = 3 * i + 3;
            // Eğer üçüncü çocuk varsa ve düğümün değeri, üçüncü çocuktan daha büyükse, yerlerini değiştirin
            if (thirdChild < array.length && array[current] > array[thirdChild]) {
                int temp = array[current];
                array[current] = array[thirdChild];
                array[thirdChild] = temp;
            }
        }
    }

}