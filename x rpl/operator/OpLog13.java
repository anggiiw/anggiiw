import java.util.Scanner;

public class OpLog13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Berikut ini manakah yang termasuk jenis operator di adalam program Java");
        System.out.println("A) Operator Indosat");
        System.out.println("B) Operator Aritmatika");
        System.out.println("C) Operator Telkomsel");
        System.out.println("D) Operator Assigment");

        System.out.print("masukkan jawaban anda (A, B, C Atau D): ");
        String answer = scanner.next();

        String jawaban1 = "B";
        String jawaban2 = "D";

        if (answer.equals(jawaban1) || answer.equals(jawaban2)) {
            System.out.println("Benar! Anda Menjawab salah satu dari pilihan jawaban yang benar.");
        } else {
            System.out.println("Salah. jawaban yang benar adalah operator aritmatika atau operator assigment.");
        }
    }
    
}
