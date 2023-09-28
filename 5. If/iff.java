import java.util.Scanner;

public class iff {
    public static void main(String[] args) {
        int angka;
        
        System.out.println("Program untuk Cek Angka Genap/Ganjil");
        System.out.print("Masukkan angka : ");
        
        Scanner scanner = new Scanner(System.in);
        angka = scanner.nextInt();

        String hasil = (angka % 2 == 0) ? "Angka tersebut genap" : "Angka tersebut ganjil";
        System.out.println(hasil);
    }
}
