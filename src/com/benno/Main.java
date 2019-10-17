package com.benno;
import java.util.Scanner;

    /*
        Nama        : Benno Alif Anggara
        Kelas       : IF1
        NIM         : 10118024
        Deskripsi   : Menghitung Tunjangan menggunakan metode OO
     */

public class Main {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
	    Tunjangan tunjangan = new Tunjangan();

		System.out.println("========Program Tunjangan========");

		System.out.print("Berapa gaji pokok anda sebulan?	: Rp. ");
		tunjangan.setGaji(scanner.nextDouble());
		System.out.print("Status Anda? (Menikah/Belum)\t: ");
		scanner.nextLine();
		tunjangan.setStatus(scanner.nextLine());

		System.out.println("\n========Program Tunjangan========");
		System.out.println("Gaji Pokok\t: Rp " + tunjangan.getGaji());
		System.out.println("Tunjangan\t: Rp " + tunjangan.hitungTunjangan());
		System.out.println("Total Gaji\t: Rp " + tunjangan.hitungTotal());
		System.out.println("(Developed by : Benno Alif Anggara)");

	}
}
