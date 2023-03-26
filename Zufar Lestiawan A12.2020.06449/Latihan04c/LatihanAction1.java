/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class LatihanAction1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Data Test");
    System.out.println("===========================");
    System.out.print("Nama           : ");
    String nama = scanner.nextLine();

    System.out.print("Program studi  : ");
    String programStudi = scanner.nextLine();

    System.out.print("Nilai          : ");
    int nilai = scanner.nextInt();

    String nilaiHuruf = Latihan1.konversiNilai(nilai);

    System.out.println("Nilai huruf    : " + nilaiHuruf);
    System.out.println("===========================");
    scanner.close();
  }
}
