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


class Latihan2 {

    public static int hitungBiaya(int pemakaian) {
        int biaya = 0;
        if (pemakaian <= 10) {
            biaya = pemakaian * 1000;
        } else if (pemakaian > 10 && pemakaian <= 20) {
            biaya = 10 * 1000 + (pemakaian - 10) * 2000;
        } else {
            biaya = 10 * 1000 + 10 * 2000 + (pemakaian - 20) * 5000;
        }
        return biaya;
    }
}
