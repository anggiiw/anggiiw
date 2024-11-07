public class tugas7 {
    public static void main(String[] args) {
        boolean hasilperbadandingan;
        int a = 10;
        int b = 15;

        System.out.println("Nilai a = " + a + "\nNilai b = " + b + "\n");

        hasilperbadandingan= a == b;
        System.out.println("a == b?" + hasilperbadandingan);

        hasilperbadandingan = a !=b;
        System.out.println("Apakah a tidak sama dengan b? " + hasilperbadandingan);

        hasilperbadandingan = a > b;
        System.out.println("Apakah a lebih besar dari b? " + hasilperbadandingan);

        hasilperbadandingan = a < b;
        System.out.println("Apakah a lebih kecil dari b? " + hasilperbadandingan);

        hasilperbadandingan = a>= b;
        System.out.println("Apakah a lebih besar sama dengan b? " + hasilperbadandingan);

        hasilperbadandingan = a<= b;
        System.out.println("Apakah a lebih kecil sama dengan b? " + hasilperbadandingan);
    }
}
