import java.util.Scanner;

public class SeventhProject {
    public static void main(String[] args) {

        // Dərs 1 - Verilmiş array-i artan (ascending) və azalan (descending) qaydada sırala

        int[] arr = {4, 12, 1, 90, 111, 10};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("Artan sıra: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }


        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("\nAzalan sıra: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }


        // Dərs 2 - İki indeksdəki elementlərin yerini dəyişilməsi(Swap):
        //İstifadəçidən 2 indeks al və həmin indekslərdəki qiymətlərin yerini dəyiş.

        Scanner scr = new Scanner(System.in);
        System.out.println("Birinci indeks: ");
        int i = scr.nextInt();

        System.out.println("İkinci indeks: ");
        int j = scr.nextInt();

        int[] arr1 = {2, 45, 4, 76, 3, 42};

        if(i >= 0 && i < arr1.length && j >= 0 && j < arr1.length) {

            int temp = arr1[i];
            arr1[i] = arr1[j];
            arr1[j] = temp;

            System.out.println("Yeni array:");
            for(int k = 0; k < arr1.length; k++) {
                System.out.print(arr1[k] + " ");
            }
        } else {
            System.out.println("Yanlış indeks daxil edildi!");
        }



        // Dərs 3 - Array-dən yalnız cüt ədədləri saxla, tək ədədləri sil.

        // Dərs 4 - Array-də təkrarlanan elementləri tap və sil, hər element yalnız bir dəfə qalsın.

        // Dərs 5 - Array içindəki ikinci ən böyük və ikinci ən kiçik ədədi tap.

    }
}