import java.util.Scanner;

public class OpLog14 {
    public static void main(String[] args) {
int[] nisLulus = {1001, 1002, 1003, 1004};

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter ur NIS number: ");
        int nisUser = scanner.nextInt();

        boolean lulus = false;
        for (int nis : nisLulus) {
            if (nis == nisUser) {
                lulus = true;
            
            }
        }

        System.out.println("Lulus: " + lulus);
    }
    
}
