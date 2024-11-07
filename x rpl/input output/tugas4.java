import java.util.Scanner;

public class tugas4{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Nama Lengkap: ");
        String namaLengkap = input.nextLine();

        //NISN
        System.out.print("NIS Anda: ");
        int nis = input.nextInt();

        input.nextLine();

        System.out.print("Umur Anda: ");
        int umur = input.nextInt();

        System.out.println("/n========OutPut=========");
        System.out.println("Nama Anda\t: " + namaLengkap);
        System.out.println("NIS Anda\t: " + nis);
        System.out.println("Umur Anda\t: " + umur);
        input.close();
    }
    }