import java.util.Scanner;

public class input1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        // menerima inputan
        System.out.println("inputkan nama lengkap: ");
        String nama = input.nextLine();

        System.out.println("inputkan usia");
        int angka = input.nextInt();

        System.out.println("inputkan kota asal");
        String kotaAsal = input.nextLine();

        System.out.println("inputkan tinggi badan");
        double tinggiBadan = input.nextDouble();

        //output
        System.out.println("\n====Output====");
        System.out.println("Nama Lengkap : " + nama);
        System.out.println("Usia :" + angka);
        System.out.println("kotaAsal :" + kotaAsal );
        System.out.println("Tinggi Badan: "+ tinggiBadan);
    }
        
    
    
}
