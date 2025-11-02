/*
 TODO:

1. Buatlah sebuah deklarasi variabel dengan tipe data integer yang bernama ‘StrukturBaris’? (15 Poin)
2. Buatlah sebuah deklarasi variabel dengan tipe data string yang bernama ‘KataBaru’ yang berisi kata ‘Deklarasi tipe data String’? (15 Poin)
3. Buatlah pendeklarasian array satu dimensi dengan nama ‘empatAngka’, tipe data integer, yang berisi angka (07, 10, 20, 23)? Pendeklarasian tersebut dengan menggunakan bahasa pemrograman Java. (15 Poin)
4. Buatlah pendeklarasian array dua dimensi dengan nama ‘Angka’, tipe data String, yang terdiri dari tiga baris dan tiga kolom, isi baris dan kolom berisi angka berikut (1, 3, 5, 14, 19, 20, 22, 27, 29) Pendeklarasian tersebut dengan menggunakan bahasa pemrograman Java. (20 Poin)
5. Buatlah deklarasi linked list dengan nama 'listAngka' yang memiliki list (22, 19, 44, 60, 72), Pendeklarasian tersebut dengan menggunakan bahasa pemrograman Java. (20 Poin)
*/

import java.util.Arrays;
import java.util.LinkedList;

public class DataStructure {
  public static void main(String[] args) {
    // Number 1
    int StrukturBaris = 15;
    System.out.println("StrukturBaris: " + StrukturBaris + "\n");

    // Number 2
    String KataBaru = "Deklarasi tipe data String";
    System.out.println("KataBaru: " + KataBaru + "\n");

    // Number 3
    int[] empatAngka = { 07, 10, 20, 23 };
    System.out.println("empatAngka: " + Arrays.toString(empatAngka) + "\n");

    // Number 4
    String[][] Angka = {
        { "1", "3", "5" },
        { "14", "19", "20" },
        { "22", "27", "29" }
    };
    // System.out.println("Angka: " + Arrays.deepToString(Angka));
    System.out.println("Angka: ");
    for (int i = 0; i < Angka.length; i++) {
      for (int j = 0; j < Angka[i].length; j++) {
        System.out.println(Angka[i][j]);
      }
      System.out.println();
    }
    System.out.println("\n");

    // Number 5
    LinkedList<Integer> listAngka = new LinkedList<>();
    listAngka.add(22);
    listAngka.add(19);
    listAngka.add(44);
    listAngka.add(60);
    listAngka.add(72);

    System.out.println("listAngka: " + listAngka);
  }
}