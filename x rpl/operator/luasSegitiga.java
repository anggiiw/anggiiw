import java.util.Scanner;

public class luasSegitiga {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("masukkan alas segitiga: ");
        double alas = scanner.nextDouble();

        System.out.print("masukkan tinggi segitiga: ");
        double tinggi = scanner.nextDouble();

        double luas = 0.5 * alas * tinggi;
        System.out.println("luas segitiga tersebut adalah: " + luas);

        scanner.close();

    }

    
    
}
