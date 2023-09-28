import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nama, nim, alamat;

        System.out.print("Input nama: ");
        nama = scanner.nextLine();
        System.out.print("Input nim: ");
        nim = scanner.next();
        scanner.nextLine();  
        System.out.print("Input alamat: ");
        alamat = scanner.nextLine();

        System.out.println("Nama\t\t\t:" + nama);
        System.out.println("Nim\t\t\t:" + nim);
        System.out.println("Alamat\t\t\t:" + alamat);
    }
}
