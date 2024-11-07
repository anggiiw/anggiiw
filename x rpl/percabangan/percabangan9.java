import java.util.Scanner;

public class percabangan9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input dua angka dari pengguna 
        System.out.print("masukkan angka pertama: ");
        int angka1 = scanner.nextInt();

        System.out.print("masukkan angka kedua: ");
        int angka2 = scanner.nextInt();

        //menentukan angka terbesar
        int angkaTerbesar = (angka1 > angka2) ? angka1 : angka2;
        System.out.println("angka terbesar adalah: " + angkaTerbesar);

        //menentukan ganjil atau genap
        if (angka1 % 2 == 0) {
            System.out.println(angka1 + " adalah tipe bilangan genap.");
        } else {
            System.out.println(angka2 + " adalah bilangan ganjil.");
        }

        //menutup scanner
        scanner.close();
    }
    
}
