import java.util.Scanner;

public class BilanganTerkecil02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input nilai yang ingin dikualifikasi
        System.out.print("Masukkan angka pertama\t : ");
        int a = sc.nextInt();
        System.out.print("Masukkan angka kedua\t : ");
        int b = sc.nextInt();
        System.out.print("Masukkan angka ketiga\t : ");
        int c = sc.nextInt();

        //memroses angka dan mencari mana angka yang terkecil
        int min;
        if (a <= b && a <= c) {
            min = a;
        } else if (b <= a && b <= c) {
            min = b;
        } else {
            min = c;
        }

        //memroses angka yang sama
        int angkaSama = 0;
        if (a == min)
            angkaSama++;
        if (b == min)
            angkaSama++;
        if (c == min)
            angkaSama++;

        if (angkaSama > 1) {
            System.out.print("Terdapat beberapa angka terkecil yaitu: ");
            if (a == min) {
                System.out.print(a + " ");
            }
            if (b == min) {
                System.out.print(b + " ");
            }
            if (c == min) {
                System.out.print(c + " ");
            }
            System.out.println();
        } else {
            System.out.println("Angka terkecil adalah: " + min);
        }

    }
}