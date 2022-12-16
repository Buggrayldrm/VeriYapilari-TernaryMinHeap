package heap;

import java.util.Scanner;

class Heap {  // As an experiment, this heap uses 0 as the first position, not 1
   public static void Sırala(int[] a) {
        int N = a.length - 1;
        for (int i = (N - 1) / 3; i >= 0; i--)   // begin at first node with children
            sink(a, i, N);                  // sink that and all higher nodes
        /*while (N > 0) {
            exch(a, 0, N--);
            sink(a, 0, N);
        }*/
    }

    private static void sink(int[] a, int p, int N) {
        int c = 3 * p + 1;
        while (c <= N) {
            if (c < N && kontrol(a[c], a[c + 1])) {
                c++;
                if (c < N && kontrol(a[c], a[c + 1])) c++;
            } else if (c + 1 < N && kontrol(a[c], a[c + 2])) c += 2;

            if (!kontrol(a[p], a[c])) break;               // if parent >= child, stop
            exch(a, p, c);
            p = c;              // child becomes next node to look at
            c = 3 * c + 1;        // first child of that node
        }
    }

    private static boolean kontrol(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(int[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = (int) temp;
    }

}


public class TernaryHeapSort {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String giris = input.nextLine();
            String yeniGiris = giris.replaceAll(",", " ");// Stringdeki virgulleri boşluk ile değiştirir.
            String[] elemanlar = yeniGiris.split(" ");//Stringi parçalar.
            int n = elemanlar.length;
            int[] arr = new int[n];
            int sayi;

            for (int i = 0; i < n; i++) {
                sayi = Integer.parseInt(elemanlar[i]);// String olarak tanımlanmış tamsayıları Integera dönüştürür.
                arr[i] = sayi;
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            MinHeapMi.isTripleMinHeap(arr);
            Heap.Sırala(arr);// Sıralama algoritmasına gonderir.

            for (int l = 0; l < arr.length; l++) {               //Sıralanmış Listeyi Yazdırma.
                System.out.print(arr[l] + " ");
                if ((l + 1) % 10 == 0) System.out.println();
            }

        }
}

