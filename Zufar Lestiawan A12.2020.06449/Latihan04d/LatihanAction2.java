/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan02;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
class LatihanAction2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Perhitungan Biaya Pemakaian Air");
        System.out.println("===========================");
        System.out.print("Nama               : ");
        String nama = sc.nextLine();

        System.out.print("No. Pelanggan      : ");
        String noPelanggan = sc.nextLine();

        System.out.print("Pemakaian air (m3) : ");
        int pemakaian = sc.nextInt();

        int biaya = Latihan2.hitungBiaya(pemakaian);
        System.out.println("Biaya Pakai        : Rp. " + biaya);
        System.out.println("===========================");

        sc.close();
    }
}