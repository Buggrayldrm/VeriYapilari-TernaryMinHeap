//02210201002-- Mehmet Buğra Yıldırım
package Heapp;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MinHeapKontrol heap_kontrol = new MinHeapKontrol();
        TernaryMinHeap heaple = new TernaryMinHeap();

        Scanner input = new Scanner(System.in);
        String yazi = input.nextLine();
        String[] arrSplit = yazi.split(",");
        int dizi[] = new int[arrSplit.length];
        int sayac=0;
        for (String arrSplit1 : arrSplit) {
            int yeni1 = Integer.parseInt(arrSplit1);
            dizi[sayac]=yeni1;
            sayac++;
        }
        if (heap_kontrol.isTripleMinHeap(dizi)) {
            System.out.println("bu liste 3'lü minheaptir");
            System.out.println(Arrays.toString(dizi));
        }
        else {
            System.out.println("bu liste 3'lü minheap değildir");
            System.out.println(Arrays.toString(dizi));
            heaple.Heapify(dizi);
            System.out.println(Arrays.toString(dizi));
        }
    }
}
